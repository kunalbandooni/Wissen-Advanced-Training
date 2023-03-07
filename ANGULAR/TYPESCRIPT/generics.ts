class StackImp<T> {
    arr: T[] = [];
    index: number = 0;

    push(num: T){
        this.arr[this.index] = num;
        this.index++;
    }

    pop(): T {
        this.index--;
        return this.arr[this.index];
    }

    display() {
        var i : number;
        for(i = this.index-1; i>=0; i--)
            console.log(this.arr[i]);
    }
}

console.log("\nNUMBER NOW:")

var stNum = new StackImp<number>();

stNum.push(10);
stNum.push(30);
stNum.push(50);
stNum.display();
console.log("Popped :" + stNum.pop());
stNum.display();

console.log("\nSTRING NOW:")

var stString = new StackImp<string>();

stString.push("Kunal");
stString.push("James");
stString.push("Bond");
stString.display();
console.log("Popped :" + stString.pop());
stString.display();