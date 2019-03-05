package com.hobo.manage.web.all.merchant.request;

import java.io.Serializable;

import com.hobo.domain.merchant.Merchant;
import com.hobo.domain.merchant.MerchantUser;

public class MerchantInfo implements Serializable{

	private static final long serialVersionUID = -6688174710489430880L;
	// 商户信息
	private Merchant merchant;
	// 商户用户信息
	private MerchantUser merchantUser;
	
	public MerchantInfo(Merchant merchant, MerchantUser merchantUser) {
		this.merchant = merchant;
		this.merchantUser = merchantUser;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public MerchantUser getMerchantUser() {
		return merchantUser;
	}

	public void setMerchantUser(MerchantUser merchantUser) {
		this.merchantUser = merchantUser;
	}
}
