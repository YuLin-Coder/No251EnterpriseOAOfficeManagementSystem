package com.dao;

import com.entity.YuangonggongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangonggongziVO;
import com.entity.view.YuangonggongziView;


/**
 * 员工工资
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface YuangonggongziDao extends BaseMapper<YuangonggongziEntity> {
	
	List<YuangonggongziVO> selectListVO(@Param("ew") Wrapper<YuangonggongziEntity> wrapper);
	
	YuangonggongziVO selectVO(@Param("ew") Wrapper<YuangonggongziEntity> wrapper);
	
	List<YuangonggongziView> selectListView(@Param("ew") Wrapper<YuangonggongziEntity> wrapper);

	List<YuangonggongziView> selectListView(Pagination page,@Param("ew") Wrapper<YuangonggongziEntity> wrapper);
	
	YuangonggongziView selectView(@Param("ew") Wrapper<YuangonggongziEntity> wrapper);
	
}
