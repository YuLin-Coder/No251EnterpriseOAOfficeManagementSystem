package com.entity.view;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工工资
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
@TableName("yuangonggongzi")
public class YuangonggongziView  extends YuangonggongziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangonggongziView(){
	}
 
 	public YuangonggongziView(YuangonggongziEntity yuangonggongziEntity){
 	try {
			BeanUtils.copyProperties(this, yuangonggongziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
