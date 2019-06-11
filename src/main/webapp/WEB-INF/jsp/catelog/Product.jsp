<%@ include file="../common/IncludeTop.jsp"%>


<div id="BackLink">
	<s:a href="viewCategory?category.categoryId=%{#product.categoryId}">Return to <s:property value="product.categoryId"/></s:a>

</div>

<div id="Catalog">

<h2> <s:property value="product.name"/> </h2>

<table>
	<tr>
		<th>Item ID</th>
		<th>Product ID</th>
		<th>Description</th>
		<th>List Price</th>
		<th>&nbsp;</th>
	</tr>
	<s:iterator  value="itemList" var="item">
		<tr>
			<td>
				<s:a href="viewItem?item.itemId=%{#item.itemId}"><s:property value="%{#item.itemId}"/> </s:a>
			</td>
			<td><s:property value="%{#item.product.productId}"/> </td>
			<td>
				<s:property value="#item.attribute1"/>
				<s:property value="#item.attribute2"/>
				<s:property value="#item.attribute3"/>
				<s:property value="#item.attribute4"/>
				<s:property value="#item.attribute5"/>
				<s:property value="#product.name"/>
			</td>
			<td><fmt:formatNumber value="${item.listPrice}"
								  pattern="$#,##0.00" /></td>
			<td>
				<s:a class="Button" href="addItemToCart?workingItemId=%{#item.itemId}" >Add to Cart</s:a>

			</td>
		</tr>
	</s:iterator>

	<tr>
		<td>
		</td>
	</tr>
</table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>





