package com.dao;

import com.entity.MenjindengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenjindengjiVO;
import com.entity.view.MenjindengjiView;


/**
 * 门禁登记
 * 
 * @author 
 * @email 
 * @date
 */
public interface MenjindengjiDao extends BaseMapper<MenjindengjiEntity> {
	
	List<MenjindengjiVO> selectListVO(@Param("ew") Wrapper<MenjindengjiEntity> wrapper);
	
	MenjindengjiVO selectVO(@Param("ew") Wrapper<MenjindengjiEntity> wrapper);
	
	List<MenjindengjiView> selectListView(@Param("ew") Wrapper<MenjindengjiEntity> wrapper);

	List<MenjindengjiView> selectListView(Pagination page,@Param("ew") Wrapper<MenjindengjiEntity> wrapper);
	
	MenjindengjiView selectView(@Param("ew") Wrapper<MenjindengjiEntity> wrapper);
	

}
