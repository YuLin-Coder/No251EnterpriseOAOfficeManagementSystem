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
 * 员工工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-08 19:02:11
 */
@TableName("yuangonggongzi")
public class YuangonggongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangonggongziEntity() {
		
	}
	
	public YuangonggongziEntity(T t) {
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
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 年份
	 */
					
	private String nianfen;
	
	/**
	 * 月份
	 */
					
	private String yuefen;
	
	/**
	 * 基本工资
	 */
					
	private String jibengongzi;
	
	/**
	 * 提成
	 */
					
	private String ticheng;
	
	/**
	 * 补贴
	 */
					
	private String butie;
	
	/**
	 * 奖金
	 */
					
	private String jiangjin;
	
	/**
	 * 考勤扣款
	 */
					
	private String kaoqinkoukuan;
	
	/**
	 * 五险一金
	 */
					
	private String wuxianyijin;
	
	/**
	 * 实发工资
	 */
					
	private String shifagongzi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 人事账号
	 */
					
	private String renshizhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	 * 设置：年份
	 */
	public void setNianfen(String nianfen) {
		this.nianfen = nianfen;
	}
	/**
	 * 获取：年份
	 */
	public String getNianfen() {
		return nianfen;
	}
	/**
	 * 设置：月份
	 */
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
	/**
	 * 设置：基本工资
	 */
	public void setJibengongzi(String jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	/**
	 * 获取：基本工资
	 */
	public String getJibengongzi() {
		return jibengongzi;
	}
	/**
	 * 设置：提成
	 */
	public void setTicheng(String ticheng) {
		this.ticheng = ticheng;
	}
	/**
	 * 获取：提成
	 */
	public String getTicheng() {
		return ticheng;
	}
	/**
	 * 设置：补贴
	 */
	public void setButie(String butie) {
		this.butie = butie;
	}
	/**
	 * 获取：补贴
	 */
	public String getButie() {
		return butie;
	}
	/**
	 * 设置：奖金
	 */
	public void setJiangjin(String jiangjin) {
		this.jiangjin = jiangjin;
	}
	/**
	 * 获取：奖金
	 */
	public String getJiangjin() {
		return jiangjin;
	}
	/**
	 * 设置：考勤扣款
	 */
	public void setKaoqinkoukuan(String kaoqinkoukuan) {
		this.kaoqinkoukuan = kaoqinkoukuan;
	}
	/**
	 * 获取：考勤扣款
	 */
	public String getKaoqinkoukuan() {
		return kaoqinkoukuan;
	}
	/**
	 * 设置：五险一金
	 */
	public void setWuxianyijin(String wuxianyijin) {
		this.wuxianyijin = wuxianyijin;
	}
	/**
	 * 获取：五险一金
	 */
	public String getWuxianyijin() {
		return wuxianyijin;
	}
	/**
	 * 设置：实发工资
	 */
	public void setShifagongzi(String shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	/**
	 * 获取：实发工资
	 */
	public String getShifagongzi() {
		return shifagongzi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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

}
