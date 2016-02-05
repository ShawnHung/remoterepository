package eeit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("hahaha");
		
		String location="/Team03WebProj/index.jsp";

		resp.sendRedirect(location);
		System.out.println("13212123123");
		System.out.println("hahahaha");
		System.out.println("13212123123");
		System.out.println("hahahaha");
		System.out.println("13212123123");
		System.out.println("hahahaha");
		System.out.println("13212123123");
		System.out.println("hahahaha");
		System.out.println("13212123123");
		System.out.println("hahahaha");
		System.out.println("dasdasdasdas");
		System.out.println("Hello123");
		System.out.println("dasdasdasdas");
		System.out.println("Hell123o");
		resp.sendRedirect(location);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
}
