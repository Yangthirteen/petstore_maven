<s:if test="%{#myList !=null }">
	<p>Pet Favorites <br />
	Shop for more of your favorite pets here.</p>
	<ul>
		<s:iterator var="product" value="myList">
			<li>
				<s:a href="viewProduct?productId=%{#product.productId}"><s:property value="%{#product.name}"/></s:a>
				(<s:property value="%{#product.productId}"/>)
			</li>
		</s:iterator>

	</ul>

</s:if>
