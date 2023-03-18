import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  // check if login form is active or not
  loginActive = true;

  // check if registeration form is active or not
  registerationActive = false;
  
  // to activate login form
  displayLoginForm(){
    this.loginActive = true;
    this.registerationActive = false;
  }

  // to activate registeration form
  displayRegisterationForm(){
    this.loginActive = false;
    this.registerationActive = true;
  }
}
