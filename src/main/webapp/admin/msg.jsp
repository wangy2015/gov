<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="page" uri="/WEB-INF/page.tld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="../css/admin_css.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../script/jquery-1.4.min.js"></script>
<script type="text/javascript" src="../script/script.js"></script>
</head>
<body>
	<table width="0" height="6" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td></td>
		</tr>
	</table>
	<table width="100%" border="1" align="center" cellpadding="0"
		cellspacing="1" bordercolor="#FFFFFF" bgcolor="#C4D8ED" id="2">
		<tr>
			<td height="40" align="center" valign="middle"
				class="nzcms_table_top" bgcolor="#FFFFFF">投诉建议</td>
		</tr>
		<tr>
			<td align="left" valign="top" bgcolor="#FFFFFF" class="z">
				<table width="100%" border="1" cellpadding="0" cellspacing="1"
					bordercolor="#FFFFFF" bgcolor="#C9DEFA">
						<tr align="center" bgcolor="#C9DEFA">
							<td width="5%" class="nzcms_table_top2">序号</td>
							<td width="20%" class="nzcms_table_top2">标题</td>
							<td width="55%" class="nzcms_table_top2">内容</td>
							<td width="20%" class="nzcms_table_top2">时间</td>
						</tr>
						<c:forEach items="${list }" var="item" varStatus="status">
							<tr onMouseOver="this.bgColor='#E4EDF9';"
								onMouseOut="this.bgColor='#FFFFFF';" bgcolor="#ffffff">
								<td height="30" align="center">${status.count }</td>
								<td align="center">${item.title }</td>
								<td align="center">${item.content }</td>
								<td align="center">
									<fmt:formatDate value="${item.date}" type="both" pattern="yyyy-MM-dd HH:mm:ss" />
								</td>
							</tr>
						</c:forEach>
					<tr align="center">
						<td height="25" colspan="6" class="nzcms_table_top">
							<page:pagination pageBean="${pageBean}" url="msg_query.action" cssClass="txt_page" />
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>