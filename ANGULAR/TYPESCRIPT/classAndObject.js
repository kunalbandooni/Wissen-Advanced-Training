var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.display = function () {
        var str = "ID: ".concat(this.id, "\nNAME: ").concat(this.name, "\nDEPT: ").concat(this.dept, "\nDESIGNATION: ").concat(this.designation);
        console.log(str);
    };
    return Employee;
}());
var empObj = new Employee();
empObj.id = 1;
empObj.name = "Kunal";
empObj.dept = "Product";
empObj.designation = "CEO";
empObj.display();
