package com.entity.model;

import com.entity.YiliaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 医疗记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date
 */
public class YiliaojiluModel  implements Serializable {
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
	 * 医疗记录
	 */
	
	private String yiliaojilu;
		
	/**
	 * 医疗费用
	 */
	
	private String yiliaofeiyong;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
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
	 * 设置：医疗记录
	 */
	 
	public void setYiliaojilu(String yiliaojilu) {
		this.yiliaojilu = yiliaojilu;
	}
	
	/**
	 * 获取：医疗记录
	 */
	public String getYiliaojilu() {
		return yiliaojilu;
	}
				
	
	/**
	 * 设置：医疗费用
	 */
	 
	public void setYiliaofeiyong(String yiliaofeiyong) {
		this.yiliaofeiyong = yiliaofeiyong;
	}
	
	/**
	 * 获取：医疗费用
	 */
	public String getYiliaofeiyong() {
		return yiliaofeiyong;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
