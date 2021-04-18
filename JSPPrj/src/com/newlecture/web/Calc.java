package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add") // annotation을 이용한 서블릿맵핑
public class Calc extends HttpServlet {

	
	@Override  		//GET은 서버에서 어떤 데이터를 가져와서 보여주는...상태를 바꾸지는 않는다.
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // 웹에서 한글을 지원하지 않을경우 문서를 한글로....
		resp.setContentType("text/html; charset=UTF-8"); // 보낸 값을 웹에서 한글로....

		System.out.println("calc");

		// 1.입/출력 도구가 추가되었다
		int x = 0;
		int y = 0;
		int result = 0; //더한 값을 위한 변수
	
		String x_ = null;
		String y_ = null;
		String r_ = req.getParameter("x"); //Request 객체의서 getParameter()메소드로 입력한 값을 가져올 수 있음

		if (r_ != null)
			result = Integer.parseInt(r_);

		PrintWriter out = resp.getWriter();
		
		// Jasper (도구)
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<section>");
		out.write("<h1>계산기</h1>");
		out.write("<div>");
		// if(result >= 0 )
		if (x_ != null)
			out.write("<div>" + x + "+" + y + "=</div>");
		out.write("<form action=\"/add\" method=\"post\">");
		out.write("<input type=\"text\" name=\"x\">+<input type=\"text\" name=\"y\"><br>");
		out.write("<input type=\"submit\" value=\"덧셈\"><span>" + result + "</span><br>");
		out.write(x + "+" + y + "=" + result);
		out.write("</form>");
		out.write("</div>");
		out.write("</section>");
		out.write("</body>");
		out.write("</html>");

	}

	@Override		//POST는 서버의 값이나 상태를 바꾸기 위해서 사용한다.
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 입/출력 도구가 추가되었다..
		int x = 0;
		int y = 0;
		int result = 0;
		String x_ = null;
		String y_ = null;

		// if (req.getMethod().equals("POST")) {
		System.out.println("POST");

		x_ = req.getParameter("x");
		if (x_ != null && !x_.equals(""))
			x = Integer.parseInt(x_);

		y_ = req.getParameter("y");
		if (x_ != null && !x_.equals(""))
			y = Integer.parseInt(y_);

		result = x + y; //계산결과를 담을 변수가 필요해서 선언
						//

		// doGet 요청을 하는 것이 더 효율적이다.
//			doGet(req, resp);
		resp.sendRedirect("/add?x=" + result); // r값을 전달
		// get 요청하면서 get을 처리하는 로직에게 내가 만든 값 또는 상태를 전달할 수 있는 방법이 필요하다.
//			get요청으로 상태유지 방법3가지
		// 1. 파일을 이용하는 방법
		// 2. 서블릿의 저장소(Application/Session/Request/Cookie.//)를 이용하는 방법
		// 3. QueryString을 이용하는 방법

		// }
	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		resp.setCharacterEncoding("UTF-8"); // 웹에서 한글을 지원하지 않을경우 문서를 한글로....
//		resp.setContentType("text/html; charset=UTF-8"); // 보낸 값을 웹에서 한글로....
//
//		System.out.println("calc");
//		
//
//		// 1.입/출력 도구가 추가되었다
//		int x = 0;
//		int y = 0;
//		int result = 0;
//		String x_ = null;
//		String y_ = null;
//		
//		if(req.getMethod().equals("POST")) {
//		x_ = req.getParameter("x");
//		if (x_ != null && !x_.equals(""))
//			x = Integer.parseInt(x_);
//
//		y_ = req.getParameter("y");
//		if (x_ != null && !x_.equals(""))
//			y = Integer.parseInt(y_);
//
//		result = x + y;
//		}
//		// 1. 계산을 계속할 수 있도록 계산기 UI를 출력하기
//		// 2. 한글 깨짐문제 해결하기
//		// 3. 계산기에서 계산한 결과 값 외에 계산했던 연산식도 함께 보여주기
//		// 4. POST 요청의 기본 값
//		// 5. GET 요청과 POST의 이해와 코드 분리하기
//
//		// 문서를 동적으로 만드는 코드 : 이 코드로 만들어진 결과물 : 동적인 문서 : 서버 문서
//		PrintWriter out = resp.getWriter();
//
//		out.write("<!DOCTYPE html>");
//		out.write("<html>");
//		out.write("<head>");
//		out.write("<meta charset=\"UTF-8\">");
//		out.write("<title>Insert title here</title>");
//		out.write("</head>");
//		out.write("<body>");
//		out.write("<section>");
//		out.write("<h1>계산기</h1>");
//		out.write("<div>");
//		// if(result >= 0 )
//		if (x_ != null)
//			out.write("<div>" + x + "+" + y + "=</div>");
//		out.write("<form action=\"/add\" method=\"post\">");
//		out.write("<input type=\"text\" name=\"x\">+<input type=\"text\" name=\"y\"><br>");
//		out.write("<input type=\"submit\" value=\"덧셈\"><span>" + result + "</span><br>");
//		out.write(x + "+" + y + "=" + result);
//		out.write("</form>");
//		out.write("</div>");
//		out.write("</section>");
//		out.write("</body>");
//		out.write("</html>");

	// add?x=3&y=5 //순수 GET 요청만으로 값을 전달하고 결과를 얻는 요청

	// add -> 입력폼 요청(GET)
	// add*submit-> 제출 요청(POST) 기본은 GET요청

//		resp.getWriter().println(x+y);
	// 2.실행을 직접 할 수없다. 톰캣에 의해서 실행된다
//	}

}
