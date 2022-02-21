const umArray = [1, 2, 4, 8]
const outroArray = [3, 5, 2, 3, 7, 2]

const iterar = function (umArray) {
    let total = 0
    umArray.forEach(item => {
        total += item
        console.log(total)
    })
}

iterar(umArray)
iterar(outroArray)