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
				</ul>
			</nav>

		</header>

		<div id="content">

			<%
				de.gogosuperteam.src.Thread thread = commander.getThread(Integer.decode(request.getParameter("id")));
				List<Post> posts = new LinkedList<Post>();
				posts.addAll(thread.getPosts().values());
				int count = 5;
			%>

			<table>
				<tr>
					<td class="kat" colspan="2">Beitrag Nummer 1</td>
				</tr>
				<%
					for(int i = 0; i < posts.size(); i++) {
						User user = commander.getUser(posts.get(i).getErstellerId());
				%>
				<tr>
					<td class="beitrag">
						<%
						out.print(posts.get(i).getText());
						%>
					</td>
					<td>
						<%
						out.print(posts.get(i).getThema() + " von " + user.getName()  + " am " + posts.get(i).getErstelldatum().toLocaleString());
						%>
					</td>
				</tr>
				<%
					}
				%>
			</table>

			<form action="#" method="post" accept-charset="UTF-8"
				name="postmodify" id="postmodify" onsubmit="submitonce(this);">
				<div class="quickReplyContent">
					Schnellantwort:<br>
					<br>
					<textarea cols="109" rows="5" name="message" tabindex="1"></textarea>
				</div>
				<div class="righttext padding">
					<input type="submit" name="post" value="Schreiben" onclick="return submitThisOnce(this);" accesskey="s"
						tabindex="2" class="button_submit" />
				</div>
			</form>

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
	} catch (Exception e) { }
%>
</body>
</html>