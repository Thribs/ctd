const { divisao : div } = require('../calc')

describe('Testes de divisão', () => {
    test('Divisão correta', () => {
        expect(div(15, 2)).toBe(7.5);
    })
    test('Divisão errada', () => {
        expect(div(5, 2)).not.toBe(4);
    })
    test('Divisão "maior que"', () => {
        expect(div(8, 2)).toBeGreaterThan(3);
    })
    test('Divisão "menor que"', () => {
        expect(div(1, 2)).toBeLessThan(20);
    })

    test('Divisão de zeros e nulos', () => {
        expect(div(0, 0)).toBe(NaN);
        expect(div(null, null)).toBe(NaN);
        expect(div(undefined, undefined)).toBe(NaN);
        expect(div(0, null)).toBeNaN();
        expect(div(null, 0)).toBe(NaN);
    })
})

