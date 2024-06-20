package com.dao;

import com.entity.XiaoyuankazhuxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuankazhuxiaoVO;
import com.entity.view.XiaoyuankazhuxiaoView;


/**
 * 校园卡注销
 * 
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankazhuxiaoDao extends BaseMapper<XiaoyuankazhuxiaoEntity> {
	
	List<XiaoyuankazhuxiaoVO> selectListVO(@Param("ew") Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
	
	XiaoyuankazhuxiaoVO selectVO(@Param("ew") Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
	
	List<XiaoyuankazhuxiaoView> selectListView(@Param("ew") Wrapper<XiaoyuankazhuxiaoEntity> wrapper);

	List<XiaoyuankazhuxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
	
	XiaoyuankazhuxiaoView selectView(@Param("ew") Wrapper<XiaoyuankazhuxiaoEntity> wrapper);
	

}
