*** Settings ***
Resource    ./util.resource

*** Variables ***
${SITE}                                           https://bugbank.netlify.app/
${BROWSER}                                        Firefox
${REGISTER_BUTTON}                                css=button.style__ContainerButton-sc-1wsixal-0:nth-child(2)
${REGISTER_EMAIL_FIELD}                           css=/html/body/div/div/div[2]/div/div[2]/form/div[2]/input
${REGISTER_NAME_FIELD}                            css=div.style__ContainerFieldInput-sc-s3e9ea-0:nth-child(3) > input:nth-child(2)
${REGISTER_PASSWORD_FIELD}                        css=div.kOeYBn:nth-child(1) > input:nth-child(2)
${REGISTER_CONFIRM_PASSWORD_FIELD}                css=div.kOeYBn:nth-child(1) > input:nth-child(2)
${REGISTER_CREATE_ACCOUNT_WITH_BALANCE_SLIDER}    css=html body div#__next div.pages__Background-sc-1ee1f2s-0.frRieb div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU div.pages__Wrapper-sc-1ee1f2s-3.bRDVgF div.card__register form.styles__ContainerFormRegister-sc-7fhc7g-0.keVbpY div.styles__ContainerToggle-sc-7fhc7g-2.cJsFYf label.styles__Container-sc-1pngcbh-0.kIwoPV label#toggleAddBalance.styles__Input-sc-1pngcbh-1.dTSgXK
${REGISTER_SUBMIT_BUTTON}                         css=button.style__ContainerButton-sc-1wsixal-0:nth-child(7)
${USER_EMAIL}                                     thiago@email.com
${USER_NAME}                                      thiago
${USER_PASSWORD}                                  thiago
${ADD_TO_CART_BUTTON}                             css=#add-to-cart-sauce-labs-backpack
${CART_BUTTON}                                    css=.shopping_cart_link
${USER}                                           standard_user
${PASSWORD}                                       secret_sauce
${CART_CHECKOUT_BUTTON}                           css=#checkout
${CHECKOUT_NAME_FIELD}                            css=#first-name
${CHECKOUT_LAST_NAME_FIELD}                       css=#last-name
${CHECKOUT_ZIP_CODE_FIELD}                        css=#postal-code
${CHECKOUT_SUBMIT_BUTTON}                         css=#continue
${CONFIRMATION_SUBMIT_BUTTON}                     css=#finish
${CHECKOUT_NAME}                                  Thiago
${CHECKOUT_LAST_NAME}                             Silva
${CHECKOUT_ZIP_CODE}                              90210
${FINISH_BUTTON}                                  css=#finish
${CONFIRMATION_MESSAGE}                           css=.cart_item_title
${THANK_YOU_MESSAGE}                              THANK YOU FOR YOUR ORDER
${LOGIN_ERROR_MESSAGE}                            do not match

*** Keywords ***
Acessar o site
    Open Browser               ${SITE}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed         0.5

Criar conta
    Click Element                ${REGISTER_BUTTON}
    Wait and Input Text          ${REGISTER_EMAIL_FIELD}                           ${USER_EMAIL}
    Wait and Input Text          ${REGISTER_NAME_FIELD}                            ${USER_NAME}
    Wait and Input Text          ${REGISTER_PASSWORD_FIELD}                        ${USER_PASSWORD}
    Wait and Input Text          ${REGISTER_CONFIRM_PASSWORD_FIELD}                ${USER_PASSWORD}
    Wait and Click               ${REGISTER_CREATE_ACCOUNT_WITH_BALANCE_SLIDER}
    Wait and Click               ${REGISTER_SUBMIT_BUTTON}



# Fazer login
#    Wait and Input Text    ${USER_FIELD}        ${USER}
#    Wait and Input Text    ${PASSWORD_FIELD}    ${PASSWORD}
#    Wait and Click         ${LOGIN_BUTTON}

# Fazer login com usuário incorreto
#    Wait and Input Text    ${USER_FIELD}             aaa
#    Wait and Input Text    ${PASSWORD_FIELD}         bbb
#    Wait and Click         ${LOGIN_BUTTON}
#    Page Should Contain    ${LOGIN_ERROR_MESSAGE}


# Adicionar um produto ao carrinho
#    Wait and Click    ${ADD_TO_CART_BUTTON}

# Acessar carrinho
#    Wait and Click    ${CART_BUTTON}

# Checkout
#    Wait and Click    ${CART_CHECKOUT_BUTTON}

# Preencher dados de entrega
#    Wait and Input Text    ${CHECKOUT_NAME_FIELD}         ${CHECKOUT_NAME}
#    Wait and Input Text    ${CHECKOUT_LAST_NAME_FIELD}    ${CHECKOUT_LAST_NAME}
#    Wait and Input Text    ${CHECKOUT_ZIP_CODE_FIELD}     ${CHECKOUT_ZIP_CODE}
#    Wait and Click         ${CHECKOUT_SUBMIT_BUTTON}

# Finalizar pedido
#    Wait and Click         ${CONFIRMATION_SUBMIT_BUTTON}
#    Page Should Contain    ${THANK_YOU_MESSAGE}             ${ELEMENT}    ${TEXT}