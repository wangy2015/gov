<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="../css/admin_css.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../easyui/themes/icon.css">
<script type="text/javascript" src="../easyui/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../easyui/easyloader.js"></script>
<script type="text/javascript">
    function check() {
		var mc = $("#mc");
		var px = $("#px");
		if (mc.val() == "") {
			alert("推荐位名称不能为空！");
			mc.focus();
			return;
		}
		if (px.val() == "") {
			alert("推荐位序号不能为空！");
			px.focus();
			return;
		}
        if (isNaN(px.val())) {
            alert("顺序请输入数字！");
            px.select();
            return;
        }
		$("#myform").submit();
	}
</script>
</head>
<body>
<form name="myform" id="myform" action="position_update.action" method="post">
    <input type="hidden" name="position.id" value="${position.id}" />
    <table width="0" height="6" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td></td>
        </tr>
    </table>
    <table width="100%"  border="1" align="center" cellpadding="5" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#C4D8ED">
      <tr bgcolor="#D2E8F6">
        <td height="40" align="center" class="nzcms_table_top" ><a href="javascript:$('#news').toggle();void(0);">说明书<img src="images/help.png" alt="问" border="0" /></a></td>
        <td height="40" align="center" class="nzcms_table_top" >
          修改推荐位
      </td>
    </tr>
    <tr bgcolor="#D2E8F6">
      <td height="40" colspan="2" align="left" class="zfb"  id='news' style='DISPLAY:none '>
       <strong>添加说明书：</strong><br /><ol> <li>在此页面修改推荐位；</li>
      </ol></td>
    </tr>
    <tr bgcolor="#FFFFFF">
      <td height="30" align="center" bgcolor="#E4EDF9" >推荐位名称：</td>
      <td height="30" valign="middle" class="gray" ><input name="position.mc" id="mc" type="text" size="50" value="${position.mc}">
      <font color="red">*</font></td>
    </tr>
    <tr bgcolor="#FFFFFF">
      <td height="30" align="center" bgcolor="#E4EDF9" >推荐位序号：</td>
      <td height="30"><input name="position.px" id="px" type="text" value="${position.px}" />
          <font color="red">*</font>&nbsp;&nbsp;<font color="gray">根据推荐位序号进行排序</font></td>
    </tr>
    <tr bgcolor="#FFFFFF">
      <td width="10%" height="30" bgcolor="#E4EDF9" >&nbsp;</td>
      <td height="30"><input type="button" class="button" value=" 提 交 " onclick="check();">
          <input type="reset" class="button" value=" 重 来 ">
          <input type="button" class="button" onClick="history.go(-1);" value=" 返 回 "></td>
    </tr>
</table>
</form>
</body>
</html>