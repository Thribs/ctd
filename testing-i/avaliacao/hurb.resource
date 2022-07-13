*** Settings ***
Resource    ./util.resource

*** Variables ***
${SITE}                               https://hurb.com/br
${BROWSER}                            Firefox
${ACCEPT_COOKIES_BUTTON}              id=CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll
${PACOTES_BUTTON}                     xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${DESTINATION_FIELD}                  id=destination-input
${SEARCH_DESTINATION_BUTTON}          xpath=/html/body/div[2]/div[1]/div[2]/div/div/div[2]/button
${PACKAGE_CARD}                       xpath=/html/body/div[1]/div/main/section/div[2]/a
${SELECT_PACKAGE_BUTTON}              xpath=/html/body/div[1]/div/main/div[3]/aside/div/div/div[2]/button
${DEPARTURE_LOCATION_RADIO_BUTTON}    xpath=//*[@id="LGPKG-1140178-2779861"]
${DEPARTURE_LOCATION_NEXT_BUTTON}     xpath=/html/body/div[17]/div/div/div/footer/button
${STAY_DURATION_CARD}                 xpath=/html/body/div[18]/div/div/div/section/div/button[1]
${STAY_DURATION_NEXT_BUTTON}          xpath=/html/body/div[18]/div/div/div/footer/button[2]
${PACKAGES_AMOUNT_INCREASE_BUTTON}    xpath=/html/body/div[18]/div/div/div/section/div[1]/div/button[2]
${PACKAGES_AMOUNT_NEXT_BUTTON}        xpath=/html/body/div[18]/div/div/div/footer/button[2]
${SUMMARY_INFO}                       css=summary
${TRIP_PERIOD_LABEL}                  xpath=/html/body/div[3]/div/div[1]/div[1]/div[7]/div/div/div[1]/div
${BOLETO_BUTTON}                      xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/ul/li[3]
${BILLING_NAME_FIELD}                 xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/div[2]/section/div[1]/div[1]/div/input
${BILLING_CPF_FIELD}                  xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/div[2]/section/div[1]/div[2]/div/input
${BILLING_PHONE_NUMBER_FIELD}         xpath=/html/body/div[3]/div/div[2]/div/div/form/div[5]/div[1]/div/div[2]/section/div[2]/div[1]/div/input
${TOC_CHECKBOX}                       xpath=//*[@id="cancellation-policy"]
${FREE_CANCELLATION_FIELD}            xpath=/html/body/div[3]/div/div[2]/div/div/form/div[6]/div/div[2]/div[1]/div/div/div[2]

${BILLING_NAME}            Robô Hurb
${BILLING_CPF}             705.127.670-09
${BILLING_PHONE_NUMBER}    (11) 99000-0000


*** Keywords ***
Acessar o site
    Open Browser               ${SITE}    ${BROWSER}
    # Maximize Browser Window
    Set Selenium Speed         0.5

Clicar em “Permitir todos os cookies”
    # Wait Until Element Is Visible    ${ACCEPT_COOKIES_BUTTON}
    Sleep             8
    Wait and Click    ${ACCEPT_COOKIES_BUTTON}

Selecionar a opção “Pacotes”
    Wait and Click    ${PACOTES_BUTTON}

Buscar por "Tóquio"
    Wait and Input Text    ${DESTINATION_FIELD}            Tóquio
    Wait and Click         ${SEARCH_DESTINATION_BUTTON}

Buscar por "Salvador"
    Wait and Input Text    ${DESTINATION_FIELD}            Salvador
    Wait and Click         ${SEARCH_DESTINATION_BUTTON}

Buscar por "Buenos Aires"
    Wait and Input Text    ${DESTINATION_FIELD}            Buenos Aires
    Wait and Click         ${SEARCH_DESTINATION_BUTTON}

Selecionar um pacote de viagem
    Wait and Click    ${PACKAGE_CARD}
    Switch Window     NEW

Clicar em “Escolher pacote”
    Wait and Click    ${SELECT_PACKAGE_BUTTON}

Selecionar as opções do pacote e clicar em “Ir para pagamento”
    Wait and Click    ${DEPARTURE_LOCATION_RADIO_BUTTON}
    Wait and Click    ${DEPARTURE_LOCATION_NEXT_BUTTON}
    Wait and Click    ${STAY_DURATION_CARD}
    Wait and Click    ${STAY_DURATION_NEXT_BUTTON}
    Wait and Click    ${PACKAGES_AMOUNT_INCREASE_BUTTON}
    Wait and Click    ${PACKAGES_AMOUNT_INCREASE_BUTTON}
    Wait and Click    ${PACKAGES_AMOUNT_INCREASE_BUTTON}
    Wait and Click    ${PACKAGES_AMOUNT_NEXT_BUTTON}

Validar as informações da “Configuração” da viagem
    Page Should Contain Element    ${SUMMARY_INFO}

Validar as informações do período da viagem
    Element Should Contain Text    ${TRIP_PERIOD_LABEL}    Período da viagem

Selecionar a opção “Boleto parcelado”
    Wait and Click    ${BOLETO_BUTTON}

Preencher os dados de pagamento
    Wait and Input Text    ${BILLING_NAME_FIELD}            ${BILLING_NAME}
    Wait and Input Text    ${BILLING_CPF_FIELD}             ${BILLING_CPF}
    Wait and Input Text    ${BILLING_PHONE_NUMBER_FIELD}    ${BILLING_PHONE_NUMBER}

Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
    Wait Until Element Is Visible    ${TOC_CHECKBOX}
    Click Checkbox                   ${TOC_CHECKBOX}

Validar a informação sobre cancelamento grátis
    Page Should Contain Element    ${FREE_CANCELLATION_FIELD}
    Element Should Contain Text    ${FREE_CANCELLATION_FIELD}    Cancelamento Grátis!

Avisar impossibilidade de continuar o teste
    Log to Console  O teste não pode continuar porque o caminho do botão muda a cada teste

Avisar sobre o problema com o botão de cookies
    Log to Console  O botão de cookies nem sempre está presente, então repita o teste caso este falhe