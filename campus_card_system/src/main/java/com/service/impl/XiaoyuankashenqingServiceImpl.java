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


import com.dao.XiaoyuankashenqingDao;
import com.entity.XiaoyuankashenqingEntity;
import com.service.XiaoyuankashenqingService;
import com.entity.vo.XiaoyuankashenqingVO;
import com.entity.view.XiaoyuankashenqingView;

@Service("xiaoyuankashenqingService")
public class XiaoyuankashenqingServiceImpl extends ServiceImpl<XiaoyuankashenqingDao, XiaoyuankashenqingEntity> implements XiaoyuankashenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuankashenqingEntity> page = this.selectPage(
                new Query<XiaoyuankashenqingEntity>(params).getPage(),
                new EntityWrapper<XiaoyuankashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuankashenqingEntity> wrapper) {
		  Page<XiaoyuankashenqingView> page =new Query<XiaoyuankashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuankashenqingVO> selectListVO(Wrapper<XiaoyuankashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuankashenqingVO selectVO(Wrapper<XiaoyuankashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuankashenqingView> selectListView(Wrapper<XiaoyuankashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuankashenqingView selectView(Wrapper<XiaoyuankashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
