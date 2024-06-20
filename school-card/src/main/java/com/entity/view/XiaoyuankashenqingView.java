package com.entity.view;

import com.entity.XiaoyuankashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园卡申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("xiaoyuankashenqing")
public class XiaoyuankashenqingView  extends XiaoyuankashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuankashenqingView(){
	}
 
 	public XiaoyuankashenqingView(XiaoyuankashenqingEntity xiaoyuankashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuankashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
