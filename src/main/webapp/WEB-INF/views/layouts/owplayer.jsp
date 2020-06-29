<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
<tiles:insertAttribute name="header"/>
</head>
<body>
<tiles:insertAttribute name="navigator"/>
<tiles:insertAttribute name="owplayer"/>
<footer class="v-footer py-4 v-sheet theme--dark" data-booted="true">
	<tiles:insertAttribute name="footer"/>
</footer>
</body>
<script>
$('#join').click(function(){
	location.href= "${context}/member/join/form"
})	
$('#home').click(function(){
	location.href= "${context}/"
})	
$('#owplayer').click(function(){
	location.href= "${context}/owplayer/list/form"
})
$('#owteam').click(function(){
	location.href= "${context}/owteam/list/form"
})
</script>
<style>
  .google{
        width: 140px;
        height: 45px;
        margin-right: 20px;
    }
    .search{
        width: 550px;
        height: 40px;
        font-size: 15pt;
        box-shadow: 3px 3px 5px #C3C3C3;
        border: 1px solid #EAEAEA;
    }
    .top{
        text-align: center;
        margin: 10px;
    }
    .image{
        width: 100px;
        height : 100px;
    }
</style>
</html>

