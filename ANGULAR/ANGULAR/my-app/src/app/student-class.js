var Student = /** @class */ (function () {
    function Student(id, name) {
        this.id = id;
        this.name = name;
    }
    Student.prototype.display = function () {
        var str = "ID: ".concat(this.id, "\nNAME: ").concat(this.name, "\n}");
        console.log(str);
    };
    return Student;
}());
var stuObj = [new Student(1, "Kunal"), new Student(2, "James"), new Student(3, "Bond")];
console.log("Lets see:");
var x;
for (var _i = 0, stuObj_1 = stuObj; _i < stuObj_1.length; _i++) {
    x = stuObj_1[_i];
    console.log(x);
}
stuObj.lastIndexOf;
