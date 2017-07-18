package com.zking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.ProvinceMapper;
import com.zking.pojo.Province;
import com.zking.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService {
	
	@Resource
	private ProvinceMapper  provinceMapper;

	public List<Province> findAllProvince() {
		
		return provinceMapper.findAllProvince();
	}

}
