package com.entity.view;

import com.entity.ShenqingjingfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请经费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
@TableName("shenqingjingfei")
public class ShenqingjingfeiView  extends ShenqingjingfeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingjingfeiView(){
	}
 
 	public ShenqingjingfeiView(ShenqingjingfeiEntity shenqingjingfeiEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingjingfeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
