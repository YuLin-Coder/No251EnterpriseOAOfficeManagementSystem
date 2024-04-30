package com.dao;

import com.entity.GongsihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongsihuodongVO;
import com.entity.view.GongsihuodongView;


/**
 * 公司活动
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface GongsihuodongDao extends BaseMapper<GongsihuodongEntity> {
	
	List<GongsihuodongVO> selectListVO(@Param("ew") Wrapper<GongsihuodongEntity> wrapper);
	
	GongsihuodongVO selectVO(@Param("ew") Wrapper<GongsihuodongEntity> wrapper);
	
	List<GongsihuodongView> selectListView(@Param("ew") Wrapper<GongsihuodongEntity> wrapper);

	List<GongsihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<GongsihuodongEntity> wrapper);
	
	GongsihuodongView selectView(@Param("ew") Wrapper<GongsihuodongEntity> wrapper);
	
}
