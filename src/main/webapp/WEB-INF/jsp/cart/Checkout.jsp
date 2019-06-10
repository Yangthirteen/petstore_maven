<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
	<s:a href="viewCart">Return to Shopping Cart</s:a>
	
</div>

<div id="Catalog">

<table>
	<tr>
		<td>
		<h2>Checkout Summary</h2>

		<table>

			<tr>
				<td><b>Item ID</b></td>
				<td><b>Product ID</b></td>
				<td><b>Description</b></td>
				<td><b>In Stock?</b></td>
				<td><b>Quantity</b></td>
				<td><b>List Price</b></td>
				<td><b>Total Cost</b></td>
			</tr>
      <s:iterator var="cartItem" value="cart.cartItems">
	    <tr>
	    <td>
	    <s:a href="viewItem?itemId=%{#cartItem.item.itemId}"><s:property value="%{#cartItem.item.itemId}"/> </s:a>
     	</td>
	    <td><s:property value="%{#cartItem.item.product.productId}"/> </td>
	    <td>
	    <s:property value="#cartItem.item.attribute1"/>
	    <s:property value="#cartItem.item.attribute2"/>
	    <s:property value="#cartItem.item.attribute3"/>
	    <s:property value="#cartItem.item.attribute4"/>
	    <s:property value="#cartItem.item.attribute5"/>
	    <s:property value="#cartItem.item.product.name"/>
	    </td>
	    <td><s:property value="%{#cartItem.inStock}"/> </td>
			<td><s:property value="%{#cartItem.quantity}"/></td>
					<td><fmt:formatNumber value="${cartItem.item.listPrice}"
						pattern="$#,##0.00" /></td>
					<td><fmt:formatNumber value="${cartItem.total}"
						pattern="$#,##0.00" /></td>
				</tr>
	  </s:iterator>
			<tr>
				<td colspan="7">Sub Total: <fmt:formatNumber
					value="${sessionScope.cart.subTotal}" pattern="$#,##0.00" /></td>
			</tr>
		</table>

		<td>&nbsp;</td>

	</tr>
</table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>