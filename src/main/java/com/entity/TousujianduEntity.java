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
 * 投诉监督
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
@TableName("tousujiandu")
public class TousujianduEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TousujianduEntity() {
		
	}
	
	public TousujianduEntity(T t) {
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
	 * 主题
	 */
					
	private String zhuti;
	
	/**
	 * 投诉内容
	 */
					
	private String tousuneirong;
	
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
	 * 设置：主题
	 */
	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}
	/**
	 * 获取：主题
	 */
	public String getZhuti() {
		return zhuti;
	}
	/**
	 * 设置：投诉内容
	 */
	public void setTousuneirong(String tousuneirong) {
		this.tousuneirong = tousuneirong;
	}
	/**
	 * 获取：投诉内容
	 */
	public String getTousuneirong() {
		return tousuneirong;
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
