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


import com.dao.ShebeishenqingDao;
import com.entity.ShebeishenqingEntity;
import com.service.ShebeishenqingService;
import com.entity.vo.ShebeishenqingVO;
import com.entity.view.ShebeishenqingView;

@Service("shebeishenqingService")
public class ShebeishenqingServiceImpl extends ServiceImpl<ShebeishenqingDao, ShebeishenqingEntity> implements ShebeishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeishenqingEntity> page = this.selectPage(
                new Query<ShebeishenqingEntity>(params).getPage(),
                new EntityWrapper<ShebeishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeishenqingEntity> wrapper) {
		  Page<ShebeishenqingView> page =new Query<ShebeishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeishenqingVO> selectListVO(Wrapper<ShebeishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeishenqingVO selectVO(Wrapper<ShebeishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeishenqingView> selectListView(Wrapper<ShebeishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeishenqingView selectView(Wrapper<ShebeishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
