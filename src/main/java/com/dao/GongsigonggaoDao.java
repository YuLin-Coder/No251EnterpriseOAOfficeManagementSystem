package com.dao;

import com.entity.GongsigonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongsigonggaoVO;
import com.entity.view.GongsigonggaoView;


/**
 * 公司公告
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface GongsigonggaoDao extends BaseMapper<GongsigonggaoEntity> {
	
	List<GongsigonggaoVO> selectListVO(@Param("ew") Wrapper<GongsigonggaoEntity> wrapper);
	
	GongsigonggaoVO selectVO(@Param("ew") Wrapper<GongsigonggaoEntity> wrapper);
	
	List<GongsigonggaoView> selectListView(@Param("ew") Wrapper<GongsigonggaoEntity> wrapper);

	List<GongsigonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<GongsigonggaoEntity> wrapper);
	
	GongsigonggaoView selectView(@Param("ew") Wrapper<GongsigonggaoEntity> wrapper);
	
}
