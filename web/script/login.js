function campoUserFocus(){
	var campo = document.getElementById("user");
	if (campo.value == 'Usuário'){
		campo.value='';
		campo.style.color = '#000';
	}
}

function campoUserBlur(){
	var campo = document.getElementById("user");
	if (campo.value == ''){
		campo.value='Usuário';
		campo.style.color = '#CCC';
	}
}

function campoPassFocus(){
	var campo = document.getElementById("pass");
	if (campo.value == 'Senha'){
		campo.value='';
		campo.style.color = '#000';
		campo.type = 'password';
	}
}

function campoPassBlur(){
	var campo = document.getElementById("pass");
	if (campo.value == ''){
		campo.value='Senha';
		campo.style.color = '#CCC';
		campo.type = 'text';
	}
}

function prof () {
	var campo = document.getElementById("user");
	if(campo.value == "professor")
		window.location.href = "indexprof.html";
	else
		window.location.href = "index.html";
}