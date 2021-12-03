<%--
  Created by IntelliJ IDEA.
  User: lrc
  Date: 2021/11/26
  Time: 11:03 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.4.1/jquery.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                /*
                简写
                    $.post(url, param[可以省略], success)
                 */
                $.post("${pageContext.request.contextPath}/a2", function (data) {
                    // console.log(data);
                    var html1content = "";
                    for (let i = 0; i < data.length; i++) {
                        html1content += "<tr>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            +"</tr>";
                    }
                    $("#content").html(html1content);
                })
            })
        })

    </script>


</head>
<body>

<input type="button" value="加载数据" id="btn">
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <tbody id="content">
    <%--数据：后台--%>

    </tbody>
</table>
</body>
</html>
