var Student = /** @class */ (function () {
    function Student() {
    }
    Student.prototype.setId = function (id) {
        this.id = id;
    };
    Student.prototype.getId = function () {
        return this.id;
    };
    Student.prototype.setName = function (name) {
        this.name = name;
    };
    Student.prototype.getName = function () {
        return this.name;
    };
    Student.prototype.display = function () {
        var str = "ID: ".concat(this.id, "\nNAME: ").concat(this.name);
        console.log(str);
    };
    return Student;
}());
var stu1 = new Student();
stu1.setId(1);
stu1.setName("kunal");
stu1.display();
