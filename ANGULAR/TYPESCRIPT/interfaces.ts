interface IStack{
    push(num: number);
    pop() : number;
    display();
}

class Stack implements IStack{
    numArr: number[] = [];
    index: number = 0;

    push(num: number){
        this.numArr[this.index] = num;
        this.index++;
    }

    pop(): number {
        this.index--;
        return this.numArr[this.index];
    }

    display() {
        var i : number;
        for(i = this.index-1; i>=0; i--)
            console.log(this.numArr[i]);
    }
}

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