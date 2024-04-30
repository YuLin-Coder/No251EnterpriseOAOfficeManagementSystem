package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingjingfeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingjingfeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingjingfeiView;


/**
 * 申请经费
 *
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface ShenqingjingfeiService extends IService<ShenqingjingfeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingjingfeiVO> selectListVO(Wrapper<ShenqingjingfeiEntity> wrapper);
   	
   	ShenqingjingfeiVO selectVO(@Param("ew") Wrapper<ShenqingjingfeiEntity> wrapper);
   	
   	List<ShenqingjingfeiView> selectListView(Wrapper<ShenqingjingfeiEntity> wrapper);
   	
   	ShenqingjingfeiView selectView(@Param("ew") Wrapper<ShenqingjingfeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingjingfeiEntity> wrapper);
   	
}

