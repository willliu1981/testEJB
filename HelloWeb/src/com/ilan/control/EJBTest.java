package com.ilan.control;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.ilan.sessionbean.ITestRemoteBean;

public class EJBTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");
		p.put(Context.PROVIDER_URL, "http://localhost:8081/TestEJB");

		InitialContext ctx;
		ITestRemoteBean demoService = null;
		try {
			ctx = new InitialContext(p);
			System.out.println("ctx=============" + ctx);
			
			Object o = ctx.lookup("TestRemoteBeanRemote");
			System.out.println("o=============" + o);
			
			demoService = (ITestRemoteBean) o;
			System.out.println("demoService=============" + demoService);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("EJBTest: "+demoService.say("hiiiii"));

	}

}
