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


import com.dao.ShenqingjingfeiDao;
import com.entity.ShenqingjingfeiEntity;
import com.service.ShenqingjingfeiService;
import com.entity.vo.ShenqingjingfeiVO;
import com.entity.view.ShenqingjingfeiView;

@Service("shenqingjingfeiService")
public class ShenqingjingfeiServiceImpl extends ServiceImpl<ShenqingjingfeiDao, ShenqingjingfeiEntity> implements ShenqingjingfeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingjingfeiEntity> page = this.selectPage(
                new Query<ShenqingjingfeiEntity>(params).getPage(),
                new EntityWrapper<ShenqingjingfeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingjingfeiEntity> wrapper) {
		  Page<ShenqingjingfeiView> page =new Query<ShenqingjingfeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingjingfeiVO> selectListVO(Wrapper<ShenqingjingfeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingjingfeiVO selectVO(Wrapper<ShenqingjingfeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingjingfeiView> selectListView(Wrapper<ShenqingjingfeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingjingfeiView selectView(Wrapper<ShenqingjingfeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
