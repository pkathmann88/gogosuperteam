<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="de.gogosuperteam.src.*" import="java.util.*" %>
	<%
	try {
		Commander commander = new Commander();
	
	%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Forum</title>
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
<!-- 			<div class="login"> -->
<!-- 				<form method="post" action="LoginServlet"> -->
<!-- 					<label for="un">Username</label> <input type="text" name="username" -->
<!-- 						id="un" /><br> <label for="pe">Password</label> <input -->
<!-- 						type="password" name="password" id="pw" /><br> <input -->
<!-- 						type="submit" value="Login"> -->
<!-- 				</form> -->
<!-- 			</div> -->
			<div id="headline"></div>
			<nav class="vertical">
				<ul class="topmenu">
					<li class="first"><a href="startseite.html">&Uuml;bersicht</a></li>
					<li><a href="startseite.html">Administration</a></li>
					<li><a href="startseite.html">Mitglieder</a></li>
					<li><a href="startseite.html">Ausloggen</a></li>
				</ul>
			</nav>

		</header>

		<div id="content">

<% 
				List<Forum> forums = new LinkedList<Forum>();
				forums.addAll(commander.getForums().values());
%>

			<table>
				<tr>
					<td class="kat" colspan="3">Allgemeines</td>
				</tr>
				<% 
					for(int i = 0; i < forums.size(); i++) {
						Post oldest = null;
						int posts = 0;
						de.gogosuperteam.src.Thread oldestThread = null;
						List<Post> tempPosts = new LinkedList<Post>();
						List<de.gogosuperteam.src.Thread> threadList = new LinkedList<de.gogosuperteam.src.Thread>();
						threadList.addAll(forums.get(i).getThreadList());
						
						int threads = threadList.size();
						
						for(int j = 0; j < threads; j++) {
							tempPosts.addAll(threadList.get(j).getPosts().values());
							System.out.println(tempPosts.size());
							for(Post post : tempPosts) {
								posts++;
								if(oldest == null || post.getErstelldatum().compareTo(oldest.getErstelldatum()) < 0) {
									oldest = post;
									oldestThread = threadList.get(j);
								}
							}
							tempPosts.clear();
						}
						threadList.clear();
						User oldestPostUser = commander.getUser(oldest.getErstellerId());
				%>
				<tr>
					<td class="first"><a href="brett.jsp?id=<%= forums.get(i).getId() %>">Neues</a><br> <span
						class="beschreibung"></span></td>
					<td><span class="info"><%= posts %> Beitr&auml;ge<br><%= threads %> Themen
					</span></td>
					<td>Letzter Beitrag von <%= oldestPostUser.getName() %><br>in <a href="thema.jsp?id=<%= oldestThread.getId() %>""><%= oldestThread.getTitel() %></a><br>
						am <%= oldest.getErstelldatum().toLocaleString() %>
					</td>
				</tr>
				<%
					}
				%>
<!-- 				<tr> -->
<!-- 					<td class="first"><a href="brett.html">Allgemeine Fragen -->
<!-- 							zum Wiki</a><br> <span class="beschreibung">Hier ist -->
<!-- 							Platz f&uuml;r alle Fragen rund um das Wiki</span></td> -->
<!-- 					<td><span class="info">5 Beitr&auml;ge<br>3 Themen -->
<!-- 					</span></td> -->
<!-- 					<td>Letzter Beitrag von User1<br>in <a href="thema.html">Beitrag -->
<!-- 							Nummer 2</a><br>am 30. Oktober 2014, 21:06:27 -->
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td class="first"><a href="brett.html">Allgemeine Fragen -->
<!-- 							zum Forum</a><br> <span class="beschreibung">Hier ist -->
<!-- 							Platz f&uuml;r alle Fragen rund um das Forum</span></td> -->
<!-- 					<td><span class="info">5 Beitr&auml;ge<br>3 Themen -->
<!-- 					</span></td> -->
<!-- 					<td>Letzter Beitrag von User1<br>in <a href="thema.html">Beitrag -->
<!-- 							Nummer 3</a><br>am 30. Oktober 2014, 21:06:27 -->
<!-- 					</td> -->
<!-- 				</tr> -->
			</table>

			<table>
				<tr>
					<td class="kat" colspan="3">Funktionen</td>
				</tr>
				<tr>
					<td class="first"><a href="brett.html">Beitr&auml;ge
							erstellen</a><br> <span class="beschreibung">Hier wird
							alles rund um die Beitragserstellung im Wiki besprochen</span></td>
					<td><span class="info">5 Beitr&auml;ge<br>3 Themen
					</span></td>
					<td>Letzter Beitrag von User1<br>in <a href="thema.html">Beitrag
							Nummer 1</a><br>am 30. Oktober 2014, 21:06:27
					</td>
				</tr>
				<tr>
					<td class="first"><a href="brett.html">Funktionen des
							Forums</a><br> <span class="beschreibung">Hier ist Platz
							f&uuml;r Diskussionen rund um das Forum</span></td>
					<td><span class="info">5 Beitr&auml;ge<br>3 Themen
					</span></td>
					<td>Letzter Beitrag von User1<br>in <a href="thema.html">Beitrag
							Nummer 2</a><br>am 30. Oktober 2014, 21:06:27
					</td>
				</tr>
			</table>


			<table>
				<tr>
					<td class="kat" colspan="3">Inhalte</td>
				</tr>
				<tr>
					<td class="first"><a href="brett.html">Wikibeitr&auml;ge</a><br>
						<span class="beschreibung">Hier ist Platz f&uuml;r
							Diskussionen rund um alle Wiki-Beitr&auml;ge</span></td>
					<td><span class="info">5 Beitr&auml;ge<br>3 Themen
					</span></td>
					<td>Letzter Beitrag von User1<br>in <a href="thema.html">Beitrag
							Nummer 3</a><br>am 30. Oktober 2014, 21:06:27
					</td>
				</tr>
			</table>

		</div>
		<footer>
			<nav class="footer">
				<ul class="topmenu">
					<li class="first"><a href="#">Kontakt</a></li>
					<li><a href="#">Impressum</a></li>

				</ul>
			</nav>
		</footer>
	</div>
	<%
} catch (Exception e) {
	out.print(e);
}
%>
</body>
</html>