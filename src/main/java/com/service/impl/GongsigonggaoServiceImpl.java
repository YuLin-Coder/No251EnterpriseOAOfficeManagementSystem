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


import com.dao.GongsigonggaoDao;
import com.entity.GongsigonggaoEntity;
import com.service.GongsigonggaoService;
import com.entity.vo.GongsigonggaoVO;
import com.entity.view.GongsigonggaoView;

@Service("gongsigonggaoService")
public class GongsigonggaoServiceImpl extends ServiceImpl<GongsigonggaoDao, GongsigonggaoEntity> implements GongsigonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongsigonggaoEntity> page = this.selectPage(
                new Query<GongsigonggaoEntity>(params).getPage(),
                new EntityWrapper<GongsigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongsigonggaoEntity> wrapper) {
		  Page<GongsigonggaoView> page =new Query<GongsigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongsigonggaoVO> selectListVO(Wrapper<GongsigonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongsigonggaoVO selectVO(Wrapper<GongsigonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongsigonggaoView> selectListView(Wrapper<GongsigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongsigonggaoView selectView(Wrapper<GongsigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
