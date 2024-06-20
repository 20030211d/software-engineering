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


import com.dao.XiaomenDao;
import com.entity.XiaomenEntity;
import com.service.XiaomenService;
import com.entity.vo.XiaomenVO;
import com.entity.view.XiaomenView;

@Service("xiaomenService")
public class XiaomenServiceImpl extends ServiceImpl<XiaomenDao, XiaomenEntity> implements XiaomenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaomenEntity> page = this.selectPage(
                new Query<XiaomenEntity>(params).getPage(),
                new EntityWrapper<XiaomenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaomenEntity> wrapper) {
		  Page<XiaomenView> page =new Query<XiaomenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaomenVO> selectListVO(Wrapper<XiaomenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaomenVO selectVO(Wrapper<XiaomenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaomenView> selectListView(Wrapper<XiaomenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaomenView selectView(Wrapper<XiaomenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
