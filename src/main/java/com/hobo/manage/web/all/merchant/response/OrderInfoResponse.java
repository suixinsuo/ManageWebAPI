 package com.hobo.manage.web.all.merchant.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

 /**
 * @ClassName: OrderInfoResponse
 * @Description: 订单response
 * @date 2019年3月9日
 *
 */
public class OrderInfoResponse implements Serializable{

	private static final long serialVersionUID = 5030450967223116567L;
	// 订单号
	private String orderId;
	// 下单时间
	private Date orderDate;
	// 商户订单号
	private String merchantOrderId;
	// 支付类型
	private String businessId;
	// 订单金额
	private BigDecimal orderMoney;
	// 付款状态
	private String paymentStatus;
	// 付款时间
	private Date payDate;
	// 手续费
	private BigDecimal charges;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

	public String getMerchantOrderId() {
		return merchantOrderId;
	}

	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public BigDecimal getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public BigDecimal getCharges() {
		return charges;
	}

	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}

}
