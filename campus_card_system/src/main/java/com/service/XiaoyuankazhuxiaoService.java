package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuankazhuxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuankazhuxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuankazhuxiaoView;


/**
 * 校园卡注销
 *
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankazhuxiaoService extends IService<XiaoyuankazhuxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuankazhuxiaoVO> selectListVO(Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
   	
   	XiaoyuankazhuxiaoVO selectVO(@Param("ew") Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
   	
   	List<XiaoyuankazhuxiaoView> selectListView(Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
   	
   	XiaoyuankazhuxiaoView selectView(@Param("ew") Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
   	

}

