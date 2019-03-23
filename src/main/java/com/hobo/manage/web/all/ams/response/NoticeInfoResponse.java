package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName NoticeInfoResponse
 * @Description 公告response
 * @Author jpg
 * @Date 2019年3月23日 下午6:41:44
 */
public class NoticeInfoResponse implements Serializable{

	private static final long serialVersionUID = -3070777303058657379L;
	// 发布时间
	private Date publisherDate;
	private String id;
	// 标题
	private String title;
	// 阅读状态 ,READ 已读，UNREAD 未读
	private String readStatus;
	// 内容
	private String content;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReadStatus() {
		return readStatus;
	}
	public void setReadStatus(String readStatus) {
		this.readStatus = readStatus;
	}
	public Date getPublisherDate() {
		return publisherDate;
	}
	public void setPublisherDate(Date publisherDate) {
		this.publisherDate = publisherDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
