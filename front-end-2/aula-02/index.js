const playerScored = () => {
  alert("Jogador pontuou");
  playerScore++;
};
const cpuScored = () => {
  alert("Máquina pontuou");
  cpuScore++;
};
let playerScore = 0;
let cpuScore = 0;
const playerWin = () => {
  alert("O jogador venceu");
};
const cpuWin = () => {
  alert("A máquina venceu");
};
const tie = () => {
  alert("Empate");
};

// testar quem foi o ganhador da rodada
const rockPaperScissors = () => {
  // captura a escolha do jogador (1, 2, 3)
  let playerChoice = parseInt(
    prompt(
      "Insira o valor desejado. 1 para pedra; 2 para papel; 3 para tesoura"
    )
  );
  // captura a escolha da máquina (random)
  let cpuChoice = parseInt(Math.random() * 3 + 1);

  switch (true) {
    case playerChoice == cpuChoice:
      tie();
      break;
    case playerChoice == 1 && cpuChoice == 2:
      cpuScored();
      break;
    case playerChoice == 1 && cpuChoice == 3:
      playerScored();
      break;
    case playerChoice == 2 && cpuChoice == 1:
      playerScored();
      break;
    case playerChoice == 2 && cpuChoice == 3:
      cpuScored();
      break;
    case playerChoice == 3 && cpuChoice == 1:
      cpuScored();
      break;
    case playerChoice == 3 && cpuChoice == 2:
      playerScored();
      break;
  }
};

// identificar o ganhador da partida
const match = () => {
    console.log("O jogo começou");
  while (playerScore < 2 && cpuScore < 2) {
      console.log("Iniciando uma rodada");
    rockPaperScissors();
    switch (true) {
      case playerScore == 2:
        return playerWin();
      case cpuScore == 2:
        return cpuWin();
    }
  }
};

match()