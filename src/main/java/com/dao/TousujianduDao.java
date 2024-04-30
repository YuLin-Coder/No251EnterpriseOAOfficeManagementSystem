package com.dao;

import com.entity.TousujianduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousujianduVO;
import com.entity.view.TousujianduView;


/**
 * 投诉监督
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface TousujianduDao extends BaseMapper<TousujianduEntity> {
	
	List<TousujianduVO> selectListVO(@Param("ew") Wrapper<TousujianduEntity> wrapper);
	
	TousujianduVO selectVO(@Param("ew") Wrapper<TousujianduEntity> wrapper);
	
	List<TousujianduView> selectListView(@Param("ew") Wrapper<TousujianduEntity> wrapper);

	List<TousujianduView> selectListView(Pagination page,@Param("ew") Wrapper<TousujianduEntity> wrapper);
	
	TousujianduView selectView(@Param("ew") Wrapper<TousujianduEntity> wrapper);
	
}
