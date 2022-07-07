*** Settings ***
Library            SeleniumLibrary
Resource           ./bugbank.resource
# Test Teardown    Close Browser

*** Test Cases ***
Teste BugBank
     Acessar o site
     Criar conta
#    Fazer login
#    Adicionar um produto ao carrinho
#    Acessar carrinho
#    Checkout
#    Preencher dados de entrega
#    Finalizar pedido

# Processo de compra na loja SauceDemo com usuário incorreto
#    Acessar o site
#    Fazer login com usuário incorreto
