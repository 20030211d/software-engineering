package com.dao;

import com.entity.YiliaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaojiluVO;
import com.entity.view.YiliaojiluView;


/**
 * 医疗记录
 * 
 * @author 
 * @email 
 * @date
 */
public interface YiliaojiluDao extends BaseMapper<YiliaojiluEntity> {
	
	List<YiliaojiluVO> selectListVO(@Param("ew") Wrapper<YiliaojiluEntity> wrapper);
	
	YiliaojiluVO selectVO(@Param("ew") Wrapper<YiliaojiluEntity> wrapper);
	
	List<YiliaojiluView> selectListView(@Param("ew") Wrapper<YiliaojiluEntity> wrapper);

	List<YiliaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaojiluEntity> wrapper);
	
	YiliaojiluView selectView(@Param("ew") Wrapper<YiliaojiluEntity> wrapper);
	

}
