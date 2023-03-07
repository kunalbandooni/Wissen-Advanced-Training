var StackImp = /** @class */ (function () {
    function StackImp() {
        this.arr = [];
        this.index = 0;
    }
    StackImp.prototype.push = function (num) {
        this.arr[this.index] = num;
        this.index++;
    };
    StackImp.prototype.pop = function () {
        this.index--;
        return this.arr[this.index];
    };
    StackImp.prototype.display = function () {
        var i;
        for (i = this.index - 1; i >= 0; i--)
            console.log(this.arr[i]);
    };
    return StackImp;
}());
console.log("\nNUMBER NOW:");
var stNum = new StackImp();
stNum.push(10);
stNum.push(30);
stNum.push(50);
stNum.display();
console.log("Popped :" + stNum.pop());
stNum.display();
console.log("\nSTRING NOW:");
var stString = new StackImp();
stString.push("Kunal");
stString.push("James");
stString.push("Bond");
stString.display();
console.log("Popped :" + stString.pop());
stString.display();
