<%--
  Created by IntelliJ IDEA.
  User: 李
  Date: 2018/12/10
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <link rel="StyleSheet" href="css/jpetstore.css" type="text/css"
          media="screen" />

    <meta name="generator"
          content="HTML Tidy for Linux/x86 (vers 1st November 2002), see www.w3.org" />
    <title>JPetStore Demo</title>
    <meta content="text/html; charset=windows-1252"
          http-equiv="Content-Type" />
    <meta http-equiv="Cache-Control" content="max-age=0" />
    <meta http-equiv="Cache-Control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="Expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
    <meta http-equiv="Pragma" content="no-cache" />
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>

    <script>
        var xmlHttpRequest;
        function creteXMLHttpRequest(){
            if (window.XMLHttpRequest)
            {
                // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
                xmlHttpRequest=new XMLHttpRequest();
            }
            else
            {
                // IE6, IE5 浏览器执行代码
                xmlHttpRequest=new ActiveXObject("Microsoft.XMLHTTP");
            }
        }
      function usernameIsExist() {
          var username = document.newAccountForm.username.value;
          sendRequest("usernameIsExist?username="+username);
          console.log("username="+username);
      }
      function sendRequest(url) {
          creteXMLHttpRequest();
          xmlHttpRequest.open("GET",url,true);
          xmlHttpRequest.onreadystatechange=processResponse;
          xmlHttpRequest.send(null);
      }
      function processResponse() {
          if (xmlHttpRequest.readyState==4){
              if( xmlHttpRequest.status==200)
              {
                  var responseInfo = xmlHttpRequest.responseXML.getElementsByTagName("msg")[0].firstChild.data;
                  var div1 = document.getElementById("usernameMsg");
                   console.log("responseInfo="+responseInfo);
                  if(responseInfo=="Exist"){
                      div1.innerHTML ="<font color='red'>用户名不可用</font>";
                  }else{
                      div1.innerHTML ="<font color='green'>用户名可用</font>";
                  }

              }
          }
      }
      function searchShowIn(keyword,event) {
              //定义全局变量
              var keyword = $("#keyword").val();
               console.log("keyword="+keyword);
              var sel = document.getElementById("sel");
              $.post(
                  "serachServlet",//url
                  "keyword="+ keyword,//发送的数据

                  function(data){//获取响应回来的数据
                      document.getElementById("sel").innerHTML="";
                      var arr = new Array;
                      var arr = data.split("#");//将响应回来的数据按#拆分成数组
                      console.log(arr);
                      document.getElementById("sel").size = arr.length-1;
                      document.getElementById("sel").style.height=arr.length*9+1;
                      for(var i=1;i<arr.length;i++){//循环每一个满足条件的记录
                          //将当前循环满足条件的商品名称生成一个下拉的选项
                          sel.options[i-1]=new Option(arr[i],i-1);

                      }

                      //判断是否有满足条件的商品
                      if(data.length>0){
                          sel.style.display='block';
                      }else{
                          sel.style.display='none';
                      }
                      //当用户按下上下键时获取相应的值
                      if(event.keyCode==40){
                          sel.focus();
                      }
                  },
                  //发送数据类型
                  "text"
              );
          }

          function test2(){
              //输入回车，获取输入框内容焦点
              $("#sel").keypress(function(){
                  $("#keyword").focus();
                  $("#sel").css("display","none");
              });
              //双击，获取输入框内容焦点
              $("#sel").dblclick(function(){
                  $("#keyword").focus();
                  $("#sel").css("display","none");
              });
              //将选中的下拉列表中的内容添加到输入框中
              $("#keyword").val($("option:selected").html());

      }
        function update111() {
            console.log("629")
            $.ajax({
                //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "html",
                url: "updateCartQuantities" ,//url
                data: $('#carttotal').serialize(),
                success: function (result) {
                    console.log(result)
                        var html1 = $(result).find('#Catalog');
                        $("#Catalog").html(html1);

                },

                error : function() {
                    alert("异常！");
                }
            });
        }

    </script>
</head>

<body>

<div id="Header">

    <div id="Logo">
        <div id="LogoContent">
            <a href="main"><img src="images/logo-topbar.gif" /></a>
        </div>
    </div>

    <div id="Menu">
        <div id="MenuContent">

            <a href="viewCart"><img align="middle" name="img_cart" src="images/cart.gif" alt="a" /></a>

            <img align="middle" src="images/separator.gif" />
            <c:if
                test="${sessionScope.account == null}">

            <a href="signonForm">  Sign In </a>

        </c:if>
            <c:if test="${sessionScope.account != null}">
            <c:if test="${!sessionScope.authenticated}">
                <a href="signonForm">  Sign In </a>
            </c:if>
        </c:if>
            <c:if test="${sessionScope.account != null}">
            <c:if test="${sessionScope.authenticated}">

                <a href="signOff">   Sign Out </a>
                <img align="middle" src="images/separator.gif" />

                <a href="editAccountForm?username=${sessionScope.account.username}">    My Account </a>
            </c:if>
        </c:if>
            <img align="middle" src="images/separator.gif" /> <a
                href="help.html">?</a></div>
    </div>

    <div id="Search">
        <div id="SearchContent">
            <form action="searchProduct" method="post" name="form1">
                <input type="text" name="keyword" id="keyword" autocomplete="off"
                       size="14" onkeyup="searchShowIn(this.value,event)"/>
                <input type="submit" name="searchProduct" value="Search" /><br/>
                <div id="out">
                <select multiple="multiple" id="sel" size="4"  onchange="test2()">
                </select>
                </div>
            </form>
        </div>
    </div>

    <div id="QuickLinks">
        <a href="viewCategory?categoryId=FISH"><img
                src="images/sm_fish.gif" /></a> <img src="images/separator.gif" />
        <a href="viewCategory?categoryId=DOGS"><img
                src="images/sm_dogs.gif" /></a> <img src="images/separator.gif" />
        <a href="viewCategory?categoryId=REPTILES"><img
                src="images/sm_reptiles.gif" /></a> <img
            src="images/separator.gif" /> <a href="viewCategory?categoryId=CATS"><img
            src="images/sm_cats.gif" /></a> <img src="images/separator.gif" />
        <a href="viewCategory?categoryId=BIRDS"><img
                src="images/sm_birds.gif" /></a>
    </div>
</div>

<div id="Content">