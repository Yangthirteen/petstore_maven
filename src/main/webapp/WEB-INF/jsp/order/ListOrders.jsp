<%@ include file="../common/IncludeTop.jsp"%>

<h2>My Orders</h2>

<table>
	<tr>
		<th>Order ID</th>
		<th>Date</th>
		<th>Total Price</th>
	</tr>

	<s:iterator var="order" value="orderList">
		<tr>
			<td>
				<s:a href="viewOrder?orderId=%{#order.orderId}"> <s:property value=" %{#order.orderId}"/></s:a>
			</td>
			<td>
				<s:date name="%{#order.orderDate}" format="yyyy/MM/dd hh:mm:ss"/>
			</td>
			<td><fmt:formatNumber value="${order.totalPrice}"
								  pattern="$#,##0.00" /></td>
		</tr>
	</s:iterator>
</table>

<%@ include file="../common/IncludeBottom.jsp"%>


