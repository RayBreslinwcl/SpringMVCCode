<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
        function ajax1() {
            $.post({
                url: "${pageContext.request.contextPath}/ajax1",
                data: {'name': $("#userName").val()},
                success: function (data, status) {
                    console.log("data:" + data, "status:" + status);
                },
                error:function (data,status) {
                    console.log("error status: " + status);
                    console.log("error data:");
                    console.dir(data);
                }
            });
        }
    </script>
</head>
<body>

<%--onblur：失去焦点触发事件--%>
用户名:<input type="text" id="userName" onblur="ajax1()"/>

</body>
</html>
