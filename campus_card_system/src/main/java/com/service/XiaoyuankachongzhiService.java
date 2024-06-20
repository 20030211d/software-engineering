package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuankachongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuankachongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuankachongzhiView;


/**
 * 校园卡充值
 *
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankachongzhiService extends IService<XiaoyuankachongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuankachongzhiVO> selectListVO(Wrapper<XiaoyuankachongzhiEntity> wrapper);
   	
   	XiaoyuankachongzhiVO selectVO(@Param("ew") Wrapper<XiaoyuankachongzhiEntity> wrapper);
   	
   	List<XiaoyuankachongzhiView> selectListView(Wrapper<XiaoyuankachongzhiEntity> wrapper);
   	
   	XiaoyuankachongzhiView selectView(@Param("ew") Wrapper<XiaoyuankachongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuankachongzhiEntity> wrapper);
   	

}

