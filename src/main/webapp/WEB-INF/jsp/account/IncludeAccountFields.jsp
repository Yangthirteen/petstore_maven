
<h3>Account Information</h3>

<table>
	<tr>
		<td>First name:</td>
		<td><input type="text" name="account.firstName " value="<s:property value=" %{#account.firstName}"/>"></td>
	</tr>
	<tr>
		<td>Last name:</td>
		<td><input type="text" name="account.lastName"value="<s:property value=" %{#account.lastName}"/>"></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><input type="text" size="40" name="account.email"value="<s:property value=" %{#account.email}"/>"></td>
	</tr>
	<tr>

		<td>Phone:</td>
		<td><input type="text" name="account.phone"value="<s:property value=" %{#account.phone}"/>"></td>
	</tr>
	<tr>
		<td>Address 1:</td>
		<td><input type="text" size="40" name="account.address1"value="<s:property value=" %{#account.address1}"/>"></td>
	</tr>
	<tr>
		<td>Address 2:</td>
		<td><input type="text" size="40" name="account.address2"value="<s:property value=" %{#account.address2}"/>"></td>
	</tr>
	<tr>
		<td>City:</td>
		<td><input type="text" name="account.city"value="<s:property value=" %{#account.city}"/>"></td>
	</tr>
	<tr>
		<td>State:</td>
		<td><input type="text" size="4" name="account.state"value="<s:property value=" %{#account.state}"/>"></td>
	</tr>
	<tr>
		<td>Zip:</td>
		<td><input type="text"size="10" name="account.zip"value="<s:property value=" %{#account.zip}"/>"></td>
	</tr>
	<tr>
		<td>Country:</td>
		<td><input type="text"size="15" name="account.country"value="<s:property value=" %{#account.country}"/>"></td>
	</tr>
</table>

<h3>Profile Information</h3>

<table>
	<tr>
		<td>Language Preference:</td>
		<td>
				<select name="account.languagePreference">
					<option value="english" selected="selected">english</option>
                    <option value="chinese">chinese</option>
					<option value="japanese">japanese</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Favourite Category:</td>
		<td>
			<select name="account.favouriteCategoryId">
				<option value="FISH">FISH</option>
				<option selected="selected" value="DOGS">DOGS</option>
				<option value="REPTILES">REPTILES</option>
				<option value="CATS">CATS</option>
				<option value="BIRDS">BIRDS</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Enable MyList</td>
		<td><input type="checkbox" name="account.listOption" value="1" /></td>
	</tr>
	<tr>
		<td>Enable MyBanner</td>
		<td><input type="checkbox" name="account.bannerOption" value="1" /></td>
	</tr>

</table>
