<%--
Step 3: Create the JSP file that is calling the custom tag
--%>
<%@ taglib uri="WEB-INF/tag.tld" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Clocks</h1>
        <c:clocks/>
    </div>
</body>
</html>
