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


import com.dao.XiaoyuankapaifaDao;
import com.entity.XiaoyuankapaifaEntity;
import com.service.XiaoyuankapaifaService;
import com.entity.vo.XiaoyuankapaifaVO;
import com.entity.view.XiaoyuankapaifaView;

@Service("xiaoyuankapaifaService")
public class XiaoyuankapaifaServiceImpl extends ServiceImpl<XiaoyuankapaifaDao, XiaoyuankapaifaEntity> implements XiaoyuankapaifaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuankapaifaEntity> page = this.selectPage(
                new Query<XiaoyuankapaifaEntity>(params).getPage(),
                new EntityWrapper<XiaoyuankapaifaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuankapaifaEntity> wrapper) {
		  Page<XiaoyuankapaifaView> page =new Query<XiaoyuankapaifaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuankapaifaVO> selectListVO(Wrapper<XiaoyuankapaifaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuankapaifaVO selectVO(Wrapper<XiaoyuankapaifaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuankapaifaView> selectListView(Wrapper<XiaoyuankapaifaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuankapaifaView selectView(Wrapper<XiaoyuankapaifaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
