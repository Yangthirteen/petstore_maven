<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
	<form action="newAccount" method="post" name="newAccountForm">
	<h3>User Information</h3>

	<table>
		<tr>
			<td>User ID:</td>
			<td><input type="text" name="username" onblur="usernameIsExist();"></td>
		</tr>
		<tr>
			<td>Notice:</td>
			<td><div id="usernameMsg"></div></td>
		</tr>
		<tr>
			<td>New password:</td>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td>Repeat password:</td>
			<td><input type="text" name="repeatedPassword"></td>
		</tr>
	</table>

	<%@ include file="IncludeAccountFields.jsp"%>

		<input class="button" type="submit" name="newAccount" value="Save Account Information">
	</form>
 </div>

<%@ include file="../common/IncludeBottom.jsp"%>