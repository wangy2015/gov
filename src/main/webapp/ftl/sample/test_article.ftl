<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld"] />
<html>
<head>
    <title>文章循环</title>
</head>
<body>
<@articleListTag posid=1 page=1 size=2 sort="date"; articles,pageNumber,totalPage>
    <#list articles as article>
    <strong>${article.title}</strong><br />
    </#list>
    ${pageNumber}<br />
    ${totalPage}<br />
</@articleListTag>
<@articleTag id=3; article>
    ${article.content}
</@articleTag>
</body>
</html>