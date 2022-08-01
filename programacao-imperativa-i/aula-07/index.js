console.log(!true);
console.log(!false);
console.log(!!false);
console.log(!!true);
console.log(!1);
console.log(!!1);
console.log(!0);
console.log(!!0);
console.log(!!"");
let x = 5;
let y = 9;
console.log(x < 10 && x !== 5);
console.log(x > 9 || x === 5);
console.log(!(x === y));

function ex1() {
    let x = 10
    let y = "a"
    console.log(
        y === "b" || x >= 10
    );

};

function ex2() {
    let x = 3
    let y = 8
    console.log(!(x == "3" || x === y) && !(y !== 8 && x <= y));

};

function ex3() {
    let str = ""
    let msg = "haha!"
    let eBonito = "false"
    console.log(!((str || msg) && eBonito));
};


ex1();
ex2();
ex3();