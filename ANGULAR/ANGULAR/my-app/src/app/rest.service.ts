import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './Employee';

@Injectable({
  providedIn: 'root'
})
export class RestService {
  constructor(private http: HttpClient) { }

  strUrl: string = "http://localhost:3000/users";

  // GET
  getAllData() : Observable<any>{
    return this.http.get(this.strUrl);
  }

  // POST
  insertData(empObj: Employee): Observable<any>{
    let headers = {'content-type' : 'application/json'}
    let jsonEmpObj = JSON.stringify(empObj);
    return this.http.post(this.strUrl, jsonEmpObj, {'headers': headers});
  }

  // DELETE
  deleteRecord(empNo: number): Observable<any>{
    let strURLForDelete: string = this.strUrl + "/" + empNo;
    return this.http.delete(strURLForDelete);
  }

  // PUT
  editRecord(empObj: Employee): Observable<any>{
    let strURLForUpdate : string = this.strUrl + '/' + empObj.id;
    console.log(empObj);
    console.log(strURLForUpdate);
    return this.http.put(strURLForUpdate, empObj);
  }
}