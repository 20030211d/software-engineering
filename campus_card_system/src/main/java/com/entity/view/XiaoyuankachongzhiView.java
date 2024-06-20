package com.entity.view;

import com.entity.XiaoyuankachongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园卡充值
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("xiaoyuankachongzhi")
public class XiaoyuankachongzhiView  extends XiaoyuankachongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuankachongzhiView(){
	}
 
 	public XiaoyuankachongzhiView(XiaoyuankachongzhiEntity xiaoyuankachongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuankachongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
