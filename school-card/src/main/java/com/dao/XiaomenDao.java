package com.dao;

import com.entity.XiaomenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaomenVO;
import com.entity.view.XiaomenView;


/**
 * 校园服务设施
 * 
 * @author 
 * @email 
 * @date
 */
public interface XiaomenDao extends BaseMapper<XiaomenEntity> {
	
	List<XiaomenVO> selectListVO(@Param("ew") Wrapper<XiaomenEntity> wrapper);
	
	XiaomenVO selectVO(@Param("ew") Wrapper<XiaomenEntity> wrapper);
	
	List<XiaomenView> selectListView(@Param("ew") Wrapper<XiaomenEntity> wrapper);

	List<XiaomenView> selectListView(Pagination page,@Param("ew") Wrapper<XiaomenEntity> wrapper);
	
	XiaomenView selectView(@Param("ew") Wrapper<XiaomenEntity> wrapper);
	

}
