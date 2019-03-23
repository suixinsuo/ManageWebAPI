package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName NoticeResponse
 * @Description 公告信息
 * @Date 2019年3月23日 下午4:00:44
 */
public class NoticeResponse implements Serializable {

	private static final long serialVersionUID = 4161387392007888428L;
	// 未读条数
	private long unreadCount;
	// 公告信息
	private List<NoticeInfoResponse> notices;
	public long getUnreadCount() {
		return unreadCount;
	}
	public void setUnreadCount(long unreadCount) {
		this.unreadCount = unreadCount;
	}
	public List<NoticeInfoResponse> getNotices() {
		return notices;
	}
	public void setNotices(List<NoticeInfoResponse> notices) {
		this.notices = notices;
	}
}
