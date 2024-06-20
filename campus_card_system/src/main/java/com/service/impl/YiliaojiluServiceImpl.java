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


import com.dao.YiliaojiluDao;
import com.entity.YiliaojiluEntity;
import com.service.YiliaojiluService;
import com.entity.vo.YiliaojiluVO;
import com.entity.view.YiliaojiluView;

@Service("yiliaojiluService")
public class YiliaojiluServiceImpl extends ServiceImpl<YiliaojiluDao, YiliaojiluEntity> implements YiliaojiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaojiluEntity> page = this.selectPage(
                new Query<YiliaojiluEntity>(params).getPage(),
                new EntityWrapper<YiliaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaojiluEntity> wrapper) {
		  Page<YiliaojiluView> page =new Query<YiliaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaojiluVO> selectListVO(Wrapper<YiliaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaojiluVO selectVO(Wrapper<YiliaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaojiluView> selectListView(Wrapper<YiliaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaojiluView selectView(Wrapper<YiliaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
