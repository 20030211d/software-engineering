package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenjindengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenjindengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenjindengjiView;


/**
 * 门禁登记
 *
 * @author 
 * @email 
 * @date
 */
public interface MenjindengjiService extends IService<MenjindengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenjindengjiVO> selectListVO(Wrapper<MenjindengjiEntity> wrapper);
   	
   	MenjindengjiVO selectVO(@Param("ew") Wrapper<MenjindengjiEntity> wrapper);
   	
   	List<MenjindengjiView> selectListView(Wrapper<MenjindengjiEntity> wrapper);
   	
   	MenjindengjiView selectView(@Param("ew") Wrapper<MenjindengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenjindengjiEntity> wrapper);
   	

}

