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


import com.dao.GongsihuodongDao;
import com.entity.GongsihuodongEntity;
import com.service.GongsihuodongService;
import com.entity.vo.GongsihuodongVO;
import com.entity.view.GongsihuodongView;

@Service("gongsihuodongService")
public class GongsihuodongServiceImpl extends ServiceImpl<GongsihuodongDao, GongsihuodongEntity> implements GongsihuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongsihuodongEntity> page = this.selectPage(
                new Query<GongsihuodongEntity>(params).getPage(),
                new EntityWrapper<GongsihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongsihuodongEntity> wrapper) {
		  Page<GongsihuodongView> page =new Query<GongsihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongsihuodongVO> selectListVO(Wrapper<GongsihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongsihuodongVO selectVO(Wrapper<GongsihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongsihuodongView> selectListView(Wrapper<GongsihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongsihuodongView selectView(Wrapper<GongsihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
