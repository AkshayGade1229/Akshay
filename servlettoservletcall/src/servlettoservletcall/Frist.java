package servlettoservletcall;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Frist extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("Welcome To Servlat Frist...!");
	PrintWriter pw = res.getWriter();
	pw.write("Servlet Frist ===>");
	
	RequestDispatcher rd = req.getRequestDispatcher("s2");
	rd.include(req, res);
	
	pw.write("   Servlet 1 After");
	}

}
