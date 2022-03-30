import random
import sys

userScore = 0
pcScore = 0
totalScore = 0

def userWin():
    global userScore
    userScore += 1
def pcWin():
    global pcScore
    pcScore += 1
def gamePlayed():
    global totalScore
    totalScore += 1

def percent():
    if totalScore > 0:
        x = ((totalScore - pcScore) / totalScore) * 100
        return x
    elif totalScore == 0:
        x = 0
        return x

def get_int():
    userdata = input("Digite um número, ou 's' para sair do programa ")
    if userdata == 's':
        print ("Nos vemos!")
        sys.exit()
    try:
        user_num = int(userdata)
        return user_num
    except ValueError:
        print("Precisa de um número para continuar: ")
        return(get_int())


 

while True: 
    aleatorio = random.randrange(0, 5)
    escolhaPc = ""
    again = ""
    print("1) Pedra")
    print("2) Papel")
    print("3) Tesoura")
    print("4) Lagarto")
    print("5) Spock")
    print("6) Show Scores")
    opcao = get_int()
    
    if opcao == 1:
        escolhaUsuario = "pedra"
    elif opcao == 2:
        escolhaUsuario = "papel"
    elif opcao == 3:
        escolhaUsuario = "tesoura"
    elif opcao == 4:
        escolhaUsuario = "lagarto"
    elif opcao == 5:
        escolhaUsuario = "spock"
    elif opcao == 6:
        print ("Pontuações: ")
        print ("Usuário: ", userScore)
        print ("Pc: ", pcScore)
        print ("Porcentagem de vitórias: ", percent(), "% " )
        continue

    else:
        print("Opção Invalida")
        continue
        
    print("Você escolheu: ", escolhaUsuario)    
    if aleatorio == 0:
        escolhaPc = "pedra"
    elif aleatorio == 1:
        escolhaPc = "papel"
    elif aleatorio == 2:
        escolhaPc = "tesoura"
    elif aleatorio == 3:
        escolhaPc = "lagarto"
    elif aleatorio == 4:
        escolhaPc = "spock"
    print("PC escolheu: ", escolhaPc)
    print("...")     
    
    escolhasDict = {
        escolhaPc == "pedra" and escolhaUsuario == "papel": ["Ganhou, papel cobre pedra", userWin],
        escolhaPc == "pedra" and escolhaUsuario == "papel": ["Ganhou, papel cobre pedra", userWin],
        escolhaPc == "papel" and escolhaUsuario == "tesoura": ["Ganhou, tesoura corta papel", userWin],
        escolhaPc == "tesoura" and escolhaUsuario == "pedra": ["Ganhou, pedra amassa tesoura", userWin],
        escolhaPc == "lagarto" and escolhaUsuario == "pedra": ["Ganhou, pedra esmaga a lagarto", userWin],
        escolhaPc == "lagarto" and escolhaUsuario == "tesoura": ["Ganhou, tesoura decapita a Lagarto", userWin],
        escolhaPc == "tesoura" and escolhaUsuario == "spock": ["Ganhou, Spock quebra tesoura", userWin],
        escolhaPc == "spock" and escolhaUsuario == "lagarto": ["Ganhou, lagarto envenena a Spock", userWin],
        escolhaPc == "papel" and escolhaUsuario == "lagarto": ["Ganhou, lagarto come papel", userWin],
        escolhaPc == "spock" and escolhaUsuario == "papel": ["Ganhou, papel refuta a Spock", userWin],
        escolhaPc == "pedra" and escolhaUsuario == "spock": ["Ganhou, Spock vaporiza pedra", userWin],
        escolhaUsuario == "pedra" and escolhaPc == "papel": ["Perdeu, papel cobre pedra", pcWin],
        escolhaUsuario == "papel" and escolhaPc == "tesoura": ["Perdeu, tesoura corta papel", pcWin],
        escolhaUsuario == "tesoura" and escolhaPc == "pedra": ["Perdeu, pedra amassa tesoura", pcWin],
        escolhaUsuario == "lagarto" and escolhaPc == "pedra": ["Perdeu, pedra esmaga a lagarto", pcWin],
        escolhaUsuario == "lagarto" and escolhaPc == "tesoura": ["Perdeu, tesoura decapita a Lagarto", pcWin],
        escolhaUsuario == "tesoura" and escolhaPc == "spock": ["Perdeu, Spock quebra tesoura", pcWin],
        escolhaUsuario == "spock" and escolhaPc == "lagarto": ["Perdeu, lagarto envenena a Spock", pcWin],
        escolhaUsuario == "papel" and escolhaPc == "lagarto": ["Perdeu, lagarto come papel", pcWin],
        escolhaUsuario == "spock" and escolhaPc == "papel": ["Perdeu, papel refuta a Spock", pcWin],
        escolhaUsuario == "pedra" and escolhaPc == "spock": ["Perdeu, Spock vaporiza pedra", pcWin],
        escolhaPc == escolhaUsuario: ["Empate", None],
    }
    [message, callback] = escolhasDict[True]
    print(message)
    if callable(callback): callback()
    gamePlayed()
    
    while again == "":
        again = input("Vamos jogar de novo? S/n: ")
        if 'n' in again:
            print("Nos vemos!")
            sys.exit()
        break
