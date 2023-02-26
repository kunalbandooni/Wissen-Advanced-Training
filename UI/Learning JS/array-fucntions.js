const a = [1, 2, 3, 4, 5];

// toString() - converts array to string
console.log(toString(a));

// join() - toString() but with a seperator
console.log(a.join("-"));

// pop() - removes from last
a.pop();
console.log(a);

// push() - adds element to array
a.push(7);
console.log(a);

// shift() - removes from beginning and array shifted to front
a.shift();
console.log(a);

// unshift() - removes from beginning but the array is not shifted
a.unshift();
console.log(a);

// length() - length of array
console.log(a.length);

// concat() - concats two arrays and returns a new array
const b = [10, 11, 12, 13];
c = a.concat(b);
console.log(c);

// splice() - adds new items to array
// splice( where-to-add, how-many-to-remove, elements to be added)
a.splice(2, 0, "hello", "hi", "Bye");
console.log(a);

// slice() - pieces the array and returns the slice
// slice( from-where, upto-where(last index not including) )
d = a.slice(3, 5);
console.log(d);