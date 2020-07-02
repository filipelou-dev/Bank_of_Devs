function iniciar(){
    let user = localStorage.getItem("usuarioLogado");
    if(!user){//usuario nao fez login
        window.location = "loginEmail.html";
    }

    let nomeUsuario = JSON.parse(user).nome;
    document.getElementById("user").innerHTML = nomeUsuario;
    carregarDados();
}

function logout(){
    localStorage.removeItem("usuarioLogado");
    window.location = "loginEmail.html";
}

function carregarDados(){
    fetch("http://localhost:8080/parceiro").then(res => res.json())
    .then(res => preencher(res));
}

function preencher(res){
    let texto=`<table> 
                <tr> 
                    <th>ID</th> 
                    <th>Nome</th> 
                    <th>Volume transacional</th>
                </tr>`;
for(let index = 0;index < res.length;index++){
    texto = texto +`<tr> 
                        <td>  ${res[index].id_agente} </td> 
                        <td> ${res[index].nome_agente}</td> 
                        <td> ${res[index].volume_transacional} </td>
                    </tr>`;
}
    texto = texto +"</table>";
    document.getElementById("conteudo").innerHTML = texto;
}