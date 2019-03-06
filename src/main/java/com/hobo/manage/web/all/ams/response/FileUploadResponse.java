 package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;

 /**
 * @ClassName: FileUploadResponse
 * @Description: 上传图片返回结果
 * @author zf-g0108
 * @date 2019年3月6日
 *
 */
public class FileUploadResponse implements Serializable{


	private static final long serialVersionUID = -7821996658674532488L;
	// 图片相对路径
	private String startPic;
	public String getStartPic() {
		return startPic;
	}
	public void setStartPic(String startPic) {
		this.startPic = startPic;
	}
	

}
