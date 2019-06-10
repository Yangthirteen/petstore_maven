<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
	<a href="main">Return to Main Menu</a>
	</div>

<div id="Catalog">

<div id="Cart">

<h2>Shopping Cart</h2>

	<form id="carttotal" action="updateCartQuantities" method="post" >
	<table>
		<tr>
			<th><b>Item ID</b></th>
			<th><b>Product ID</b></th>
			<th><b>Description</b></th>
			<th><b>In Stock?</b></th>
			<th><b>Quantity</b></th>
			<th><b>List Price</b></th>
			<th><b>Total Cost</b></th>
			<th>&nbsp;</th>
		</tr>

		<s:if test="%{#cart.numberOfItems == 0}">
			<tr>
				<td colspan="8"><b>Your cart is empty.</b></td>
			</tr>
		</s:if>

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
				<td>
					<input type="text" size="3" name="<s:property value=" %{#cartItem.item.itemId}"/>"/>
						   id="update" value="%{#cartItem.quantity}" onchange="update111()"/>
					</td>
				<td><fmt:formatNumber value="${cartItem.item.listPrice}"
					pattern="$#,##0.00" /></td>
				<td id="total"><fmt:formatNumber  value="${cartItem.total}"
					pattern="$#,##0.00" /></td>
				<td>
					<s:a class="Button" href="removeItemFromCart?cartItemId=%{#cartItem.item.itemId}" >Remove</s:a>
                 </td>
			</tr>
   </s:iterator>
		<tr>
			<td colspan="7">Sub Total: <fmt:formatNumber
				value="${sessionScope.cart.subTotal}" pattern="$#,##0.00" />
				<input class="Button" type="submit" name="updateCartQuantities" value="Update Cart">
			</td>
			<td>&nbsp;</td>
		</tr>
	</table>
	</form>
 <s:if test="%{#cart.numberOfItems > 0}">

		<s:a class="Button" href="newOrderForm" >Proceed to Checkout</s:a>

</s:if></div>

<div id="MyList">
  <s:if test="%{#accountBean != null}">
	<s:if test="%{!#accountBean.authenticated}">
	  <s:if test="%{#accountBean.account.listOption !=null }">
	    <%@ include file="IncludeMyList.jsp"%>
      </s:if>
	</s:if>
  </s:if>
</div>

<div id="Separator">&nbsp;</div>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>