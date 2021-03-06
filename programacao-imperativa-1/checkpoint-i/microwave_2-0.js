const popcorn_time = 10;
const pasta_time = 8;
const meat_time = 15;
const beans_time = 12;
const brigadeiro_time = 8;

const item_time = (item) => {
  switch (item) {
    case "pipoca":
      return popcorn_time;
    case "macarrão":
      return pasta_time;
    case "carne":
      return meat_time;
    case "feijão":
      return beans_time;
    case "brigadeiro":
      return brigadeiro_time;
  }
};

const cook = (item, time) => {
  const correct_time = item_time(item);
  const foodIsRaw = time < correct_time;
  const foodHasBurned = time >= correct_time * 2 && time < correct_time * 3;
  const foodHasExploded = time >= correct_time * 3;

  switch (true) {
    case !correct_time:
      return `Prato ${item} não encontrado`;

    case foodIsRaw:
      return "Tempo insuficiente";

    case foodHasBurned:
      return `O(a) ${item} queimou`;

    case foodHasExploded:
      return "Kaboom!";

    default:
      return "Prato pronto. Bom apetite!";
  }
};

console.log(cook("batata", 50));
console.log(cook("pipoca", 8));
console.log(cook("macarrão", 18));
console.log(cook("carne", 50));
console.log(cook("feijão", -10));
console.log(cook("brigadeiro", 9));
