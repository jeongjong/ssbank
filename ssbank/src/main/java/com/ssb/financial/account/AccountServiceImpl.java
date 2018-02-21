package com.ssb.financial.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssb.common.dao.CommonDAO;

@Service("account.accountServiceImpl")
public class AccountServiceImpl {
	
	@Autowired
	private CommonDAO dao;

}
