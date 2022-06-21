const { multiplicacao : mult } = require('../calc')

describe('Testes de multiplicação', () => {
    test('Multiplicação correta', () => {
        expect(mult(15, 2)).toBe(30);
    })
    test('Multiplicação errada', () => {
        expect(mult(5, 2)).not.toBe(4);
    })
    test('Multiplicação "maior que"', () => {
        expect(mult(8, 2)).toBeGreaterThan(3);
    })
    test('Multiplicação "menor que"', () => {
        expect(mult(1, 2)).toBeLessThan(20);
    })


})

