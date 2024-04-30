package com.dao;

import com.entity.YuangongqingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongqingjiaVO;
import com.entity.view.YuangongqingjiaView;


/**
 * 员工请假
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface YuangongqingjiaDao extends BaseMapper<YuangongqingjiaEntity> {
	
	List<YuangongqingjiaVO> selectListVO(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	
	YuangongqingjiaVO selectVO(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	
	List<YuangongqingjiaView> selectListView(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);

	List<YuangongqingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	
	YuangongqingjiaView selectView(@Param("ew") Wrapper<YuangongqingjiaEntity> wrapper);
	
}
