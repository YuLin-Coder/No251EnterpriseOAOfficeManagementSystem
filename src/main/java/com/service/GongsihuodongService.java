package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongsihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongsihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongsihuodongView;


/**
 * 公司活动
 *
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface GongsihuodongService extends IService<GongsihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongsihuodongVO> selectListVO(Wrapper<GongsihuodongEntity> wrapper);
   	
   	GongsihuodongVO selectVO(@Param("ew") Wrapper<GongsihuodongEntity> wrapper);
   	
   	List<GongsihuodongView> selectListView(Wrapper<GongsihuodongEntity> wrapper);
   	
   	GongsihuodongView selectView(@Param("ew") Wrapper<GongsihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongsihuodongEntity> wrapper);
   	
}

