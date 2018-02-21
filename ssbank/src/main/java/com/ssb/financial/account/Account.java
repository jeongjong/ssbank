package com.ssb.financial.account;
/*
 	proCode - 상품코드
 	proCodeName - 상품코드명
 	rate - 이율
	detail - 상세설명
	
	bankCode - 지점코드
	userId - 개인계정
	userPwd - 개인계정비밀번호
	
	accountNum -계좌번호
	balance-잔액
	createAccount-계좌생성일
	lastDeal-최종거래일
	accountState-계좌상태

 */
public class Account {
	
	private String proCode,proCodeName;
	private int rate;
	private String detail;
	
	private String bankCode;
	private String userId;
	private String userPwd;
	
	private String accountNum;
	private int balance;
	private String createAccount;
	private String lastDeal;
	private String accountState;
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProCodeName() {
		return proCodeName;
	}
	public void setProCodeName(String proCodeName) {
		this.proCodeName = proCodeName;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCreateAccount() {
		return createAccount;
	}
	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}
	public String getLastDeal() {
		return lastDeal;
	}
	public void setLastDeal(String lastDeal) {
		this.lastDeal = lastDeal;
	}
	public String getAccountState() {
		return accountState;
	}
	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}
	
	
	
}
