package com.zking.service;

import com.zking.enetity.Paimai.PaimaiGoodInfo;

public interface PaimaiService {
	public PaimaiGoodInfo getGoodInfo(Integer buylist_id) throws NullPointerException;
}
