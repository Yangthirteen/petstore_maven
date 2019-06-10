<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
	<form action="signOn" method="post" >
	<p>Please enter your username and password.</p>
		<p>Username:<input type="text" name="username" value="j2ee"> </p>
		<p>Password:<input type="password" name="password" value="j2ee"></p>
	  <p> Identifying code:<input type="text" name="code1"  value="">
	</p>
		<p>

		<img id="codeImage" alt="identifying code" src="capture" style="vertical-align: top">

		<a class="Button" href="signonForm" style="vertical-align: top">change another</a><br/>

			<s:if test="%{#flag}">
				<font color="red" size="4">identifying code is error</font>
			</s:if>
		</p>
		<input class="button" type="submit" name="signon" value="Login">
	</form>
      Need a user name and password?
	<s:a href="newAccountForm">Register Now!</s:a>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>

