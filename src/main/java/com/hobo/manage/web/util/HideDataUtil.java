package com.hobo.manage.web.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName HideDataUtil
 * @Description 打码工具类
 * @Date 2019年2月27日 下午9:15:51
 */
public class HideDataUtil {
	 /**
     * 前六后四 隐藏银行卡号
     */
    public static String hideCardNo(String cardNo) {
        if (StringUtils.isBlank(cardNo)) {
            return cardNo;
        }
        if (cardNo.length() > 10) {
            //前六后四
            StringBuilder stringBuilder = new StringBuilder();
            return stringBuilder.append(cardNo.substring(0, 6)).append("****")
                    .append(cardNo.substring(cardNo.length() - 4)).toString();
        } else {
            return cardNo;
        }
    }

    /**
     * 前三后四 隐藏手机号
     */
    public static String hidePhoneNo(String phoneNo) {
        if (StringUtils.isBlank(phoneNo)) {
            return phoneNo;
        }
        if (phoneNo.length() > 7) {
        	//  前3后四
            StringBuilder stringBuilder = new StringBuilder();
            return stringBuilder.append(phoneNo.substring(0, 3)).append("****")
                    .append(phoneNo.substring(phoneNo.length() - 4)).toString();
        } else {
            return phoneNo;
        }
    }
    
    /**
     * 邮箱打码显示
     */
    public static String hideEmail(String email) {
    	// 以@为分隔符，后面几位不变，前几位若小于4位，则全部显示，否则前2后2中间隐藏
    	int index = email.indexOf(email);
    	if (index<=4){
    		return email;
		} else {
			String begin = email.substring(0, 2);
			String middle = email.substring(index-2, index);
			String end = email.substring(index);
			StringBuilder stringBuilder = new StringBuilder();
			return stringBuilder.append(begin).append("****")
					.append(middle).append(end).toString();
		}
    }
    
    public static void main(String[] args) {
		String email = "850621354@qq.com";
		int index = email.indexOf("@");
		if (index<=4){
			System.out.println(email);
		} else {
			String str = email.substring(0, 2);
			String str1 = email.substring(index-2, index);
			String end =email.substring(index);
			System.out.println(end);
		}
	}
}
