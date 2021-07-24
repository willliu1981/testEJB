package com.ilan.sessionbean;

import javax.ejb.Remote;

@Remote
public interface ITestRemoteBean {
	public String say(String msg);
}
