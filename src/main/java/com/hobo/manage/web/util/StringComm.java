package com.hobo.manage.web.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringComm {
	public static final char[] NUMBER = new char[] { '1', '2', '3', '4', '5',
			'6', '7', '8', '9', '0' };
	
	public static final char[] ALPHEBIC_LOWER = new char[] { 'a', 'b', 'c',
	'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
	'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	
	public static final char[] ALPHEBIC_AND_NUMBER_UPPER = new char[] { 'A',
		'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
		'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1',
		'2', '3', '4', '5', '6', '7', '8', '9', '0' };
	
	public static final char[] ALPHEBIC_AND_NUMBER_LOWER = new char[] { 'a',
	'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
	'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1',
	'2', '3', '4', '5', '6', '7', '8', '9', '0' };
	
	static int[] weight={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};    //十七位数字本体码权重
	static String[] validate={ "1","0","X","9","8","7","6","5","4","3","2"};    //mod11,对应校验码字符值    
    
	public static final String[] picExtensions ={"jpg", "jpeg", "gif", "png", "bmp"};
	
    public static String getValidateCode(String id17){
        int sum=0;
        int mode=0;
        for(int i=0;i<id17.length();i++){
            sum=sum+Integer.parseInt(String.valueOf(id17.charAt(i)))*weight[i];
        }
        mode=sum%11;
        return validate[mode];
    }
    
	public static String getRandomUpperStr(int strLength) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strLength; i++) {
			int j = (int) (Math.random() * ALPHEBIC_AND_NUMBER_UPPER.length);
			sb.append(ALPHEBIC_AND_NUMBER_UPPER[j]);
		}
		return sb.toString();
	}
	
	public static String encryChineseFirstName(String chineseName){
		String result = chineseName;
		Pattern p = Pattern.compile("([^u4E00-u9FA5]{1})([^u4E00-u9FA5]*)");
		Matcher m = p.matcher(chineseName);
		if(m.find() && m.groupCount() == 2){
			result = m.group(1).replaceAll(".", "*") + m.group(2);
		}
		return result;
	}
	public static String encryChineseName(String chineseName){
		String result = chineseName;
		Pattern p = Pattern.compile("([^u4E00-u9FA5]*)([^u4E00-u9FA5])");
		Matcher m = p.matcher(chineseName);
		if(m.find() && m.groupCount() == 2){
			result = m.group(1).replaceAll(".", "*") + m.group(2);
		}
		return result;
	}
	public static String encrytEmail(String email){
		String result = email;
		Pattern p = Pattern.compile("(.)(.*)(.@.*)");
		Matcher m = p.matcher(email);
		if(m.find() && m.groupCount() == 3){
			result = m.group(1) + m.group(2).replaceAll(".", "*") + m.group(3);
		}
		return result;
	}
	
	public static String encryEmailOrMobile(String emailOrMobile){
		if(StringUtils.isBlank(emailOrMobile)){
			return "";
		}
		
		if(emailOrMobile.indexOf("@") > 0){
			return encrytEmail(emailOrMobile);
		}else{
			return encrytMobile(emailOrMobile);
		}
	}
	public static String encrytMobile(String mobile){
		String result = mobile;
		Pattern p = Pattern.compile("^(\\d{3})(\\d*)(\\d{3})$");
		Matcher m = p.matcher(mobile);
		if(m.find() && m.groupCount() == 3){
			result = m.group(1) + m.group(2).replaceAll("\\d", "*") + m.group(3);
		}
		return result;
	}
	
	/**
	 * @Title: validateInputLength 
	 * @Description: 判断字符串长度 
	 * @param input
	 * @param length
	 * @return 
	 * @return boolean
	 */
	public static boolean validateInputLength(String input, int length) {
		if (StringUtils.isBlank(input)) {
			return true;
		}
		if (input.length()>length) {
			return true;
		} 
		return false;
	}
	
	/**
	 * @Title: getRandomStrNum 
	 * @Description: 获取指定位数随机字符串 
	 * @param strLength
	 * @return 
	 * @return String
	 */
	public static String getRandomStrNum(int strLength) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strLength; i++) {
			int j = (int) (Math.random() * NUMBER.length);
			sb.append(NUMBER[j]);
		}
		return sb.toString();
	}
	
	/**
	 * @Title: getRandomLower 
	 * @Description: 获取小写字符串 
	 * @param strLength
	 * @return 
	 * @return String
	 */
	public static String getRandomLower(int strLength) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strLength; i++) {
			int j = (int) (Math.random() * ALPHEBIC_LOWER.length);
			sb.append(ALPHEBIC_LOWER[j]);
		}
		return sb.toString();
	}
	
	/**
	 * @Title: getRandomLowerStr 
	 * @Description: 随机获取字符串 
	 * @param strLength
	 * @return 
	 * @return String
	 */
	public static String getRandomLowerStr(int strLength) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strLength; i++) {
			int j = (int) (Math.random() * ALPHEBIC_AND_NUMBER_LOWER.length);
			sb.append(ALPHEBIC_AND_NUMBER_LOWER[j]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(validateInputLength("1234567890",9));
	}
}
