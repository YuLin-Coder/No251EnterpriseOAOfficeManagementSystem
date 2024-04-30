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


import com.dao.TiwenshangbaoDao;
import com.entity.TiwenshangbaoEntity;
import com.service.TiwenshangbaoService;
import com.entity.vo.TiwenshangbaoVO;
import com.entity.view.TiwenshangbaoView;

@Service("tiwenshangbaoService")
public class TiwenshangbaoServiceImpl extends ServiceImpl<TiwenshangbaoDao, TiwenshangbaoEntity> implements TiwenshangbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiwenshangbaoEntity> page = this.selectPage(
                new Query<TiwenshangbaoEntity>(params).getPage(),
                new EntityWrapper<TiwenshangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiwenshangbaoEntity> wrapper) {
		  Page<TiwenshangbaoView> page =new Query<TiwenshangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiwenshangbaoVO> selectListVO(Wrapper<TiwenshangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiwenshangbaoVO selectVO(Wrapper<TiwenshangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiwenshangbaoView> selectListView(Wrapper<TiwenshangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiwenshangbaoView selectView(Wrapper<TiwenshangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
