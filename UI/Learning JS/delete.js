// Deletion in Array...
var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// Delete
var deleted = delete arr[2];
console.log("Removed element: " + deleted);
console.log("Remaining elements: " + arr);

// Pop - deletion from end
var popped = arr.pop();
console.log("Removed element: " + popped);
console.log("Remaining elements: " + arr);

// Shift - deletion from front
var shifted = arr.shift();
console.log("Removed element: " + shifted);
console.log("Remaining elements: " + arr);

// Splice - at position 2, remove 1 item
var spliced = arr.splice(2, 1);
console.log("Removed element: " + spliced);
console.log("Remaining elements: " + arr);

// Filter - filters values in Array - will keep odd elements in this case
function isOdd(n) {
    return !(n % 2 == 0);
}
console.log("Remaining elements: " + arr.filter(isOdd));