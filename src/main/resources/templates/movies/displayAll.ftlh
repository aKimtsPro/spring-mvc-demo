<#import "../macro/layout.ftlh" as layout/>

<@layout.begin "display all"/>

    <h1>All movies: </h1>

    <ul>
        <#list movies as movie>
            <li>${ movie.title }</li>
        </#list>
    </ul>

<@layout.end/>