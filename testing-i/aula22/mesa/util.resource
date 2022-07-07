*** Keywords ***
Wait and Click
   [Arguments]                      ${ELEMENT}
   Wait Until Element Is Visible    ${ELEMENT}
   Click Element                    ${ELEMENT}

Wait and Input Text
   [Arguments]                      ${ELEMENT}    ${TEXT}
   Wait Until Element Is Visible    ${ELEMENT}
   Input Text                       ${ELEMENT}    ${TEXT}