package com.entity.view;

import com.entity.XiaoyuankazhuxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园卡注销
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("xiaoyuankazhuxiao")
public class XiaoyuankazhuxiaoView  extends XiaoyuankazhuxiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuankazhuxiaoView(){
	}
 
 	public XiaoyuankazhuxiaoView(XiaoyuankazhuxiaoEntity xiaoyuankazhuxiaoEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuankazhuxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
