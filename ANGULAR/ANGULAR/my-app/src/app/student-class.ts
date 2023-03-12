class Student{
    id: number;
    name: string;
  
    constructor(id: number, name: string){
        this.id = id;
        this.name = name;
    }
  
    display(){
        let str : string = `ID: ${this.id}\nNAME: ${this.name}\n}`;
        console.log(str);
    }
}

var stuObj : Array<Student> = [ new Student(1, "Kunal"), new Student(2, "James"), new Student(3, "Bond") ];


console.log("Lets see:");
let x : Student;
for(x of stuObj)
    console.log(x);

stuObj.lastIndexOf;