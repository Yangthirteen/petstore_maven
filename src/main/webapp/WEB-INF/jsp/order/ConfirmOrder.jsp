<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
	<s:a href="main">Return to Main Menu</s:a>
	</div>


<div id="Catalog">Please confirm the information below and then
press continue...

<table>
	<tr>
		<th align="center" colspan="2"><font size="4"><b>Order</b></font>
		<br />
		<font size="3"><b> 
			<s:date name="%{#order.orderDate}" format="yyyy/MM/dd hh:mm:ss"/>
			</b></font>
		</th>
	</tr>

	<tr>
		<th colspan="2">Billing Address</th>
	</tr>
	<tr>
		<td>First name:</td>
		<td> <s:property value="%{#order.billToFirstName}" /></td>
	</tr>
	<tr>
		<td>Last name:</td>
		<td><s:property value="%{#order.billToLastName}" /></td>
	</tr>
	<tr>
		<td>Address 1:</td>
		<td><s:property value="%{#order.billAddress1}" /></td>
	</tr>
	<tr>
		<td>Address 2:</td>
		<td><s:property value="%{#order.billAddress2}" /></td>
	</tr>
	<tr>
		<td>City:</td>
		<td><s:property value="%{#order.billCity}" /></td>
	</tr>
	<tr>
		<td>State:</td>
		<td><s:property value="%{#order.billState}" /></td>
	</tr>
	<tr>
		<td>Zip:</td>
		<td><s:property value="%{#order.billZip}" /></td>
	</tr>
	<tr>
		<td>Country:</td>
		<td><s:property value="%{#order.billCountry}" /></td>
	</tr>
	<tr>
		<th colspan="2">Shipping Address</th>
	</tr>
	<tr>
		<td>First name:</td>
		<td><<s:property value="%{#order.shipToFirstName}" /></td>
	</tr>
	<tr>
		<td>Last name:</td>
		<td><s:property value="%{#order.shipToLastName}" /></td>
	</tr>
	<tr>
		<td>Address 1:</td>
		<td><s:property value="%{#order.shipAddress1}" /></td>
	</tr>
	<tr>
		<td>Address 2:</td>
		<td><s:property value="%{#order.shipAddress2}" /></td>
	</tr>
	<tr>
		<td>City:</td>
		<td><s:property value="%{#order.shipCity}" /></td>
	</tr>
	<tr>
		<td>State:</td>
		<td><s:property value="%{#order.shipState}" /></td>
	</tr>
	<tr>
		<td>Zip:</td>
		<td><s:property value="%{#order.shipZip}" /></td>
	</tr>
	<tr>
		<td>Country:</td>
		<td><s:property value="%{#order.shipCountry}" /></td>
	</tr>

</table>


	<s:a class="Button" href="viewOrder?order=%{#order}">Confirm</a>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>



