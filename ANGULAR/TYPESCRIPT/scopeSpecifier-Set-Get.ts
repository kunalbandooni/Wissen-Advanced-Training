class Student{
    private id: number;
    private name: string;

    setId(id: number){
        this.id = id;
    }

    getId(){
        return this.id;
    }

    setName(name: string){
        this.name = name;
    }

    getName(){
        return this.name;
    }

    display(){
        let str: string = `ID: ${this.id}\nNAME: ${this.name}`;
        console.log(str);
    }
}

let stu1 = new Student();
stu1.setId(1);
stu1.setName("kunal");

stu1.display();