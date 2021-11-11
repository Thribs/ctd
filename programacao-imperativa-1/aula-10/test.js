function inverter(umArray) {
    const novo = [];
    novo[0] = umArray[2];
    novo[1] = umArray[1];
    novo[2] = umArray[0]
    return novo
}

console.log(inverter(['teste',1,2]));