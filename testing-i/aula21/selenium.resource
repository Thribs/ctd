*** Variables ***
${SITE}                        https://www.saucedemo.com/
${BROWSER}                     Chrome
${USER_FIELD}                  css=#user-names
${PASSWORD_FIELD}              css=#password
${LOGIN_BUTTON}                css=#login-button
${ADD_TO_CART_BUTTON}          css=#add-to-cart-sauce-labs-backpack
${CART_BUTTON}                 css=.shopping_cart_link
${USER}                        standard_user
${PASSWORD}                    secret_sauce
${CART_CHECKOUT_BUTTON}        css=#checkout
${CHECKOUT_NAME_FIELD}         css=#first-name
${CHECKOUT_LAST_NAME_FIELD}    css=#last-name
${CHECKOUT_ZIP_CODE_FIELD}     css=#postal-code
${CHECKOUT_SUBMIT_BUTTON}      css=#continue
${CONFIRMATION_SUBMIT_BUTTON}  css=#finish
${CHECKOUT_NAME}               Thiago
${CHECKOUT_LAST_NAME}          Silva
${CHECKOUT_ZIP_CODE}           90210

***Keywords***
Acessar o site
    Open Browser               ${SITE}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed  0.5


Fazer login
    Input Text       ${USER_FIELD}        ${USER}
    Input Text       ${PASSWORD_FIELD}    ${PASSWORD}
    Click Element    ${LOGIN_BUTTON}

Adicionar um produto ao carrinho
    Click Element    ${ADD_TO_CART_BUTTON}

Acessar carrinho
    Click Element    ${CART_BUTTON}

Checkout
    Click Element    ${CART_CHECKOUT_BUTTON}

Preencher dados de entrega
    Input Text       ${CHECKOUT_NAME_FIELD}    ${CHECKOUT_NAME}
    Input Text       ${CHECKOUT_LAST_NAME_FIELD}    ${CHECKOUT_LAST_NAME}
    Input Text       ${CHECKOUT_ZIP_CODE_FIELD}    ${CHECKOUT_ZIP_CODE}
    Click Element    ${CHECKOUT_SUBMIT_BUTTON}


