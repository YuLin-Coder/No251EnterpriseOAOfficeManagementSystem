package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 员工请假
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
@TableName("yuangongqingjia")
public class YuangongqingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongqingjiaEntity() {
		
	}
	
	public YuangongqingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 请假类型
	 */
					
	private String qingjialeixing;
	
	/**
	 * 请假开始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qingjiakaishishijian;
	
	/**
	 * 请假结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qingjiajieshushijian;
	
	/**
	 * 请假原因
	 */
					
	private String qingjiayuanyin;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：请假类型
	 */
	public void setQingjialeixing(String qingjialeixing) {
		this.qingjialeixing = qingjialeixing;
	}
	/**
	 * 获取：请假类型
	 */
	public String getQingjialeixing() {
		return qingjialeixing;
	}
	/**
	 * 设置：请假开始时间
	 */
	public void setQingjiakaishishijian(Date qingjiakaishishijian) {
		this.qingjiakaishishijian = qingjiakaishishijian;
	}
	/**
	 * 获取：请假开始时间
	 */
	public Date getQingjiakaishishijian() {
		return qingjiakaishishijian;
	}
	/**
	 * 设置：请假结束时间
	 */
	public void setQingjiajieshushijian(Date qingjiajieshushijian) {
		this.qingjiajieshushijian = qingjiajieshushijian;
	}
	/**
	 * 获取：请假结束时间
	 */
	public Date getQingjiajieshushijian() {
		return qingjiajieshushijian;
	}
	/**
	 * 设置：请假原因
	 */
	public void setQingjiayuanyin(String qingjiayuanyin) {
		this.qingjiayuanyin = qingjiayuanyin;
	}
	/**
	 * 获取：请假原因
	 */
	public String getQingjiayuanyin() {
		return qingjiayuanyin;
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
