function somarArray(umArray) {
  let soma = 0;
  while (umArray.length) {
    const item
    // TODO: if item is a string, ignore the iteration
    soma += umArray.pop();
  }
  return soma;
}
console.log(somarArray([5, 10, 20, 5, -5, "a"]));