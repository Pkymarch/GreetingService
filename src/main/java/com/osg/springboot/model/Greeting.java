package com.osg.springboot.model;

public class Greeting {
    private String mobiles;
    private String message;
    
    
	public Greeting() {}
	public Greeting(String mobiles, String message) {
		this.mobiles = mobiles;
		this.message = message;
	}
	public String getMobiles() {
		return mobiles;
	}
	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Greeting [mobiles=" + mobiles + ", message=" + message + "]";
	}
	
    
}
