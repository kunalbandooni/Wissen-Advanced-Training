// Searching in array...
const array = [10, 11, 3, 20, 5];

// Method - 1
const greaterThanTen1 = array.filter(element => element > 10);
console.log(greaterThanTen1) // [11, 20]

// Method - 2
const greaterThanTen2 = array.find(element => element > 10);
console.log(greaterThanTen2) //11

// Method - 3
const includesTwenty = array.includes(10);
console.log(includesTwenty) //true

// Method - 4
const indexOfThree = array.indexOf(10);
console.log(indexOfThree) //0