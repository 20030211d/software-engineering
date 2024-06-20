package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuankashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuankashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuankashenqingView;


/**
 * 校园卡申请
 *
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankashenqingService extends IService<XiaoyuankashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuankashenqingVO> selectListVO(Wrapper<XiaoyuankashenqingEntity> wrapper);
   	
   	XiaoyuankashenqingVO selectVO(@Param("ew") Wrapper<XiaoyuankashenqingEntity> wrapper);
   	
   	List<XiaoyuankashenqingView> selectListView(Wrapper<XiaoyuankashenqingEntity> wrapper);
   	
   	XiaoyuankashenqingView selectView(@Param("ew") Wrapper<XiaoyuankashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuankashenqingEntity> wrapper);
   	

}

