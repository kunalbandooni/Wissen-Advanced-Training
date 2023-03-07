var Stack = /** @class */ (function () {
    function Stack() {
        this.numArr = [];
        this.index = 0;
    }
    Stack.prototype.push = function (num) {
        this.numArr[this.index] = num;
        this.index++;
    };
    Stack.prototype.pop = function () {
        this.index--;
        return this.numArr[this.index];
    };
    Stack.prototype.display = function () {
        var i;
        for (i = this.index - 1; i >= 0; i--)
            console.log(this.numArr[i]);
    };
    return Stack;
}());
var st = new Stack();
st.push(30);
st.push(20);
st.push(10);
st.push(40);
st.push(50);
st.display();
console.log("Popped: " + st.pop());
console.log("Popped: " + st.pop());
st.display();
