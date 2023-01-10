<!doctype html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>

    <h1>All movies: </h1>

    <ul>
        <#list movies as movie>
            <li>${ movie.title }</li>
        </#list>
    </ul>

</body>
</html>