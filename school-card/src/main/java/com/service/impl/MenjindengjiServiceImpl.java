package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MenjindengjiDao;
import com.entity.MenjindengjiEntity;
import com.service.MenjindengjiService;
import com.entity.vo.MenjindengjiVO;
import com.entity.view.MenjindengjiView;

@Service("menjindengjiService")
public class MenjindengjiServiceImpl extends ServiceImpl<MenjindengjiDao, MenjindengjiEntity> implements MenjindengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenjindengjiEntity> page = this.selectPage(
                new Query<MenjindengjiEntity>(params).getPage(),
                new EntityWrapper<MenjindengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenjindengjiEntity> wrapper) {
		  Page<MenjindengjiView> page =new Query<MenjindengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenjindengjiVO> selectListVO(Wrapper<MenjindengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenjindengjiVO selectVO(Wrapper<MenjindengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenjindengjiView> selectListView(Wrapper<MenjindengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenjindengjiView selectView(Wrapper<MenjindengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
