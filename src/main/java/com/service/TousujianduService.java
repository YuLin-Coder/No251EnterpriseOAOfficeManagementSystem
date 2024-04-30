package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousujianduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousujianduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousujianduView;


/**
 * 投诉监督
 *
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface TousujianduService extends IService<TousujianduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousujianduVO> selectListVO(Wrapper<TousujianduEntity> wrapper);
   	
   	TousujianduVO selectVO(@Param("ew") Wrapper<TousujianduEntity> wrapper);
   	
   	List<TousujianduView> selectListView(Wrapper<TousujianduEntity> wrapper);
   	
   	TousujianduView selectView(@Param("ew") Wrapper<TousujianduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousujianduEntity> wrapper);
   	
}

