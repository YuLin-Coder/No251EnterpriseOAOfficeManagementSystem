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


import com.dao.TousujianduDao;
import com.entity.TousujianduEntity;
import com.service.TousujianduService;
import com.entity.vo.TousujianduVO;
import com.entity.view.TousujianduView;

@Service("tousujianduService")
public class TousujianduServiceImpl extends ServiceImpl<TousujianduDao, TousujianduEntity> implements TousujianduService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousujianduEntity> page = this.selectPage(
                new Query<TousujianduEntity>(params).getPage(),
                new EntityWrapper<TousujianduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousujianduEntity> wrapper) {
		  Page<TousujianduView> page =new Query<TousujianduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousujianduVO> selectListVO(Wrapper<TousujianduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousujianduVO selectVO(Wrapper<TousujianduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousujianduView> selectListView(Wrapper<TousujianduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousujianduView selectView(Wrapper<TousujianduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
