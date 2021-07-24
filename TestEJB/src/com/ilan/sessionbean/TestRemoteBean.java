package com.ilan.sessionbean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestRomoteBean
 */
@Stateless
@LocalBean
public class TestRemoteBean implements ITestRemoteBean {

	/**
	 * Default constructor.
	 */
	public TestRemoteBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String say(String msg) {
		// TODO Auto-generated method stub
		return "hello, " + msg;
	}

}
