import { Component } from '@angular/core';
import { transpileModule } from 'typescript';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'helloWorld!!';

  // used for one way data binding
  strName : string = "Kunal coding...";
  
  // used for two way data binding
  str : string = "Good Day Ahead!!";

  // Event Binding
  alertFunc(){
    alert("MISS ME??");
  }

  // Property Binding
  imgUrl : string ="./assets/logo.jpg";

  // NG CLASS
  bCustomer: boolean = true;
  changeToCustomer(){
    this.bCustomer = true;
  }
  changeToEmployee(){
    this.bCustomer = false;
  }

  // Dynamic Selection - NG CLASS
  strColor : string = "red";
  strFontSize = "10";

  // NG FOR
  userList = [
    {uid:1, name:"Kunal"},
    {uid:2, name:"James"},
    {uid:3, name:"Bond"}
  ];

  // NG FOR in TABLE
  onEditTemp(){
    alert("EDIT");
  }
  onDeleteTemp(){
    alert("DELETE");
  }

  // NG IF
  bLogin: boolean = true;
  bRegisteration: boolean = false;
  displayLogin(){
    this.bLogin = true;
    this.bRegisteration = false;
  }
  displayRegisteration(){
    this.bLogin = false;
    this.bRegisteration = true;
  }

  // NG SWITCH
  nData: number = 1;

  // CUSTOM STRUCTURAL DIRECTIVE
  nTimeInSeconds = 1;
  nTimeInMilliSeconds = 1000;
  // convert time in s to ms
  convertTimeToMillis(){
    this.nTimeInMilliSeconds = this.nTimeInSeconds * 1000;
  }
  
  // ngStyle Attribute Directive
  strSize = "20";
  strFontFamily = 'Courier New';
  strTextAlign = "center";
  strMargin = "10";
  strPadding = "5";
  strOpacity = "0.3";
  strBgColor = "limegreen";

  // LOGIN AND REGISTERATION
  bLog: boolean = true;
  bReg: boolean = false;
  displayLog(){
    this.bLog = true;
    this.bReg = false;
  }
  displayRegister(){
    this.bLog = false;
    this.bReg = true;
  }

  // making of edit and delete
  onDelete(i: number){
    this.userList.splice(i, 1);
  }
  onEdit(i: number){
    let name: string = prompt("Type new Name :");
    //this.userList.splice(i, 1, );
    // a little bit of changes to be done here...

    const tempIndex = this.userList.findIndex(user => user.uid === i);
    this.userList[tempIndex] = {i, name}
  }

}