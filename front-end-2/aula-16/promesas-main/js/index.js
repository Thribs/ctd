const fetchDatabase = () => fetch("./data.json").then(response => response.json());
fetchDatabase()
    .then(data => console.log(data));

let consultandoBaseDeDados = new Promise((resolve, reject) => {
    // Aqui temos uma solicitação simulada para um banco de dados, com um atraso de 2 segundos.
    //A lógica interna estará  no servidor e nós apenas esperaríamos por uma resposta.
    setTimeout(function () {
        fetchDatabase()
            .then(data => resolve(data))
            .catch(err => reject(err));
    }, 2000);

});

// Aqui realizamos uma consulta da promessa, aguardando sua resposta assíncrona
consultandoBaseDeDados
    .then((data) => {
        console.log(data);
        const users = data.resultado;
        users.forEach(user => renderUserCard(user));
    })
    .catch((err) => {
        console.log(err);
    });

function renderUserCard(userData) {
    /* -------------------------------- TAREFAS -------------------------------- */
    // Aqui  devem desenvolver uma função que é exibida na tela:
    // a foto, o nome completo do usuário e seu e-mail.
    //  Isso deve ser baseado nas informações que chegam até nós e  são inseridas no HTML.
    //  Dica: você pode manipular o CSS e estruturar o card ao seu gosto.
    const card = document.querySelector('.tarjeta');
    const img = document.createElement('img');
    img.src = userData.imagem.media;
    const name = document.createElement('h1');
    name.innerText = userData.nome.primeiro + ' ' + userData.nome.ultimo;
    const email = document.createElement('h2');
    email.innerText = userData.email;
    card.appendChild(img);
    card.appendChild(name);
    card.appendChild(email);
}