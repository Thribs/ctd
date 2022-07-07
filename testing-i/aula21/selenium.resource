*** Variables ***
${SITE}                          https://www.saucedemo.com/
${BROWSER}                       Firefox
${USER_FIELD}                    css=#user-name
${PASSWORD_FIELD}                css=#password
${LOGIN_BUTTON}                  css=#login-button
${ADD_TO_CART_BUTTON}            css=#add-to-cart-sauce-labs-backpack
${CART_BUTTON}                   css=.shopping_cart_link
${USER}                          standard_user
${PASSWORD}                      secret_sauce
${CART_CHECKOUT_BUTTON}          css=#checkout
${CHECKOUT_NAME_FIELD}           css=#first-name
${CHECKOUT_LAST_NAME_FIELD}      css=#last-name
${CHECKOUT_ZIP_CODE_FIELD}       css=#postal-code
${CHECKOUT_SUBMIT_BUTTON}        css=#continue
${CONFIRMATION_SUBMIT_BUTTON}    css=#finish
${CHECKOUT_NAME}                 Thiago
${CHECKOUT_LAST_NAME}            Silva
${CHECKOUT_ZIP_CODE}             90210
${FINISH_BUTTON}                 css=#finish
${CONFIRMATION_MESSAGE}          css=.cart_item_title
${THANK_YOU_MESSAGE}             THANK YOU FOR YOUR ORDER

***Keywords***
Acessar o site
    Open Browser               ${SITE}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed         0.5


Fazer login
    Wait and Input Text    ${USER_FIELD}        ${USER}
    Wait and Input Text    ${PASSWORD_FIELD}    ${PASSWORD}
    Wait and Click         ${LOGIN_BUTTON}

Adicionar um produto ao carrinho
    Wait and Click    ${ADD_TO_CART_BUTTON}

Acessar carrinho
    Wait and Click    ${CART_BUTTON}

Checkout
    Wait and Click    ${CART_CHECKOUT_BUTTON}

Preencher dados de entrega
    Wait and Input Text    ${CHECKOUT_NAME_FIELD}         ${CHECKOUT_NAME}
    Wait and Input Text    ${CHECKOUT_LAST_NAME_FIELD}    ${CHECKOUT_LAST_NAME}
    Wait and Input Text    ${CHECKOUT_ZIP_CODE_FIELD}     ${CHECKOUT_ZIP_CODE}
    Wait and Click         ${CHECKOUT_SUBMIT_BUTTON}

Finalizar pedido
    Wait and Click         ${CONFIRMATION_SUBMIT_BUTTON}
    Page Should Contain    ${THANK_YOU_MESSAGE}

Wait and Click
    [Arguments]                      ${ELEMENT}
    Wait Until Element Is Visible    ${ELEMENT}
    Click Element                    ${ELEMENT}

Wait and Input Text
    [Arguments]                      ${ELEMENT}    ${TEXT}
    Wait Until Element Is Visible    ${ELEMENT}
    Input Text                       ${ELEMENT}    ${TEXT}