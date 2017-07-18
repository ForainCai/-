package com.zking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zking.dao.CityMapper;
import com.zking.pojo.City;
import com.zking.service.CityService;


@Service
public class CityServiceImpl implements CityService {
	
	@Resource
	private CityMapper cityMapper;

	public List<City> findAllCity(int pid) {
		return cityMapper.findAllCity(pid);
	}
	
	
	

}
