<%--
  Created by IntelliJ IDEA.
  User: 李
  Date: 2018/12/10
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
</div>

<div id="Footer">

    <div id="PoweredBy">&nbsp<a href="www.csu.edu.cn">www.csu.edu.cn</a>
    </div>

    <div id="Banner"><c:if test="${sessionScope.account != null }">
        <c:if test="${sessionScope.authenticated}">
            <c:if test="${sessionScope.account.bannerOption}">
                ${sessionScope.account.bannerName}
            </c:if>
        </c:if>
    </c:if></div>

</div>

</body>
</html>