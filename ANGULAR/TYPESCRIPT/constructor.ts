class Employee{
    id: number;
    name: string;
    dept: string;
    designation: string;

    constructor(id: number, name: string, dept: string, designation: string){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.designation = designation;
    }

    display(){
        let str : string = `ID: ${this.id}\nNAME: ${this.name}\nDEPT: ${this.dept}\nDESIGNATION: ${this.designation}`;
        console.log(str);
    }
}

let empObj = new Employee(1, "Kunal", "Product", "CEO");

empObj.display();