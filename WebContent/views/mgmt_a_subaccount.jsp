<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
            
             
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table_mgmt_right2">
					<tr>
                    	<td>
                        	<span class="span_mgmt_right2_text1">附属帐户</span>
                            <span class="span_mgmt_right2_text2"><a href="addsubaccount" hidefocus="true"><img src="images/btn_add1.png" class="span_mgmt_right2_pic1" title="添加" /></a></span>
                            <div class="div_mgmt_s1">
                            	<input name="username" id="username" type="text" class="input_mgmt1" style="width:200px;"placeholder="账户名称" />
                                <input type="button" id="btn1" value="查询" class="btn_mgmt3" hidefocus="true" onclick="OnLoad()"/>
                            </div>
                        </td>
                	</tr>
            	</table>
            	<!-- 页码相关 -->
				<input id="count" value="" type="hidden" /><!--  总记录条数 -->
				<input id="display" value="10" type="hidden" /> <!-- 每页展示的数量 -->
				<input id="currentPage" value="1" type="hidden" /><!-- 当前页 -->
				<input id="is_resource_page" value="0" type="hidden"/><!-- 是否为资源页，资源页需要模拟click按钮 -->
				<input id="kind" value="subAccount" type="hidden"/><!-- 用于判断是哪一栏的分页,用于splitPage.js -->
            	
            	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table_mgmt_right3">
            		<thead>
					<tr>
                        <td width="20" height="40" class="td_mgmt_right3_head">&nbsp;</td>
                        <td class="td_mgmt_right3_head">帐户名称</td>
                        <td width="80" class="td_mgmt_right3_head">创建时间</td>
                        <td width="60" class="td_mgmt_right3_head">状态</td>
                        <td width="80" class="td_mgmt_right3_head">操作</td>
					</tr>
            		</thead>
            		<tbody id="result_body">
            		</tbody>
					<%-- <c:forEach var="subAccount" items="${subAccountList }">
				
                    
                    <tr>
                        <td height="60" class="td_mgmt_right3_td1d">&nbsp;</td>
                        <td class="td_mgmt_right3_td1">${subAccount.username }</td>
                        <td class="td_mgmt_right3_td1">${subAccount.relDate }</td>
                        <td class="td_mgmt_right3_td2">${subAccount.status }</td>
                        <td class="td_mgmt_right3_td3">
                            <div id="handlebox" style="z-index:203;">
                                <ul class="quickmenu">
                                    <li class="menuitem">
                                        <div class="menu">
                                            <a href="subaccountdetail?id=${subAccount.id }" class="menuhd" hidefocus="true">查看</a>
                                            <div class="menubd">
                                                <div class="menubdpanel">
                                                    <a href="getUpdateSubAccountPage?id=${subAccount.id }" class="a_top3" hidefocus="true">更新</a>
                                                    
                                                   <c:choose>
                                                    <c:when test="${subAccount.status == '正常' }">
                       								<a href="changestatus?id=${subAccount.id }" class="a_top3" hidefocus="true">停用</a>
                                                   </c:when>
                        							<c:when test="${subAccount.status == '已停用' }">
                       								<a href="changestatus?id=${subAccount.id }" class="a_top3" hidefocus="true">启用</a>
                                                    </c:when>	
                                                    </c:choose>
                                                    		
                      								<a href="deletesubaccount?id=${subAccount.id }" class="a_top3" hidefocus="true">删除</a>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </td>
                        
                	
                    </tr>
                    </c:forEach> --%>
                </table>
				<table border="0" cellpadding="0" cellspacing="0" class="table_recordnumber">
                    <tr>
	                    <td>
                            每页
                            <select id="Display" onchange="changeDisplay()">
						<option value="10" selected="selected">10</option>
						<option value="20">20</option>
						<option value="50">50</option>
							</select>
                            条记录
                        </td>
                    </tr>
				</table>
                <table border="0" cellpadding="0" cellspacing="0" class="table_pagenumber" id="page_layout" >
                  <!--  page -->
				</table>
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
		var username=$("#username").val();
		var display=$("#display").val();
		var currentPage=$("#currentPage").val();
		getSubAccountList(username,display,currentPage);
		getSubAccountListTotalRows(username,display,currentPage);
		
	}
	
	//获取附属账户
	function getSubAccountList(username,display,currentPage){
		var url="getSubAccountAjax";
		$.ajax({
			url:url,
			dataType:"json",
			cache:false,
			data:{
				username:username,
				display:display,
				currentPage:currentPage
			},
			success:function(data,status){
				var body=$("#result_body");
				body.empty();
				for(var i=0;i<data.length;i++){
					var str="<tr>";
					str+="<td height=\"60\" class=\"td_mgmt_right3_td1d\">&nbsp;</td>";
					str+="<td class=\"td_mgmt_right3_td1\">"+data[i].username+"</td>";
					str+="<td class=\"td_mgmt_right3_td1\">"+renderTime(data[i].relDate)+"</td>";
					str+="<td class=\"td_mgmt_right3_td2\">"+data[i].status+"</td>";
					str+="<td class=\"td_mgmt_right3_td3\">";
					str+="<div id=\"handlebox\" >";
					str+="<ul class=\"quickmenu\">";
					str+="<li class=\"menuitem\">";
					str+="<div class=\"menu\">";
					str+="<a href=\"subaccountdetail?id="+data[i].id+"\" class=\"menuhd\" hidefocus=\"true\" style=\"z-index:106;\" >查看</a>";
					str+="<div class=\"menubd\">";
					str+="<div class=\"menubdpanel\">";
					str+="<a href=\"getUpdateSubAccountPage?id="+data[i].id+"\" class=\"a_top3\" hidefocus=\"true\">更新</a>";
					if(data[i].status== '正常'){
						str+="<a href=\"changestatus?id="+data[i].id+"\" class=\"a_top3\" hidefocus=\"true\">停用</a>";
					}else if(data[i].status== '已停用'){
						str+="<a href=\"changestatus?id="+data[i].id+"\" class=\"a_top3\" hidefocus=\"true\">启用</a>";
					}
					str+="<a href=\"deletesubaccount?id="+data[i].id+"\" class=\"a_top3\" hidefocus=\"true\">删除</a>";
					str+="</div></div></div></li></ul></div></td>";
					str+="</tr>";
					body.append(str);
				}
				
			}
		});
	}
	//总记录条数
	function getSubAccountListTotalRows(username,display,currentPage){
		var url="getSubAccountTotalRowsAjax";
		$.ajax({
			url:url,
			dataType:"json",
			cache:false,
			data:{
				username:username,
				display:display,
				currentPage:currentPage
			},
			success:function(data,status){
				 $('#count').val(data);
				 $("#page_layout").empty();
				  pageLayout(data);//页面布局
			}
		});
	}
	
	//变更每页展示数量
	function changeDisplay(){
		//修改隐藏字段，每页数量
		$("#display").val($("#Display").val());
		//当前页归1
		$("#currentPage").val(1);
			var display=$("#display").val();
			var currentPage=$("#currentPage").val();
			var username=$("#username").val();
			getSubAccountList(username,display,currentPage);
			getSubAccountListTotalRows(username,display,currentPage);
	}
</script>
</html>