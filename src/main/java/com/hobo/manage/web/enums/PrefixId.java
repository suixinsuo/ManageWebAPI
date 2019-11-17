package com.hobo.manage.web.enums;

/**
 * 代理商id，商家id等生成策略
 */
public enum PrefixId {
//	cache.builderId(PrefixId.USER_ID.getPrefix(), PrefixId.USER_ID.getLength())
	// 代理商id
	AGENT_ID("A",1),
	MERCHAT_ID("M",1),
	SYS_ID("S",1),
	LOG_ID("L",1),
	// 代理商和商家用户id
	USER_ID("U",1),
	// 退款id
	REFUND_ID("R",1),
	// 公告id
	NOTICE_ID("N",1);
	// 前缀
	private String prefix;
	// 长度
	private int length;
	
	PrefixId(String prefix, int length) {
		this.prefix = prefix;
		this.length = length;
	}

	public String getPrefix() {
		return prefix;
	}

	public int getLength() {
		return length;
	}
}
