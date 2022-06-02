package snippet;

public class Snippet {
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="mainPage2.css">
	<style type="text/css">
	iframe {
	width: calc(100%);
	height: 795px;
	}
	</style>
	</head>
	<body>
	<header>
	
	    <img class="logo1" alt="로고" src="../images/logo.png" width="100px;">
	    <a class="title">Watch It!</a>
	    <img class="logo2" alt="로고" src="../images/logo.png" width="100px;">
	
	</header>
	
	
	<nav>
	
	<ul class="headerUl">
	<li><a href="mainPage2.html">Home</a></li>
	<li><a href="mainPage2.html">About Us</a></li>
	<li><a href="mainPage2.html">News</a></li>
	<li><a href="mainPage2.html">My Account</a></li>
	<li><a href="mainPage2.html">Contacts</a></li>
	</ul>
	   
	</nav>
	<div class="maindiv">
	<aside class="left">
	<div class="navdiv">
	         <ul class="navUl">
	            <li class="navli"><a href="movie.html" target="ifr">영화</a></li>
	            <li class="navli"><a href="drama.html" target="ifr">드라마</a></li>
	            <li class="navli"><a href="painting.html" target="ifr">명화</a></li>
	            <li class="navli"><a href="music.html" target="ifr">음악</a></li>
	            <li class="navli"><a href="sports.html" target="ifr">스포츠</a></li>
	            <li class="navli"><a href="furniture.html" target="ifr">가구</a></li>
	            <li class="navli"><a href="food.html" target="ifr">식품</a></li>
	         </ul>
	   </div>
	</aside>
	<section>
	
	   <form action="test4.jsp" method="post">
	      <fieldset>
	         <legend>회원정보입력</legend>
	         <!-- label은 웹접근성에 기여하는 요소 -->
	         <!-- disabled 값이 안넘어감 -->
	         <label for="name">이름</label> : 
	         
	         <input type="text" name="name" id="name" 
	         value="홍길동" required > <br> 
	         
	         <label for="pw">비밀번호</label> : 
	         
	         <input type="password" name="pw" id="pw" 
	         value="비밀번호" required > <br> 
	         
	         <label for="pw">비밀번호 확인</label> : 
	         
	         <input type="password" name="pwck" id="pwck" 
	         value="비밀번호" required > <br> 
	         
	         <label for="email">이메일   </label>:
	         <input type="email" id="email"><br>
	         
	         <label for="tel" >전화   </label>: 
	         <input type="tel" id="tel" 
	         placeholder="ex)000-0000-0000"
	         pattern="[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}"> <br>
	         
	         <label for="bdate">생일   </label>:
	         <input type="date" id="bdate"> <br>
	         
	         <label for=" website">홈페이지   </label>:
	         <input type="url" id="website"> <br>
	         
	         <label for="gender">성별    </label>:
	         <div id="gender">
	              남<input type="radio" value="여자"> 
	              여<input type="radio" value="남자">
	         </div><br>
	         <input type="submit"><br>
	      </fieldset>
	   </form>
	
	</section>
	<aside class="right">
	      <div class="shopcart">
	      <h3>
	      Shopping Cart
	      </h3>
	      <h4>
	      현재 쇼핑카트에 물품이 없습니다. 
	      </h4><br>
	      <a href="shopcart.html" target="_blank">쇼핑카트 보기</a>
	      </div>
	      <div class="login">
	      <h4>Log In</h4>
	      
	      <form action="">
	      id : <input type="text" name="userId"> <br> 
	      pw : <input type="password" name="userPw"><br> 
	          <input type="submit" value="로그인">
	          <input type="submit" value="비밀번호찾기">
	          <br>
	         <a href="register.html"target="_blank">회원가입</a>
	          
	          
	      </form>
	      </div>
	   
	   </aside>
	</div>
	<footer><a>Copyright © 2022 PPark Inc. All rights reserved.</a></footer>
	</body>
	</html>
}

