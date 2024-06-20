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


import com.dao.XiaoyuankazhuxiaoDao;
import com.entity.XiaoyuankazhuxiaoEntity;
import com.service.XiaoyuankazhuxiaoService;
import com.entity.vo.XiaoyuankazhuxiaoVO;
import com.entity.view.XiaoyuankazhuxiaoView;

@Service("xiaoyuankazhuxiaoService")
public class XiaoyuankazhuxiaoServiceImpl extends ServiceImpl<XiaoyuankazhuxiaoDao, XiaoyuankazhuxiaoEntity> implements XiaoyuankazhuxiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuankazhuxiaoEntity> page = this.selectPage(
                new Query<XiaoyuankazhuxiaoEntity>(params).getPage(),
                new EntityWrapper<XiaoyuankazhuxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuankazhuxiaoEntity> wrapper) {
		  Page<XiaoyuankazhuxiaoView> page =new Query<XiaoyuankazhuxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuankazhuxiaoVO> selectListVO(Wrapper<XiaoyuankazhuxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuankazhuxiaoVO selectVO(Wrapper<XiaoyuankazhuxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuankazhuxiaoView> selectListView(Wrapper<XiaoyuankazhuxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuankazhuxiaoView selectView(Wrapper<XiaoyuankazhuxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
