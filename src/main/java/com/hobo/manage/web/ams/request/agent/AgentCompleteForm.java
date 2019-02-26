package com.hobo.manage.web.ams.request.agent;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.ams.request.BaseForm;

/**
 * @ClassName AgentCompleteForm
 * @Description 完善代理商信息Form
 * @Author jpg
 * @Date 2019年2月22日 下午3:12:16
 */
public class AgentCompleteForm extends BaseForm {

	private static final long serialVersionUID = 5169357764463958566L;
	// 企业性质 0：企业 1：个人
	@NotBlank(message="代理商性质不能为空")
	@Pattern(regexp = "[01]", message = "代理商性质值只能为0或1")
	private String isEnterprise;
	// 名称
	@NotBlank(message="代理商名称不能为空")
	@Size(min=1, max=50, message="代理商名称1到50位之间")
    private String name;     
    // 法定代表人
	@NotBlank(message="法定代表人不能为空")
	@Size(min=1, max=50, message="法定代表人长度1到20位之间")
 	private String corporation;
    // 法定代表人身份证号
	@NotBlank(message="法定代表人身份证号不能为空")
	@Size(min=1, max=30, message="法定代表人身份证号长度1到20位之间")
    private String corporationIdCard;
    // 工商营业执照图片，存储相对路径
    private String businessLicensePic;
    // 工商营业执照号
    private String businessLicenseCode;
    // 法定代表人身份证号图片 的服务器上的相对路径
    private String corporationIdCardPic;
    // 公司地址
    private String companyAddress;
    
    // 银行代码
    @NotBlank(message="银行代码不能为空")
    @Size(min=1, max=10, message="银行代码1到10位之间")
    private String bankCode;
    // 银行名称
    @NotBlank(message="银行名称不能为空")
    @Size(min=1, max=20, message="银行名称1到20位之间")
    private String bankName;
    // 支行号（联行号）
    private String unitebankId;
    // 支行名称（联行名称）
    private String bankSubbranch;
    // 银行账号
    @NotBlank(message="银行账号不能为空")
    @Size(min=1, max=40, message="银行账号1到40位之间")
    private String bankAccount;
    // 户名
    @NotBlank(message="户名不能为空")
	@Size(min=1, max=50, message="户名1到50位之间")
    private String bankAccountName;
    
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getUnitebankId() {
		return unitebankId;
	}
	public void setUnitebankId(String unitebankId) {
		this.unitebankId = unitebankId;
	}
	public String getBankSubbranch() {
		return bankSubbranch;
	}
	public void setBankSubbranch(String bankSubbranch) {
		this.bankSubbranch = bankSubbranch;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankAccountName() {
		return bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	public String getIsEnterprise() {
		return isEnterprise;
	}
	public void setIsEnterprise(String isEnterprise) {
		this.isEnterprise = isEnterprise;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCorporation() {
		return corporation;
	}
	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}
	public String getCorporationIdCard() {
		return corporationIdCard;
	}
	public void setCorporationIdCard(String corporationIdCard) {
		this.corporationIdCard = corporationIdCard;
	}
	public String getBusinessLicensePic() {
		return businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}
	public String getBusinessLicenseCode() {
		return businessLicenseCode;
	}
	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}
	public String getCorporationIdCardPic() {
		return corporationIdCardPic;
	}
	public void setCorporationIdCardPic(String corporationIdCardPic) {
		this.corporationIdCardPic = corporationIdCardPic;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
}
