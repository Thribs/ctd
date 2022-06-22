const { generateText } = require('../util')

describe('Validação do texto de saída', () => {
    test('saída de nome e idade', () => {
        expect(generateText('João', 20)).toBe('João (20 years old)');
    })
    test('saída de nome e idade', () => {
        expect(generateText('Thiago Silva', 28)).toBe('Thiago Silva (28 years old)');
    })
})