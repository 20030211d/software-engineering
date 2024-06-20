package com.entity.view;

import com.entity.XiaoyuankapaifaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园卡派发
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("xiaoyuankapaifa")
public class XiaoyuankapaifaView  extends XiaoyuankapaifaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuankapaifaView(){
	}
 
 	public XiaoyuankapaifaView(XiaoyuankapaifaEntity xiaoyuankapaifaEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuankapaifaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
