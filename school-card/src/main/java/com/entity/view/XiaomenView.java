package com.entity.view;

import com.entity.XiaomenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园服务设施
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 
 */
@TableName("xiaomen")
public class XiaomenView  extends XiaomenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaomenView(){
	}
 
 	public XiaomenView(XiaomenEntity xiaomenEntity){
 	try {
			BeanUtils.copyProperties(this, xiaomenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
