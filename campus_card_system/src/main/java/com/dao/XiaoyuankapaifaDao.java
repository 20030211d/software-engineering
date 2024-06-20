package com.dao;

import com.entity.XiaoyuankapaifaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuankapaifaVO;
import com.entity.view.XiaoyuankapaifaView;


/**
 * 校园卡派发
 * 
 * @author 
 * @email 
 * @date
 */
public interface XiaoyuankapaifaDao extends BaseMapper<XiaoyuankapaifaEntity> {
	
	List<XiaoyuankapaifaVO> selectListVO(@Param("ew") Wrapper<XiaoyuankapaifaEntity> wrapper);
	
	XiaoyuankapaifaVO selectVO(@Param("ew") Wrapper<XiaoyuankapaifaEntity> wrapper);
	
	List<XiaoyuankapaifaView> selectListView(@Param("ew") Wrapper<XiaoyuankapaifaEntity> wrapper);

	List<XiaoyuankapaifaView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuankapaifaEntity> wrapper);
	
	XiaoyuankapaifaView selectView(@Param("ew") Wrapper<XiaoyuankapaifaEntity> wrapper);
	

}
