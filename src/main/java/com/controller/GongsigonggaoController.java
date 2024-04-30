package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongsigonggaoEntity;
import com.entity.view.GongsigonggaoView;

import com.service.GongsigonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 公司公告
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
@RestController
@RequestMapping("/gongsigonggao")
public class GongsigonggaoController {
    @Autowired
    private GongsigonggaoService gongsigonggaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongsigonggaoEntity gongsigonggao, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("renshi")) {
			gongsigonggao.setRenshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongsigonggaoEntity> ew = new EntityWrapper<GongsigonggaoEntity>();
		PageUtils page = gongsigonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongsigonggao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongsigonggaoEntity gongsigonggao, HttpServletRequest request){
        EntityWrapper<GongsigonggaoEntity> ew = new EntityWrapper<GongsigonggaoEntity>();
		PageUtils page = gongsigonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongsigonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongsigonggaoEntity gongsigonggao){
       	EntityWrapper<GongsigonggaoEntity> ew = new EntityWrapper<GongsigonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongsigonggao, "gongsigonggao")); 
        return R.ok().put("data", gongsigonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongsigonggaoEntity gongsigonggao){
        EntityWrapper< GongsigonggaoEntity> ew = new EntityWrapper< GongsigonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongsigonggao, "gongsigonggao")); 
		GongsigonggaoView gongsigonggaoView =  gongsigonggaoService.selectView(ew);
		return R.ok("查询公司公告成功").put("data", gongsigonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        GongsigonggaoEntity gongsigonggao = gongsigonggaoService.selectById(id);
        return R.ok().put("data", gongsigonggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        GongsigonggaoEntity gongsigonggao = gongsigonggaoService.selectById(id);
        return R.ok().put("data", gongsigonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongsigonggaoEntity gongsigonggao, HttpServletRequest request){
    	gongsigonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongsigonggao);

        gongsigonggaoService.insert(gongsigonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongsigonggaoEntity gongsigonggao, HttpServletRequest request){
    	gongsigonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongsigonggao);

        gongsigonggaoService.insert(gongsigonggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongsigonggaoEntity gongsigonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongsigonggao);
        gongsigonggaoService.updateById(gongsigonggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongsigonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GongsigonggaoEntity> wrapper = new EntityWrapper<GongsigonggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("renshi")) {
			wrapper.eq("renshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = gongsigonggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
