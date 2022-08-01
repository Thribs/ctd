const acaoCarro = acao => acao();

const rodar = () => console.log("O carro está andando");
const parar = () => console.log("O carro parou");

acaoCarro(rodar);
acaoCarro(parar);