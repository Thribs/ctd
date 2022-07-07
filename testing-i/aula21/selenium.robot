*** Settings ***
Library          SeleniumLibrary
Resource         ./selenium.resource
Test Teardown    Close Browser

*** Test Cases ***
Processo de compra na loja SauceDemo
    Acessar o site
    Fazer login
    Adicionar um produto ao carrinho
    Acessar carrinho
    Checkout
    Preencher dados de entrega
    Finalizar pedido

Processo de compra na loja SauceDemo com usuário incorreto
    Acessar o site
    Fazer login com usuário incorreto
