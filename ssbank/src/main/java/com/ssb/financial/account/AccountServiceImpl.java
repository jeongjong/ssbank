package com.ssb.financial.account;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssb.common.dao.CommonDAO;

@Service("account.accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private CommonDAO dao;

	@Override
	public List<Account> listAllAccount(Map<String, Object> map) {
		List<Account> list = null;
		try {
			
		} catch (Exception e) {
		}
		return list;
	}

	@Override
	public List<Account> listOneAccount(Map<String, Object> map) {
		List<Account> list = null;
		try {

		} catch (Exception e) {
		}
		return list;
	}

	@Override
	public Account detailAccount(int accountNo) {
		Account dto = null;
		try {

		} catch (Exception e) {
		}
		return dto;
	}

	@Override
	public int insertSaveAccount(Account dto) {
		int result = 0;
		try {

		} catch (Exception e) {
		}
		return result;
	}

	@Override
	public int deleteSaveAccount(Map<String, Object> map) {
		int result = 0;
		try {

		} catch (Exception e) {
		}
		return result;
	}

	@Override
	public int deleteCheckSaveAccount(Map<String, Object> map) {
		int result = 0;
		try {

		} catch (Exception e) {
		}
		return result;
	}

}
