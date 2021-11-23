// Descrição do problema
// A partir de um banco eles entram em contato conosco para criar um aplicativo que
// possa facilitar o manuseio de informações e facilitar as ações que ele precisa.
// Nosso líder de tecnologia nos pede para pensar em como representar usuários, ou
// contas bancárias, em vez disso. Cada uma dessas contas tem as seguintes
// informações:

// ● Número da conta (somente números)
// ● Tipo de conta (conta corrente ou poupança em $)
// ● Saldo em $ (valor apenas)
// ● Titular da conta (nome completo)

// Com essa informação em mente, somos solicitados a fazer o seguinte.
// 1. Pense na melhor forma de representar tais contas, e por quê? (discutir coma
// equipe sobre as diferentes estruturas e qual é a mais conveniente)


// 2. Uma vez decidido qual será o tipo de dados para representar as contas das
// contas, crie uma conta de teste e verifique se as propriedades mencionadas
// acima são criadas corretamente.

// 3. Agora que sabemos como representar usuários e suas contas, o cliente nos
// forneceu uma lista de contas
const accountsList = [
    [5486273622,	"Conta Corrente",	27771,	"Abigael Natte"],
    [1183971869,	"Conta Poupança",	8675,	"Ramon Connell"],
    [9582019689,	"Conta Poupança",	27363,	"Jarret Lafuente"],
    [1761924656,	"Conta Poupança",	32415,	"Ansel Ardley"],
    [7401971607,	"Conta Poupança",	18789,	"Jacki Shurmer"],
    [630841470,	    "Conta Corrente",	28776,	"Jobi Mawtus"],
    [4223508636,	"Conta Corrente",	2177,	"Thomasin Latour"],
    [185979521,	    "Conta Poupança",	25994,	"Lonnie Verheijden"],
    [3151956165,	"Conta Corrente",	7601,	"Alonso Wannan"],
    [2138105881,	"Conta Poupança",	33196,	"Bendite Huggett,"] 
]
// numero	tipo	saldo	titular
// que devemos ser capazes de criar. Para isso,
// devemos gerar uma função construtora que facilite a criação das contas
// bancárias correspondentes mais rapidamente.
// O líder tecnológico está muito feliz com nosso trabalho até agora. A essa altura já
// temos um banco de dados com 10 clientes do banco, provavelmente alojados em 10
// variáveis diferentes (assumindo que cada variável é um objeto que foi criado com
// uma função construtora). A partir disso, eles nos pedem as seguintes características.

// 4. A partir dos 10 usuários, gereuma lista onde todos eles convergem (lista de
// objetos)

// 5. Também nos pedem a criação de um objeto literal chamado banco que terá
// uma propriedade chamada clientes, ele será composto pela lista de objetos
// gerados no ponto anterior.

// 6. o objeto do banco criará um método chamado consultarCliente que receberá um
// nome (titular) por parâmetro e deve pesquisar na lista de contas e retornar ao
// objeto do cliente que corresponde a esse nome inserido.

// 7. Crie outro método chamado depósito que receberá como parâmetros, o titular
// da conta e uma quantidade de dinheiro para depositar. O método deve chegar
// à conta correspondente e, em seguida, adicionar a quantidade de dinheiro para
// depositar o saldo da conta, então você deve dar um aviso pelo console com a
// mensagem Depósito realizado, seu novo saldo é: xxx .

// 8. Crie um último método chamado saque que também receberá dois
// parâmetros, o titular da conta e o valor a ser extraído. O método deve obter a conta correspondente e subtrair o valor do saldo atual. Caso o resultado seja
// inferior a 0, você deve imprimir uma mensagem através do console de Fundos
// insuficientes,caso contrário você deve imprimir Extração feita com sucesso, seu
// novo saldo é: xxx