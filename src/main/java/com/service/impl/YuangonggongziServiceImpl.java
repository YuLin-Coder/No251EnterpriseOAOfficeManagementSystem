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


import com.dao.YuangonggongziDao;
import com.entity.YuangonggongziEntity;
import com.service.YuangonggongziService;
import com.entity.vo.YuangonggongziVO;
import com.entity.view.YuangonggongziView;

@Service("yuangonggongziService")
public class YuangonggongziServiceImpl extends ServiceImpl<YuangonggongziDao, YuangonggongziEntity> implements YuangonggongziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangonggongziEntity> page = this.selectPage(
                new Query<YuangonggongziEntity>(params).getPage(),
                new EntityWrapper<YuangonggongziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangonggongziEntity> wrapper) {
		  Page<YuangonggongziView> page =new Query<YuangonggongziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangonggongziVO> selectListVO(Wrapper<YuangonggongziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangonggongziVO selectVO(Wrapper<YuangonggongziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangonggongziView> selectListView(Wrapper<YuangonggongziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangonggongziView selectView(Wrapper<YuangonggongziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
