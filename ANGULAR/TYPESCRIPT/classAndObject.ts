class Employee{
    id: number;
    name: string;
    dept: string;
    designation: string;

    display(){
        let str : string = `ID: ${this.id}\nNAME: ${this.name}\nDEPT: ${this.dept}\nDESIGNATION: ${this.designation}`;
        console.log(str);
    }
}

let empObj = new Employee();
empObj.id = 1;
empObj.name = "Kunal";
empObj.dept = "Product";
empObj.designation = "CEO";

empObj.display();