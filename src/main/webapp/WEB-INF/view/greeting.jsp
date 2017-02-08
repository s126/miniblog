<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>打招呼</title>

    <script src="/js/jquery.js"></script>

    <script type="text/javascript">
        $(function () {
            // alert($("h1").text());
        })
    </script>


</head>
<body>
    <h1>你好！ ${user.name}(你现在是 ${user.age} 岁. ${user.birth})</h1>
</body>
</html>
