package com.dao;

import com.entity.ShenqingjingfeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingjingfeiVO;
import com.entity.view.ShenqingjingfeiView;


/**
 * 申请经费
 * 
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface ShenqingjingfeiDao extends BaseMapper<ShenqingjingfeiEntity> {
	
	List<ShenqingjingfeiVO> selectListVO(@Param("ew") Wrapper<ShenqingjingfeiEntity> wrapper);
	
	ShenqingjingfeiVO selectVO(@Param("ew") Wrapper<ShenqingjingfeiEntity> wrapper);
	
	List<ShenqingjingfeiView> selectListView(@Param("ew") Wrapper<ShenqingjingfeiEntity> wrapper);

	List<ShenqingjingfeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingjingfeiEntity> wrapper);
	
	ShenqingjingfeiView selectView(@Param("ew") Wrapper<ShenqingjingfeiEntity> wrapper);
	
}
