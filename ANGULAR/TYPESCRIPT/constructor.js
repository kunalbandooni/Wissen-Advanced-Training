var Employee1 = /** @class */ (function () {
    function Employee1(id, name, dept, designation) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.designation = designation;
    }
    Employee1.prototype.display = function () {
        var str = "ID: ".concat(this.id, "\nNAME: ").concat(this.name, "\nDEPT: ").concat(this.dept, "\nDESIGNATION: ").concat(this.designation);
        console.log(str);
    };
    return Employee1;
}());
var empObj1 = new Employee1(1, "Kunal", "Product", "CEO");
empObj1.display();
