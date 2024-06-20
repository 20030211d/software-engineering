package com.entity.model;

import com.entity.XiaofeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 消费记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 
 */
public class XiaofeijiluModel  implements Serializable {
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
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 消费金额
	 */
	
	private Float xiaofeijine;
		
	/**
	 * 消费记录
	 */
	
	private String xiaofeijilu;
		
	/**
	 * 消费时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaofeishijian;
				
	
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
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：消费金额
	 */
	 
	public void setXiaofeijine(Float xiaofeijine) {
		this.xiaofeijine = xiaofeijine;
	}
	
	/**
	 * 获取：消费金额
	 */
	public Float getXiaofeijine() {
		return xiaofeijine;
	}
				
	
	/**
	 * 设置：消费记录
	 */
	 
	public void setXiaofeijilu(String xiaofeijilu) {
		this.xiaofeijilu = xiaofeijilu;
	}
	
	/**
	 * 获取：消费记录
	 */
	public String getXiaofeijilu() {
		return xiaofeijilu;
	}
				
	
	/**
	 * 设置：消费时间
	 */
	 
	public void setXiaofeishijian(Date xiaofeishijian) {
		this.xiaofeishijian = xiaofeishijian;
	}
	
	/**
	 * 获取：消费时间
	 */
	public Date getXiaofeishijian() {
		return xiaofeishijian;
	}
			
}
