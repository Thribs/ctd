console.log([1,2,3].map(i => {return i}));
console.log([1,2,3].reduce(i => {return i}));
console.log([1,2,3].forEach(i => {return i}));
console.log([1,2,3].filter(i => {return i}));

let numerosDivididosPelaSoma = numeros.map(function(num){
    return num / numeros.reduce(function(acumulador, item){
        return acumulador + item;
    })
})
