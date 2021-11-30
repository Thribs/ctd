function bomDia(nome, sobrenome) {
//   return "Bom dia, " + nome + " " + sobrenome;
  return "Bom dia, " + nome + " " + sobrenome;
};

function boaTarde(nome, sobrenome) {
//   return "Boa tarde, " + nome + " " + sobrenome;
  return "Boa tarde, " + nome + " " + sobrenome;
};

function cumprimentar(nome, sobrenome, funcaoDeRetorno) {
  return funcaoDeRetorno(nome, sobrenome);
}

console.log(cumprimentar("Amanda", "Ferreira", bomDia));
// console.log("Bom dia, " + "Amanda" + " " + "Ferreira");

console.log(cumprimentar("Amanda", "Ferreira", boaTarde));
// console.log("Boa tarde, " + "Amanda" + " " + "Ferreira");