package com.dao;

import com.entity.XiaoyuankachongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuankachongzhiVO;
import com.entity.view.XiaoyuankachongzhiView;


/**
 * 校园卡充值
 * 
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankachongzhiDao extends BaseMapper<XiaoyuankachongzhiEntity> {
	
	List<XiaoyuankachongzhiVO> selectListVO(@Param("ew") Wrapper<XiaoyuankachongzhiEntity> wrapper);
	
	XiaoyuankachongzhiVO selectVO(@Param("ew") Wrapper<XiaoyuankachongzhiEntity> wrapper);
	
	List<XiaoyuankachongzhiView> selectListView(@Param("ew") Wrapper<XiaoyuankachongzhiEntity> wrapper);

	List<XiaoyuankachongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuankachongzhiEntity> wrapper);
	
	XiaoyuankachongzhiView selectView(@Param("ew") Wrapper<XiaoyuankachongzhiEntity> wrapper);
	

}
