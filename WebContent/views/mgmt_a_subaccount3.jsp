<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <% String id=(String) request.getAttribute("id"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>帐户信息</title>
<META HTTP-EQUIV="imagetoolbar" CONTENT="no">
<link rel="shortcut icon" href="/images/fav.ico" type="image/x-icon" />
<link rel="icon" href="/images/fav.ico" type="image/x-icon" />
<link rel="bookmark" href="/images/fav.ico" type="image/x-icon" />
<link type="text/css" rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="js/jquery.min.1.7.2.js"></script>
<script type="text/javascript" src="js/top_search.js"></script>
<script type="text/javascript" src="js/main_nav.js"></script>
<script type="text/javascript" src="js/mgmt.js"></script>
<script type="text/javascript" src="js/backtop.js"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery.placeholder.min.js"></script>
<script type="text/javascript" src="js/focus_load.js"></script>
<%@ include file="jsTool.jsp" %>
<script type="text/javascript"> 
	$(function() {
		$('input, textarea').placeholder(); 
	});
</script>
</head>

<body onload="OnLoad()">

<%@ include file="qq.jsp"%>


<%@ include  file="topFrame.jsp"%>

<div id="main_frame">
	<a href="myinfo" hidefocus="true" class="a_text_main_title1">我的信息</a>&nbsp;&gt;&nbsp;我的帐户
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="230" class="td_leftnav_top">
                <div id="main_frame_left">
                	<%@ include  file="mysource_leftnav_mytrade.jsp"%>
                    <%@ include  file="mysource_leftnav_myresource.jsp"%>
                    <%@ include  file="mysource_leftnav_myplan.jsp"%>
                    <%@ include  file="mysource_leftnav_myanalysis.jsp"%>
                    <hr class="hr_2" />
                    <span class="text_mgmt_leftnav1"><span id="mgmt_nav_switch5a" class="span_mgmt_nav1" title="收起" onclick="mgmt_nav_switch5a();"></span><span id="mgmt_nav_switch5b" class="span_mgmt_nav2" title="展开" onclick="mgmt_nav_switch5b();"></span>我的帐户</span>
                    <div id="mgmt_nav5">
                         <a href="accountinfo" class="a_mgmt_leftnav" hidefocus="true">帐户信息</a>
                          <% if((Integer)session.getAttribute("userKind") ==3) {%><!-- 企业用户 -->
                        <a href="getsubaccount" class="a_mgmt_leftnav1" hidefocus="true">附属帐户</a>
                        <% } %>
                        <a href="getaddress" class="a_mgmt_leftnav" hidefocus="true">常用地址</a>
                        <a href="mysecurity" class="a_mgmt_leftnav" hidefocus="true">安全设置</a>
                    </div>
                </div>
			</td>
            <td class="td_leftnav_top">
            <c var="subAccount" items="${subAccount }">
				
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table_mgmt_right2a">
					<tr>
                    	<td>
                        	<span class="span_mgmt_right2_text1">更新附属帐户</span>
                            <span class="span_mgmt_right2_text2"><a href="javascript:history.go(-1);" hidefocus="true"><img src="images/btn_back1.png" class="span_mgmt_right2_pic1" title="返回" /></a></span>
                        </td>
                	</tr>
            	</table>
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table_mgmt_right3">
					<tr>
						<td class="td_mgmt_right3_td1a"> 
                            <br /> 
                            <form action="doupdate" method="post">
							<table width="90%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="120" height="40" class="td_mgmt_right3_td1b">帐户名称：</td>
									<td><input type="text" id="hostAccountName" name="hostAccountName" class="input_mgmt1" style="width:100px;" value="" readonly="readonly" />&nbsp;-&nbsp;
									<input type="text" class="input_mgmt1" style="width:180px;" value="" id="username" name="username" required/></td>
									<td><input type="hidden" value="<%=id %>" name="id" id="id"/></td>
								</tr>
								<tr>
									<td height="40" class="td_mgmt_right3_td1b">初始密码：</td>
									<td><input type="password" class="input_mgmt1" style="width:300px;" value="" id="password" name="password" placeholder="▪▪▪▪▪▪▪▪▪▪▪▪" required/></td>
								</tr>
								<tr>
									<td height="40" class="td_mgmt_right3_td1b">权限：</td>
									<td>
									<input type="checkbox" id="resourceManagement" name="resourceManagement"/>
                                      	  资源管理&nbsp;&nbsp;&nbsp; 
                                    <input type="checkbox" id="transactionManagement" name="transactionManagement"/>
                                      	  交易管理&nbsp;&nbsp;&nbsp; 
                                    <input type="checkbox" id="schemaManagement" name="schemaManagement"/>
                                      	  方案管理&nbsp;&nbsp;&nbsp;
                                     <input type="checkbox" id="statisticsManagement" name="statisticsManagement"/>
                                      	 统计分析&nbsp;&nbsp;&nbsp;  
                                    </td>
								</tr>
								<tr>
									<td height="40" class="td_mgmt_right3_td1b">备注：</td>
									<td>
                                    	<textarea class="textarea_rating" placeholder="请输入内容..." id="remarks" name="remarks" required></textarea>
                                    </td>
								</tr>
								<tr>
									<td height="40" class="td_mgmt_right3_td1b">&nbsp;</td>
									<td><input type="submit" id="btn1" value="提交" class="btn_mgmt1" hidefocus="true" /><!-- <input type="reset" id="btn1" value="重填" class="btn_mgmt2" hidefocus="true" /> --></td>
								</tr>
							</table>
						</form>

						</td>
					</tr>
				</table>
				</c>
			</td>
		</tr>
    </table>
</div>

<%@ include  file="popup1.jsp"%>

<div id="footer_frame">
	<iframe allowtransparency="true" width="100%" frameborder="0" hspace="0" marginheight="0" marginwidth="0" scrolling="no" vspace="0" src="footer.jsp"></iframe>
</div>

</body>
<script type="text/javascript">
	function OnLoad() {
		loadFocus();
		getSubAccountInfo();
	}
	
	//获取附属账户信息
	function getSubAccountInfo(){
		var url="getSubAccountInfoAjax";
		var id=$("#id").val();
		$.ajax({
			url:url,
			data:{id:id},
			cache:false,
			dataType:"json",
			success:function(data,status){
				var usernames=new Array();//前缀和后缀
				usernames=data["username"].split("-");
				$("#hostAccountName").val(usernames[0]);
				$("#username").val(usernames[1]);
				$("#remarks").text(data["remarks"]);
				if(data.resourceManagement =='on'){
					$("#resourceManagement").attr("checked","checked");
				}
				if(data.transactionManagement =='on'){
					$("#transactionManagement").attr("checked","checked");					
				}
				if(data.schemaManagement =='on'){
					$("#schemaManagement").attr("checked","checked");
				}
				if(data.statisticsManagement =='on'){
					$("#statisticsManagement").attr("checked","checked");
				}
			}
			
		});
	}
	
</script>
</html>