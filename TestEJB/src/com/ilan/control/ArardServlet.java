package com.ilan.control;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilan.sessionbean.TestBean;

/**
 * Servlet implementation class ArardServlet
 */
/**
 * @author KuanWei
 *
 */
@WebServlet("/ArardServlet")
public class ArardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	TestBean bean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int award=bean.getAward(30);
		response.getWriter().append("award: ").append(""+award);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
