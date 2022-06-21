const { soma } = require('../calc')

describe('Testes de soma', () => {

    test('Soma correta', () => {
        expect(soma(1, 2)).toBe(3);
    })
    test('Soma errada', () => {
        expect(soma(5, 2)).not.toBe(4);
    })
    test('Soma "maior que"', () => {
        expect(soma(4, 2)).toBeGreaterThan(3);
    })
    test('Soma "menor que"', () => {
        expect(soma(1, 2)).toBeLessThan(20);
    })

    test('Soma de zeros e nulos', () => {
        expect(soma(0, 0)).toBe(0);
        expect(soma(null, null)).toBe(0);
        expect(soma(undefined, undefined)).toBe(NaN);
        expect(soma(0, null)).toBe(0);
        expect(soma(null, 0)).toBe(0);
        expect(soma(undefined, null)).toBe(NaN);
        expect(soma(null, undefined)).toBe(NaN);
    })

    test('Soma de strings', () => {
        expect(soma('1', '2')).toBe('12');
        expect(soma('a', 'b')).toBe('ab');
    })
})