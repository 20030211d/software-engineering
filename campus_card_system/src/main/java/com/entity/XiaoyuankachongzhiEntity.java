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
 * 校园卡充值
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 
 */
@TableName("xiaoyuankachongzhi")
public class XiaoyuankachongzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyuankachongzhiEntity() {
		
	}
	
	public XiaoyuankachongzhiEntity(T t) {
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
	 * 充值编号
	 */
					
	private String chongzhibianhao;
	
	/**
	 * 学生学号
	 */
					
	private String xueshengxuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 校园卡号
	 */
					
	private String xiaoyuankahao;
	
	/**
	 * 充值金额
	 */
					
	private Float chongzhijine;
	
	/**
	 * 充值时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chongzhishijian;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：充值编号
	 */
	public void setChongzhibianhao(String chongzhibianhao) {
		this.chongzhibianhao = chongzhibianhao;
	}
	/**
	 * 获取：充值编号
	 */
	public String getChongzhibianhao() {
		return chongzhibianhao;
	}
	/**
	 * 设置：学生学号
	 */
	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}
	/**
	 * 获取：学生学号
	 */
	public String getXueshengxuehao() {
		return xueshengxuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：校园卡号
	 */
	public void setXiaoyuankahao(String xiaoyuankahao) {
		this.xiaoyuankahao = xiaoyuankahao;
	}
	/**
	 * 获取：校园卡号
	 */
	public String getXiaoyuankahao() {
		return xiaoyuankahao;
	}
	/**
	 * 设置：充值金额
	 */
	public void setChongzhijine(Float chongzhijine) {
		this.chongzhijine = chongzhijine;
	}
	/**
	 * 获取：充值金额
	 */
	public Float getChongzhijine() {
		return chongzhijine;
	}
	/**
	 * 设置：充值时间
	 */
	public void setChongzhishijian(Date chongzhishijian) {
		this.chongzhishijian = chongzhishijian;
	}
	/**
	 * 获取：充值时间
	 */
	public Date getChongzhishijian() {
		return chongzhishijian;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
