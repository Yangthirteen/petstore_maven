<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
   <s:a href="main">Return to Main Menu</s:a>
</div>
<div id="Catalog">

<h2><s:property value="category.name"/></h2>

<table>
	<tr>
		<th>Product ID</th>
		<th>Name</th>
	</tr>
	<s:iterator value="productList" var="product">
		<tr>
			<td>

				<s:a href="viewProduct?product.productId=%{#product.productId}"><s:property value="%{#product.productId}"/></s:a>

			</td>

			<td><s:property value="%{#product.name}"/></td>
		</tr>
	</s:iterator>

</table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>


