package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiwenshangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiwenshangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiwenshangbaoView;


/**
 * 体温上报
 *
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface TiwenshangbaoService extends IService<TiwenshangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiwenshangbaoVO> selectListVO(Wrapper<TiwenshangbaoEntity> wrapper);
   	
   	TiwenshangbaoVO selectVO(@Param("ew") Wrapper<TiwenshangbaoEntity> wrapper);
   	
   	List<TiwenshangbaoView> selectListView(Wrapper<TiwenshangbaoEntity> wrapper);
   	
   	TiwenshangbaoView selectView(@Param("ew") Wrapper<TiwenshangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiwenshangbaoEntity> wrapper);
   	
}

