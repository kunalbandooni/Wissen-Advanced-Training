"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.AppComponent = void 0;
var core_1 = require("@angular/core");
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
var stuObj1 = new Student(1, "Kunal");
var stuObj2 = new Student(2, "James");
var stuObj3 = new Student(3, "Bond");
var stuObj = [stuObj1, stuObj2, stuObj3];
console.log("Lets see:");
var x;
for (var _i = 0, stuObj_1 = stuObj; _i < stuObj_1.length; _i++) {
    x = stuObj_1[_i];
    console.log(x);
}
var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'helloWorld!!';
        // used for one way data binding
        this.strName = "Kunal coding...";
        // used for two way data binding
        this.str = "Good Day Ahead!!";
        // Property Binding
        this.imgUrl = "./assets/logo.jpg";
        // NG CLASS
        this.bCustomer = true;
        // Dynamic Selection - NG CLASS
        this.strColor = "red";
        this.strFontSize = "10";
        // NG FOR
        this.userList = [
            { uid: 1, name: "Kunal" },
            { uid: 2, name: "James" },
            { uid: 3, name: "Bond" }
        ];
        // NG IF
        this.bLogin = true;
        this.bRegisteration = false;
        // NG SWITCH
        this.nData = 1;
        // CUSTOM STRUCTURAL DIRECTIVE
        this.nTimeInSeconds = 1;
        this.nTimeInMilliSeconds = 1000;
        // ngStyle Attribute Directive
        this.strSize = "20";
        this.strFontFamily = 'Courier New';
        this.strTextAlign = "center";
        this.strMargin = "10";
        this.strPadding = "5";
        this.strOpacity = "0.3";
        this.strBgColor = "limegreen";
        // LOGIN AND REGISTERATION
        this.bLog = false;
    }
    // Event Binding
    AppComponent.prototype.alertFunc = function () {
        alert("MISS ME??");
    };
    AppComponent.prototype.changeToCustomer = function () {
        this.bCustomer = true;
    };
    AppComponent.prototype.changeToEmployee = function () {
        this.bCustomer = false;
    };
    // NG FOR in TABLE
    AppComponent.prototype.onEdit = function () {
        alert("EDIT");
    };
    AppComponent.prototype.onDelete = function () {
        alert("DELETE");
    };
    AppComponent.prototype.displayLogin = function () {
        this.bLogin = true;
        this.bRegisteration = false;
    };
    AppComponent.prototype.displayRegisteration = function () {
        this.bLogin = false;
        this.bRegisteration = true;
    };
    // convert time in s to ms
    AppComponent.prototype.convertTimeToMillis = function () {
        this.nTimeInMilliSeconds = this.nTimeInSeconds * 1000;
    };
    AppComponent.prototype.displayLog = function () {
        this.bLog = true;
    };
    AppComponent.prototype.displayRegister = function () {
        this.bLog = false;
    };
    AppComponent = __decorate([
        (0, core_1.Component)({
            selector: 'app-root',
            templateUrl: './app.component.html',
            styleUrls: ['./app.component.css']
        })
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
