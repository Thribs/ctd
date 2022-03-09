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
console.log(typeof cards);

const parent = document.querySelector(".container")
cards.forEach(card => card.remove());

// const insertCard = (parent, card) => {
//     parent.appendChild(card)
// }
// cards.forEach(card => insertCard(parent, card))

(function () {
    cards.forEach(card => parent.appendChild(card))
})();
  