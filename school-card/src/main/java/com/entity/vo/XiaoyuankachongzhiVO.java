package com.entity.vo;

import com.entity.XiaoyuankachongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 校园卡充值
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date
 */
public class XiaoyuankachongzhiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
