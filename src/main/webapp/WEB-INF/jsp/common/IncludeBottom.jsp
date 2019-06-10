<%--
  Created by IntelliJ IDEA.
  User: 李
  Date: 2018/12/10
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
</div>

<div id="Footer">

    <div id="PoweredBy">&nbsp<s:a href="www.csu.edu.cn">www.csu.edu.cn</s:a>
    </div>

    <div id="Banner"><s:if test="account != null ">
        <s:if test="authenticated">
            <s:if test="account.bannerOption">
                <s:property value="account.bannerName"/>
            </s:if>
        </s:if>
    </s:if></div>

</div>

</body>
</html>