package com.dao;

import com.entity.RenshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenshiVO;
import com.entity.view.RenshiView;


/**
 * 人事
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface RenshiDao extends BaseMapper<RenshiEntity> {
	
	List<RenshiVO> selectListVO(@Param("ew") Wrapper<RenshiEntity> wrapper);
	
	RenshiVO selectVO(@Param("ew") Wrapper<RenshiEntity> wrapper);
	
	List<RenshiView> selectListView(@Param("ew") Wrapper<RenshiEntity> wrapper);

	List<RenshiView> selectListView(Pagination page,@Param("ew") Wrapper<RenshiEntity> wrapper);
	
	RenshiView selectView(@Param("ew") Wrapper<RenshiEntity> wrapper);
	
}
