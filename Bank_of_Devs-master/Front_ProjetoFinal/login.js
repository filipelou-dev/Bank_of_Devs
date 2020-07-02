function acessarEmail(event) {
    event.preventDefault();

    let inputEmail = document.getElementById("inputEmail").value;
    let inputSenha = document.getElementById("inputSenha").value;
   

    /* alert(inputEmail + " - " + inputSenha); */

    let loginMsg = {
        email: inputEmail,
        senha: inputSenha
    }
    let cabecalho = {
        method: "POST",
        body: JSON.stringify(loginMsg),
        headers:{
            'Content-type':'application/json'
        }
    }
    fetch("http://localhost:8080/login", cabecalho).then(res => trataResposta(res))
}

function acessarRacf(event) {
    event.preventDefault();

    let inputRacf = document.getElementById("inputRacf").value;
    let inputSenha = document.getElementById("inputSenha").value;
   

    alert(inputRacf + " - " + inputSenha);

    let loginMsg = {
        racf: inputRacf,
        senha: inputSenha
    }
}

function trataResposta(res){
    
    if(res.status==200){//success
        /* document.getElementById("msgError").innerHTML = "Sucesso!"; */
        res.json().then(res => logarUsuario(res));
        window.location = "top10.html"
    }else{
        document.getElementById("msgError").innerHTML = "Usuário/Login inválido!";
    }
}

function logarUsuario(res){
    localStorage.setItem("usuarioLogado",JSON.stringify(res));

}


