package com.dao;

import com.entity.TiwenshangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiwenshangbaoVO;
import com.entity.view.TiwenshangbaoView;


/**
 * 体温上报
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface TiwenshangbaoDao extends BaseMapper<TiwenshangbaoEntity> {
	
	List<TiwenshangbaoVO> selectListVO(@Param("ew") Wrapper<TiwenshangbaoEntity> wrapper);
	
	TiwenshangbaoVO selectVO(@Param("ew") Wrapper<TiwenshangbaoEntity> wrapper);
	
	List<TiwenshangbaoView> selectListView(@Param("ew") Wrapper<TiwenshangbaoEntity> wrapper);

	List<TiwenshangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<TiwenshangbaoEntity> wrapper);
	
	TiwenshangbaoView selectView(@Param("ew") Wrapper<TiwenshangbaoEntity> wrapper);
	
}
