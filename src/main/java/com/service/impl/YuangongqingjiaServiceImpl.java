package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongqingjiaDao;
import com.entity.YuangongqingjiaEntity;
import com.service.YuangongqingjiaService;
import com.entity.vo.YuangongqingjiaVO;
import com.entity.view.YuangongqingjiaView;

@Service("yuangongqingjiaService")
public class YuangongqingjiaServiceImpl extends ServiceImpl<YuangongqingjiaDao, YuangongqingjiaEntity> implements YuangongqingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongqingjiaEntity> page = this.selectPage(
                new Query<YuangongqingjiaEntity>(params).getPage(),
                new EntityWrapper<YuangongqingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongqingjiaEntity> wrapper) {
		  Page<YuangongqingjiaView> page =new Query<YuangongqingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongqingjiaVO> selectListVO(Wrapper<YuangongqingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongqingjiaVO selectVO(Wrapper<YuangongqingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongqingjiaView> selectListView(Wrapper<YuangongqingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongqingjiaView selectView(Wrapper<YuangongqingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
