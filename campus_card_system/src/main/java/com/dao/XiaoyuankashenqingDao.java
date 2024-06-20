package com.dao;

import com.entity.XiaoyuankashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuankashenqingVO;
import com.entity.view.XiaoyuankashenqingView;


/**
 * 校园卡申请
 * 
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankashenqingDao extends BaseMapper<XiaoyuankashenqingEntity> {
	
	List<XiaoyuankashenqingVO> selectListVO(@Param("ew") Wrapper<XiaoyuankashenqingEntity> wrapper);
	
	XiaoyuankashenqingVO selectVO(@Param("ew") Wrapper<XiaoyuankashenqingEntity> wrapper);
	
	List<XiaoyuankashenqingView> selectListView(@Param("ew") Wrapper<XiaoyuankashenqingEntity> wrapper);

	List<XiaoyuankashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuankashenqingEntity> wrapper);
	
	XiaoyuankashenqingView selectView(@Param("ew") Wrapper<XiaoyuankashenqingEntity> wrapper);
	

}
