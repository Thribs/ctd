const { subtracao : sub } = require('../calc')

describe('Testes de subtração', () => {
    test('Subtração correta', () => {
        expect(sub(1, 2)).toBe(-1)
    })
    test('Subtração errada', () => {
        expect(sub(5, 2)).not.toBe(4)
    })
    test('Subtração "maior que"', () => {
        expect(sub(8, 2)).toBeGreaterThan(3)
    })
    test('Subtração "menor que"', () => {
        expect(sub(1, 2)).toBeLessThan(20)
    })

    test('Subtração de zeros e nulos', () => {
        expect(sub(0, 0)).toBe(0)
        expect(sub(null, null)).toBe(0);
        expect(sub(undefined, undefined)).toBe(NaN)
        expect(sub(0, null)).toBe(0)
        expect(sub(null, 0)).toBe(0);
        expect(sub(undefined, null)).toBe(NaN);
        expect(sub(null, undefined)).toBe(NaN);
    })

    test('Subtração de strings', () => {
        expect(sub('1', '2')).toBe(-1);
        expect(sub('a', 'b')).toBeNaN();
    })

})