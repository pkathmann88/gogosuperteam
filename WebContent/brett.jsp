<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="de.gogosuperteam.src.*" import="java.util.*" %>
	<%
	try {
		Commander commander = new Commander();
	
	%>                                                                              
<!doctype html>
<html>
<head>
<title>Forum Startseite</title>
<meta charset=utf-8>
<link rel="stylesheet" href="style.css">
<!--[if lt IE 9]>
                <script>
                        document.createElement('header');
                        document.createElement('article');
                        document.createElement('nav');
                        document.createElement('footer');
                </script>
                <![endif]-->
</head>

<body>
<div id="background">

<header>
<a class="home" href="#">&nbsp;</a>
<div id="headline">Hallo USER XY, Willkommen im Forum</div>
        <nav class="vertical">
        <ul class="topmenu">
                <li class="first"><a href="startseite.html">&Uuml;bersicht</a></li>
                <li><a href="startseite.html">Administration</a></li>
                <li><a href="startseite.html">Mitglieder</a></li>
                <li><a href="startseite.html">Ausloggen</a></li>
        </ul></nav>

</header>

<div id="content">

<%
Forum forum = commander.getForum(Integer.decode(request.getParameter("id")));
List<de.gogosuperteam.src.Thread> threadList = new LinkedList<de.gogosuperteam.src.Thread>();
threadList.addAll(forum.getThreadList());
%>

<table>
<tr><td class="kat" colspan="3"><%= forum.getName() %></td></tr>

<% 
for(int i = 0; i < threadList.size(); i++) {
	int posts = 0;
	Post oldest = null;
	List<Post> tempPosts = new LinkedList<Post>();
	tempPosts.addAll(threadList.get(i).getPosts().values());
	for(int j = 0; j < tempPosts.size(); j++) {
		posts++;
		if(oldest == null || tempPosts.get(j).getErstelldatum().compareTo(oldest.getErstelldatum()) < 0) {
			oldest = tempPosts.get(j);
		}
	}
	
	User user = commander.getUser(oldest.getErstellerId());
%>
	<tr><td class="first"><a href="thema.jsp?id=<%= threadList.get(i).getId() %>"><%= threadList.get(i).getTitel() %></a></td><td><%= threadList.get(i).getPosts().size() %> Antworten</td><td>Letzter Beitrag von <%= user.getName() %><br>am <%= oldest.getErstelldatum().toLocaleString() %></td></tr>
<%
}
%>
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 2</a></td><td>4 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 3</a></td><td>3 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 4</a></td><td>5 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 5</a></td><td>4 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 6</a></td><td>3 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 7</a></td><td>5 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 8</a></td><td>4 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 9</a></td><td>3 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 10</a></td><td>5 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 11</a></td><td>4 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
<!-- <tr><td class="first"><a href="thema.html">Beitrag Nummer 12</a></td><td>3 Antworten</td><td>Letzter Beitrag von User1<br>am 30. Oktober 2014, 21:06:27</td></tr> -->
</table>

</div>
<footer><nav class="footer"><ul class="topmenu">
                <li class="first"><a href="#">Kontakt</a></li>
                <li><a href="#">Impressum</a></li>

        </ul></nav>
</footer>
</div>
<%
} catch (Exception e) {
	out.print(e);
}
%>
</body>
</html>