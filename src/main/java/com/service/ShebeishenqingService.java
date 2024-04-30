package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeishenqingView;


/**
 * 设备申请
 *
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface ShebeishenqingService extends IService<ShebeishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeishenqingVO> selectListVO(Wrapper<ShebeishenqingEntity> wrapper);
   	
   	ShebeishenqingVO selectVO(@Param("ew") Wrapper<ShebeishenqingEntity> wrapper);
   	
   	List<ShebeishenqingView> selectListView(Wrapper<ShebeishenqingEntity> wrapper);
   	
   	ShebeishenqingView selectView(@Param("ew") Wrapper<ShebeishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeishenqingEntity> wrapper);
   	
}

