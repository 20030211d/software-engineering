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


import com.dao.XiaoyuankachongzhiDao;
import com.entity.XiaoyuankachongzhiEntity;
import com.service.XiaoyuankachongzhiService;
import com.entity.vo.XiaoyuankachongzhiVO;
import com.entity.view.XiaoyuankachongzhiView;

@Service("xiaoyuankachongzhiService")
public class XiaoyuankachongzhiServiceImpl extends ServiceImpl<XiaoyuankachongzhiDao, XiaoyuankachongzhiEntity> implements XiaoyuankachongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuankachongzhiEntity> page = this.selectPage(
                new Query<XiaoyuankachongzhiEntity>(params).getPage(),
                new EntityWrapper<XiaoyuankachongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuankachongzhiEntity> wrapper) {
		  Page<XiaoyuankachongzhiView> page =new Query<XiaoyuankachongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuankachongzhiVO> selectListVO(Wrapper<XiaoyuankachongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuankachongzhiVO selectVO(Wrapper<XiaoyuankachongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuankachongzhiView> selectListView(Wrapper<XiaoyuankachongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuankachongzhiView selectView(Wrapper<XiaoyuankachongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
