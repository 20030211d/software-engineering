package com.entity.model;

import com.entity.XiaoyuankapaifaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 校园卡派发
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date
 */
public class XiaoyuankapaifaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 校园卡号
	 */
	
	private String xiaoyuankahao;
		
	/**
	 * 押金
	 */
	
	private Integer yajin;
		
	/**
	 * 派发日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date paifariqi;
				
	
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
	 * 设置：押金
	 */
	 
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}
				
	
	/**
	 * 设置：派发日期
	 */
	 
	public void setPaifariqi(Date paifariqi) {
		this.paifariqi = paifariqi;
	}
	
	/**
	 * 获取：派发日期
	 */
	public Date getPaifariqi() {
		return paifariqi;
	}
			
}
