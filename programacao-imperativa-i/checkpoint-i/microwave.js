const popcorn_time = 10;
const pasta_time = 8;
const meat_time = 15;
const beans_time = 12;
const brigadeiro_time = 8;

function item_time(item) {
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
}

function cook(item, time) {
  const correct_time = item_time(item);

  if (!correct_time) {
    console.log(`Prato ${item} não encontrado`);
    return;
  }

  if (time < correct_time) {
    console.log("Tempo insuficiente");
    return;
  }
  if (time >= correct_time * 3) {
    console.log("Kaboom!");
    return;
  }
  if (time >= correct_time * 2) {
    console.log(`O(a) ${item} queimou`);
    return;
  }
  console.log("Prato pronto. Bom apetite!");
}

cook("batata", 50);
cook("pipoca", 8);
cook("macarrão", 18);
cook("carne", 50);
cook("feijão", -10);
cook("brigadeiro", 9);