<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>


<body class="container">

	<%@ include file="./fragments/header.html"%>

	<!-- Formulaire d'inscription -->

	<main>
		<div class="row d-flex justify-content-center">
			<form action="post">
				<div class="row">
					<label for="identifiant" class="col-2">Identifiant : </label> <input
						type="text" class="col-4" placeholder="Identifiant..." />
				</div>
				<br />
				<div class="row">
					<label for="password" class="col-2">Mot de passe : </label> <input
						type="password" class="col-4" placeholder="Mot de passe..." />
				</div>
				<br />
				<br />
				<div class="row">
					<div class="col-2">
						<input type="submit" />
					</div>
					<div class="col-4">
						<input type="checkbox" name="remember" id="remember" /> <label
							for="remember">Se souvenir de moi</label> <br /> <a href="#">Mot
							de passe oublié</a>
					</div>
				</div>
			</form>
		</div>
		<div class="row">
			<button class="col-6 my-5">
				<a href="#">Créer un compte</a>
			</button>
		</div>
	</main>

</body>

<jsp:include page="/WEB-INF/fragments/footer.html"></jsp:include>

</html>
