package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangonggongziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangonggongziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangonggongziView;


/**
 * 员工工资
 *
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public interface YuangonggongziService extends IService<YuangonggongziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangonggongziVO> selectListVO(Wrapper<YuangonggongziEntity> wrapper);
   	
   	YuangonggongziVO selectVO(@Param("ew") Wrapper<YuangonggongziEntity> wrapper);
   	
   	List<YuangonggongziView> selectListView(Wrapper<YuangonggongziEntity> wrapper);
   	
   	YuangonggongziView selectView(@Param("ew") Wrapper<YuangonggongziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangonggongziEntity> wrapper);
   	
}

