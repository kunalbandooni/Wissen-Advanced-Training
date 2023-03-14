import { Injectable } from '@angular/core';
import { Products } from './Products';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  arr: Products[] = [
    {id: 1, name:"Mouse"},
    {id: 2, name:"James"},
    {id: 3, name:"Bond"}
  ]

  constructor() { }

  getAllProducts(){
    return this.arr;
  }
}
