package com.ilan.control;

import java.io.IOException;
import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilan.sessionbean.ITestRemoteBean;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	@EJB
//	ITestRemoteBean bean;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
		// response.getWriter().append("Hello: ").append(""+bean.getAward(5));
		response.getWriter().append("Hello: " + demoService.say("hi "));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
