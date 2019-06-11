<%@ taglib prefix="S" uri="/struts-tags" %>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
	
	<s:a href="viewProduct?product.productId=%{#product.productId}">Return to <s:property value=" product.productId"/></s:a>
<h1>text</h1>
</div>
<div id="Catalog">

<table>
	<tr>
		<td><s:property value="item.product.description"/></td>
	</tr>
	<tr>

		<td><b> <s:property value="item.itemId"/> </b></td>
	</tr>
	<tr>
		<td><b><font size="4">
			<s:property value="#item.attribute1"/>
			<s:property value="#item.attribute2"/>
			<s:property value="#item.attribute3"/>
			<s:property value="#item.attribute4"/>
			<s:property value="#item.attribute5"/>
			<s:property value="#product.name"/>
		</font></b></td>
	</tr>
	<tr>
		<td><s:property value="product.name"/></td>
	</tr>
	<tr>
		<td><s:if test="%{#item.quantity <= 0}">
        Back ordered.
      </s:if> <s:if test="%{#item.quantity > 0}">
			<s:property value="item.quantity"/> in stock.
	  </s:if></td>
	</tr>
	<tr>
		<td><fmt:formatNumber value="${sessionScope.item.listPrice}"
			pattern="$#,##0.00" /></td>
	</tr>

	<tr>
		<td>
            <s:a class="Button" href="addItemToCart?workingItemId=%{#item.itemId}" >Add to Cart</s:a>
       </td>

	</tr>
</table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>



