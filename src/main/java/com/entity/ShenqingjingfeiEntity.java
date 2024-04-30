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
 * 申请经费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
@TableName("shenqingjingfei")
public class ShenqingjingfeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShenqingjingfeiEntity() {
		
	}
	
	public ShenqingjingfeiEntity(T t) {
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
	 * 人事账号
	 */
					
	private String renshizhanghao;
	
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
	 * 设置：人事账号
	 */
	public void setRenshizhanghao(String renshizhanghao) {
		this.renshizhanghao = renshizhanghao;
	}
	/**
	 * 获取：人事账号
	 */
	public String getRenshizhanghao() {
		return renshizhanghao;
	}
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
