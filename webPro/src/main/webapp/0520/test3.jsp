<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<%
	//post방식으로 한글데이터가 들어올때
	request.setCharacterEncoding("utf-8");
	//요청데이터 전달받기
	String txta = request.getParameter("ta");
	
// 	가/r/n나다라/r/n마다

// 	/r = carrage return
// 	/n = line feed 
	
	txta = txta.replace("\n","<br>").replace("\r","");
	
	
//	String car = request.getParameter("cars");
	String[] cars = request.getParameterValues("cars");
	 
	String car ="";
	 for(int i=0; i<cars.length-1; i++){
		 cars[i] +=  ", ";
	 }		
	 
	 for(int i=0; i<cars.length; i++){
		 car += cars[i];
	 }

%>



TEXTAREA : <%= txta %> <br>
<%= "DREAM CAR :" + car %>