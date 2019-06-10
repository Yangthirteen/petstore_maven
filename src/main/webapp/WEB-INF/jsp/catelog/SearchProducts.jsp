<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
	<a href="main">Return to Main Menu</a>
 </div>

<div id="Catalog">

<table>
	<tr>
		<th>&nbsp;</th>
		<th>Product ID</th>
		<th>Name</th>
	</tr>
	<s:iterator var="product" value="productList">
		<tr>
			<td>

				<s:a href="viewProduct?productId=%{#product.productId}"><s:property value=" %{#product.description}"/></s:a>
				</td>
			<td><b>

				<s:a href="viewProduct?productId=%{#product.productId}"><font color="BLACK">
					<s:property value=" %{#product.productId}"/> </font></s:a>
			</b></td>
			<td><s:property value="%{#product.name}"/> </td>
		</tr>
	</s:iterator>

	<tr>
		<td></td>
	</tr>

</table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>




