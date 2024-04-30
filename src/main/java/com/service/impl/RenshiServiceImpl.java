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


import com.dao.RenshiDao;
import com.entity.RenshiEntity;
import com.service.RenshiService;
import com.entity.vo.RenshiVO;
import com.entity.view.RenshiView;

@Service("renshiService")
public class RenshiServiceImpl extends ServiceImpl<RenshiDao, RenshiEntity> implements RenshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenshiEntity> page = this.selectPage(
                new Query<RenshiEntity>(params).getPage(),
                new EntityWrapper<RenshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenshiEntity> wrapper) {
		  Page<RenshiView> page =new Query<RenshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenshiVO> selectListVO(Wrapper<RenshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenshiVO selectVO(Wrapper<RenshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenshiView> selectListView(Wrapper<RenshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenshiView selectView(Wrapper<RenshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
