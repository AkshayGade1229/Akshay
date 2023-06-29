package servlettoservletcall;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		System.out.println("Servlet 2..");
		
		PrintWriter pw = res.getWriter();
		pw.write(" Servlet Second ==> ");
	}

}
