abstract class Employee{
    id: number;
    name: string;
    salary: number;

    constructor(id: number, name: string){
        this.id = id;
        this.name = name;
    }

    display(){
        let str : string = `ID: ${this.id}\nNAME: ${this.name}\nSALARY: ${this.salary}`;
        console.log(str);
    }
}

class Clerk extends Employee{
    constructor(id: number, name: string){
        super(id, name);
        this.salary = 10000;
        this.display();
    }
}

let c1 = new Clerk(1, "James");