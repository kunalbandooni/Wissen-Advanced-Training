import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes-demo',
  templateUrl: './pipes-demo.component.html',
  styleUrls: ['./pipes-demo.component.css']
})
export class PipesDemoComponent {
  // uppercase and lowercase
  strToConvert: string = "James Bond";

  // Currency
  nCurrencyData = 1000;

  // Date
  nDateInMillis = Date.now();
  nDate: Date = new Date();

  // JSON 
  jsonUserObject = {"empid": 101, "name": "Kunal", "dept": "IT", "designation": "SDE"};
  empObj = [  {"id": 1, "name": "Kunal"},
              {"id": 2, "name": "James"},
              {"id": 3, "name": "Bond"}
            ];

  // Decimal 
  numData = 69.0123456789;

  // Percent
  percentData: number = 0.412;

  // Slice Pipe
  strDataForSlicing = "Angular Slice Pipe";

  // Custom Pipe -> done in app part only...
  // Services Pipe -> done in app part only...
}