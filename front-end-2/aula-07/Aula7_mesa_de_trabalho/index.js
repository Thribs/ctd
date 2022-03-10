const darkMode = () => {
    document.querySelector("body").classList.add("dark-mode-background");
    document.querySelector("h1").classList.add("dark-mode-title")
    const items = document.querySelectorAll(".item")
    items.forEach(item => {
        item.classList.add("dark-mode-item")
    })
    const textFields = document.querySelectorAll("h2, p")
    textFields.forEach(item => {
        item.classList.add("dark-mode-text")
    })
}

const lightMode = () => {
    document.querySelector("body").classList.remove("dark-mode-background");
    document.querySelector("h1").classList.remove("dark-mode-title")
    const items = document.querySelectorAll(".item")
    items.forEach(item => {
        item.classList.remove("dark-mode-item")
    })
    const textFields = document.querySelectorAll("h2, p")
    textFields.forEach(item => {
        item.classList.remove("dark-mode-text")
    })
}

const cards = document.querySelectorAll(".item");

const parent = document.querySelector(".container")
cards.forEach(card => card.remove());

// const insertCard = (parent, card) => {
//     parent.appendChild(card)
// }
// cards.forEach(card => insertCard(parent, card))

(function () {
    cards.forEach(card => parent.appendChild(card))
})();

/* 
Passo a passo para executar o desafio - Aula 7
1 - Criar a opção de escolha do felino 
2 - Verificar qual foi a escolha
3 - Definir uma url da internet
4 - Alteram o atributo "src"
*/


cards.forEach(card => {
const button = document.createElement('button');
button.innerText = "Trocar imagem";
button.onclick = () => {
    const imgSrc = prompt('Insira a URL da imagem que deseja')
    const img = button.parentElement.querySelector('img')
    img.setAttribute('src', imgSrc)
}
    card.appendChild(button)
})