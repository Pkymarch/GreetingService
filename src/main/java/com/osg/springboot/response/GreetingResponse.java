package com.osg.springboot.response;

public class GreetingResponse {
    private String status;
    private String message;
    private String ids;
    
	public GreetingResponse() {	}
	public GreetingResponse(String status, String message, String ids) {
		
		this.status = status;
		this.message = message;
		this.ids = ids;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "GreetingResponse [status=" + status + ", message=" + message + ", ids=" + ids + "]";
	}
	
    
}
