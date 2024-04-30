package com.entity.model;

import com.entity.ShenqingjingfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 申请经费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
public class ShenqingjingfeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 经费金额
	 */
	
	private String jingfeijine;
		
	/**
	 * 经费用途
	 */
	
	private String jingfeiyongtu;
		
	/**
	 * 相关凭证
	 */
	
	private String xiangguanpingzheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：经费金额
	 */
	 
	public void setJingfeijine(String jingfeijine) {
		this.jingfeijine = jingfeijine;
	}
	
	/**
	 * 获取：经费金额
	 */
	public String getJingfeijine() {
		return jingfeijine;
	}
				
	
	/**
	 * 设置：经费用途
	 */
	 
	public void setJingfeiyongtu(String jingfeiyongtu) {
		this.jingfeiyongtu = jingfeiyongtu;
	}
	
	/**
	 * 获取：经费用途
	 */
	public String getJingfeiyongtu() {
		return jingfeiyongtu;
	}
				
	
	/**
	 * 设置：相关凭证
	 */
	 
	public void setXiangguanpingzheng(String xiangguanpingzheng) {
		this.xiangguanpingzheng = xiangguanpingzheng;
	}
	
	/**
	 * 获取：相关凭证
	 */
	public String getXiangguanpingzheng() {
		return xiangguanpingzheng;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
