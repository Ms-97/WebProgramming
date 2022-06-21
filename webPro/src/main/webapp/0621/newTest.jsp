<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 이번 예제에서 --%>
<%-- 현재 전달받는 요청데이터는 없음 --%>
<%-- 임의의 데이터를 생성하여 전달하도록 함 --%>

<%-- 현재 jsp페이지는 controller역할을 하는 용도로 생성함 --%>
<%-- controller역할 : 요청정보를 받음 / 결과데이터를 뷰로 보내줌 --%>

<%-- json형태의 데이터 생성 --%>


<%-- 
javascript object는 json데이터 형식이 아님
{name : "홍길동", addr : "대전", tel : "010-1234-5678"}
 --%>

<%-- 
json object
{"name" : "홍길동", "addr" : "대전", "tel" : "010-1234-5678"}

array 
[ "홍길동", "개나리", "진달래", "이도령" ]

json object array
--%>
[
  {"name" : "홍길동", "addr" : "대전", "tel" : "010-1214-5678"},
  {"name" : "임길동", "addr" : "부산", "tel" : "010-1224-5678"},
  {"name" : "정길동", "addr" : "대구", "tel" : "010-1264-5678"},
  {"name" : "박길동", "addr" : "인천", "tel" : "010-1284-5678"}
]




