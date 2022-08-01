const fizz = () => console.log('fizz');
const buzz = () => console.log('buzz');
const fizzAndBuzz = () => console.log('fizzbuzz');

const fizzBuzz = (a, b) => {
     for (let i = 0; i < 100; i++) {
         i % 3 == 0 && i % 5 !== 0 ? fizz() :
         i % 3 !== 0 && i % 5 == 0 ? buzz() :
         i % 3 == 0 && i % 5 == 0 ? fizzAndBuzz() :
         console.log(i);
    }}

fizzBuzz(2, 3);