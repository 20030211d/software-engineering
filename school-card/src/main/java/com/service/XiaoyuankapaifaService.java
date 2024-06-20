package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuankapaifaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuankapaifaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuankapaifaView;


/**
 * 校园卡派发
 *
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankapaifaService extends IService<XiaoyuankapaifaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuankapaifaVO> selectListVO(Wrapper<XiaoyuankapaifaEntity> wrapper);
   	
   	XiaoyuankapaifaVO selectVO(@Param("ew") Wrapper<XiaoyuankapaifaEntity> wrapper);
   	
   	List<XiaoyuankapaifaView> selectListView(Wrapper<XiaoyuankapaifaEntity> wrapper);
   	
   	XiaoyuankapaifaView selectView(@Param("ew") Wrapper<XiaoyuankapaifaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuankapaifaEntity> wrapper);
   	

}

