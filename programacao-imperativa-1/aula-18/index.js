// let array = []
// let str = "olá"
// str.forEach( function( i ) { array.push( i ) })

// console.log(array);

const arrayWithZeros = [false, 1, 0, 2, 0, 1, 3, "a"];

const moveZeros = (array) => {
  // remover cada zero do parametro array e guardar esse zero no arrayOfZeros
  let arrayWithoutZeros = [].push;
  let arrayOfZeros = [];
  array.forEach( (valor, index) => {
      valor == 0 ? arrayOfZeros.push(array[index]) : arrayWithoutZeros.push(array[index]);
  });
  // retornar a concatenação do arrayWithoutZeros com o arrayOfZeros
    return arrayWithoutZeros.concat(arrayOfZeros);
}

const moveZerosTwoPointOh = (array) => array.filter( i => i !== 0 ? 1 : 0)

console.log(moveZerosTwoPointOh(arrayWithZeros));
