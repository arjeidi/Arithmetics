const array = [1, 2, 3, 4, 5, 6, 7, 8, 9]

const reducer = (accumulator, currentValue) => accumulator + currentValue

console.log(array.reduce(reducer))

console.log(array.reduce(reducer, 5))