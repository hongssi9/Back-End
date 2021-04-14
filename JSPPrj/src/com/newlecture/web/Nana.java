package com.newlecture.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

 		//서블릿 클래스는 왓스에서 로드가 된다. 결과를 돌려줌
		//클래스명은 관심이 없다.
@WebServlet("/hi~")
public class Nana extends HttpServlet { //추상클래스라는 자료형식을 서블릿이 참조하게된다. //서블릿 클래스를 만들때 HttpServlet
	public void service(HttpServletRequest request, HttpServletResponse response)
									throws IOException, ServletException {//입출력 도구들,
				
				//HttpServletRequest입력도구 HttpServletResponse 출력도구
				//service함수를 main함수라고 생각하면 된다.
				//nana 서블릿이라고 한다.
				//필요에따라 코드가 선택적으로 실행될 수 있게 하기위하여 만드는...
		
		
		int count = 10;
		String c = request.getParameter("c");
		
		PrintWriter out = response.getWriter();
		out.println("[2,3,4,5]");
		
		
//		PrintWriter out = response.getWriter();
//			
//		
//		if(c != null)
//			count = Integer.parseInt(c);
//		
//		for(int i=0; i<count; i++) 
//		out.println("hello Servlet");
		
	}
}