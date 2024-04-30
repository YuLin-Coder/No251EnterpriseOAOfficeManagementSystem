package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshiView;


/**
 * 人事
 *
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface RenshiService extends IService<RenshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenshiVO> selectListVO(Wrapper<RenshiEntity> wrapper);
   	
   	RenshiVO selectVO(@Param("ew") Wrapper<RenshiEntity> wrapper);
   	
   	List<RenshiView> selectListView(Wrapper<RenshiEntity> wrapper);
   	
   	RenshiView selectView(@Param("ew") Wrapper<RenshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenshiEntity> wrapper);
   	
}

