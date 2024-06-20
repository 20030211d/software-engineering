package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaojiluView;


/**
 * 医疗记录
 *
 * @author 
 * @email 
 * @date
 */
public interface YiliaojiluService extends IService<YiliaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaojiluVO> selectListVO(Wrapper<YiliaojiluEntity> wrapper);
   	
   	YiliaojiluVO selectVO(@Param("ew") Wrapper<YiliaojiluEntity> wrapper);
   	
   	List<YiliaojiluView> selectListView(Wrapper<YiliaojiluEntity> wrapper);
   	
   	YiliaojiluView selectView(@Param("ew") Wrapper<YiliaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaojiluEntity> wrapper);
   	

}

