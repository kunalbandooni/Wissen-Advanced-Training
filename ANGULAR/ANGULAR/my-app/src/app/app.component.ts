import { Component } from '@angular/core';

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
}
