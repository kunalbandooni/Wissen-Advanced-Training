import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes-demo',
  templateUrl: './pipes-demo.component.html',
  styleUrls: ['./pipes-demo.component.css']
})
export class PipesDemoComponent {
  // Date and Currency
  nCurrencyData = 1000;
  nDateInMillis = Date.now();
  nDate: Date = new Date();

  // JSON Pipe
  empObj = {"empid": 101, 
            "name": "Kunal",
            "dept": "IT",
            "designation": "SDE"
          };

  // Slice Pipe
  strDataForSlicing = "Angular Slice Pipe";

  // Custom Pipe -> done in app part only...
}