package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaomenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaomenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaomenView;


/**
 * 校门
 *
 * @author 
 * @email 
 * @date
 */
public interface XiaomenService extends IService<XiaomenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaomenVO> selectListVO(Wrapper<XiaomenEntity> wrapper);
   	
   	XiaomenVO selectVO(@Param("ew") Wrapper<XiaomenEntity> wrapper);
   	
   	List<XiaomenView> selectListView(Wrapper<XiaomenEntity> wrapper);
   	
   	XiaomenView selectView(@Param("ew") Wrapper<XiaomenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaomenEntity> wrapper);
   	

}

