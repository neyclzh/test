package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
	public Login() {
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    response.setContentType("text/html");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    String loginName = request.getParameter("name");
    String loginPwd = request.getParameter("pwd");
    if(loginName.equals("1")&&loginPwd.equals("1")) {
    	System.out.println("success in Server ");
    	out.print(true);
       // request.getRequestDispatcher("success.html").forward(request, response);
    }else {
    	out.print(false);
    }
}
}


