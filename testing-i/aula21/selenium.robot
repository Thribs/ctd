*** Settings ***
Library          SeleniumLibrary
Resource         ./selenium.resource
Test Teardown    Close Browser

*** Test Cases ***
Processo de compra na loja SwagLabs
    Acessar o site
    Fazer login
    Adicionar um produto ao carrinho
    Acessar carrinho
    Checkout
    Preencher dados de entrega
