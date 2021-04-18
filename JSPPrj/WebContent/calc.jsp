<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%
	/* response.setCharacterEncoding("UTF-8"); */  /*이미 재스퍼에서 서블릿코드를 만들때 깨진 언어를 설정해줌 */
int result = 13;
%>
<!-- 코드블럭이란..제스퍼란.. -->
<!-- 내장객체에 이미 선언한 변수들이 있음 -->
<!-- //pageContext : 현재페이지 / request : 두 서블릿 간의 저장소 / session : 사용자별 저장소 / application : 전역 저장소 -->
<!-- out : 문자열 출력 도구 / page : 현재 서블릿 객체 참조를 갖고있는.. -->

<!-- 과정 : ??.jsp -> 톰캣(jsp 요청이 왔다) : jasper 도움을 줌 -> jasper가 ??.jsp 파일을 받아서 ??_jsp 클래스를 생성한다. -->
<%--
<%! %> 정의를위한..(함수를 선언할 수 있게 해줌
<%= %> 값을 넣기위한..
<% %>  출력을 위한..
<%@ %> 이안에 들어가는 내용은 설정사항..
 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
      <h1>계산기</h1>
      <div>
         <form action="/add">
            <input type="text" name="x">+<input type="text" name="y"><br>
            <input type="submit" value="덧셈"><span><%= result %></span>
         </form>
      </div>
   </section>
</body>
</html>