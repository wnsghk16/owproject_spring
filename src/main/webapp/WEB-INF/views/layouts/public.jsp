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
<tiles:insertAttribute name="content"/>
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
  .font{
    color: #ffffff;
  }
</style>
</html>

