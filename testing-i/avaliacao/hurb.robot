*** Settings ***
Library          SeleniumLibrary
Resource         ./hurb.resource
Test Setup       Acessar o site
Test Teardown    Close Browser

*** Test Cases ***
Processo de reserva de pacote de viagens para Tóquio
     Clicar em “Permitir todos os cookies”
     Selecionar a opção “Pacotes”
     Buscar por "Tóquio"
     Selecionar um pacote de viagem
     Clicar em “Escolher pacote”
#    O teste não pode continuar porque o caminho do botão muda a cada teste
     Avisar impossibilidade de continuar o teste

#    Selecionar as opções do pacote e clicar em “Ir para pagamento”
#    Validar as informações da “Configuração” da viagem
#    Validar as informações do período da viagem
#    Selecionar a opção “Boleto parcelado”
#    Preencher os dados de pagamento
#    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
#    Validar a informação sobre cancelamento grátis

Processo de reserva de pacote de viagens para Salvador
#    O botão de cookies nem sempre está presente, então foi retirado do teste
     Avisar sobre o problema com o botão de cookies
     Clicar em “Permitir todos os cookies”
     Selecionar a opção “Pacotes”
     Buscar por "Salvador"
     Selecionar um pacote de viagem
     Clicar em “Escolher pacote”
#    O teste não pode continuar porque o caminho do botão muda a cada teste
     Avisar impossibilidade de continuar o teste

#    Selecionar as opções do pacote e clicar em “Ir para pagamento”
#    Validar as informações da “Configuração” da viagem
#    Validar as informações do período da viagem
#    Selecionar a opção “Boleto parcelado”
#    Preencher os dados de pagamento
#    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
#    Validar a informação sobre cancelamento grátis

Processo de reserva de pacote de viagens para Buenos Aires
#    O botão de cookies nem sempre está presente, então foi retirado do teste
     Avisar sobre o problema com o botão de cookies
     Clicar em “Permitir todos os cookies”
     Selecionar a opção “Pacotes”
     Buscar por "Buenos Aires"
     Selecionar um pacote de viagem
     Clicar em “Escolher pacote”
#    O teste não pode continuar porque o caminho do botão muda a cada teste
     Avisar impossibilidade de continuar o teste

#    Selecionar as opções do pacote e clicar em “Ir para pagamento”
#    Validar as informações da “Configuração” da viagem
#    Validar as informações do período da viagem
#    Selecionar a opção “Boleto parcelado”
#    Preencher os dados de pagamento
#    Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
#    Validar a informação sobre cancelamento grátis