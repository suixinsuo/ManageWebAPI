package com.hobo.manage.web.model;

import java.io.Serializable;

/**
 * 返回到前台的图片信息
 * 
 * @ClassName: PictureInfoResponse.java
 * @Description: 返回到前台信息
 * @date 2017年1月10日
 */
public class PictureInfoResponse implements Serializable {

	private static final long serialVersionUID = -3624127883494527043L;
	/**
	 * 图片显示路径
	 */
	private String imgPath;

	/**
	 * 日期戳
	 */
	private String dateStr;

	/**
	 * 图片名
	 */
	private String imgName;

	/**
	 * handler名称
	 */
	private String handlerName;

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

}
