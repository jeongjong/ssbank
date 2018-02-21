package com.ssb.financial.counsel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssb.common.dao.CommonDAO;

@Service("counsel.counselServiceImpl")
public class CounselServiceImpl {
	
	@Autowired
	private CommonDAO dao;

}
