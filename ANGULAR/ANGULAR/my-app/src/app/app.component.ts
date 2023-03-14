import { Component } from '@angular/core';
import { transpileModule } from 'typescript';
import { Employee } from './Employee';
import { Products } from './Products';
import { ProductsService } from './products.service';
import { RestService } from './rest.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // CUSTOM PIPES
  nCelsius: number = 1;
  nFarenheit: number = 1;

  // PRODUCT PIPES
  /*constructor(private productService: ProductsService){}
  arr : Products[] = [];
  readProductData(){
    this.arr = this.productService.getAllProducts();
  }*/

  //JSON SERVER
  constructor(private httpService: RestService){}
  empArr : Employee[] = [];

  // GET
  getAllEmployeeData(){
    this.httpService.getAllData().subscribe({
      next: (data: Employee[]) => {this.empArr = data;},
      error: (err: any) => console.log(err)
    })
  }

  // POST
  idTempPOST: number = 0;
  nameTempPOST: string = "";
  addDataToDB(){
    let empObj: Employee = new Employee(this.idTempPOST, this.nameTempPOST);
    if(!(this.nameTempPOST === "")){
      this.httpService.insertData(empObj).subscribe({
        next: (data) => { console.log(JSON.stringify(data));
                          this.getAllEmployeeData();
                        },
        error: (err) => console.log(err)
      })
    }
  }

  // PUT
  idTempPUT: number = 0;
  nameTempPUT: string = "";
  editRecord(id: number){
    this.idTempPUT = id;
    this.nameTempPUT = String(prompt("NAME"));

    let empObj: Employee = new Employee(this.idTempPUT, this.nameTempPUT);
    for(let x of this.empArr){
      if(x.id == this.idTempPUT){
        if(!(this.nameTempPUT === "")){
          this.httpService.editRecord(empObj).subscribe({
            next: (data) => { console.log(JSON.stringify(data));
                              this.getAllEmployeeData();
                            },
            error: (err) => console.log(err)
          })
        }
      }
    }
  }

  // DELETE
  deleteRecord(empID: number){
    this.httpService.deleteRecord(empID).subscribe({
      next: (data) => { console.log(JSON.stringify(data));
                        this.getAllEmployeeData();
                      },
      error: (err) => console.log(err)
    })
  }


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
    let name: string|null = prompt("Type new Name :");
    //this.userList.splice(i, 1, );
    // a little bit of changes to be done here...

    const tempIndex = this.userList.findIndex(user => user.uid === i);
    //this.userList[tempIndex] = {i, name}
  }

  
}