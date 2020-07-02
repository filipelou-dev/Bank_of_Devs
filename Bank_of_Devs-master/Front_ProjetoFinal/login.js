function acessarEmail(event) {
    event.preventDefault();

    let inputEmail = document.getElementById("inputEmail").value;
    let inputSenha = document.getElementById("inputSenha").value;
   

    alert(inputEmail + " - " + inputSenha);

    let loginMsg = {
        email: inputEmail,
        senha: inputSenha
    }
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




