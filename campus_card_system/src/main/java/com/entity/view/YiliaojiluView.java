package com.entity.view;

import com.entity.YiliaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医疗记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("yiliaojilu")
public class YiliaojiluView  extends YiliaojiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiliaojiluView(){
	}
 
 	public YiliaojiluView(YiliaojiluEntity yiliaojiluEntity){
 	try {
			BeanUtils.copyProperties(this, yiliaojiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
