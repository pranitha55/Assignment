import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'

})
export class ProductService{

    constructor(private http: HttpClient){}

    

       postData(product){
           return this.http.post<any>('http://localhost:8080/angularassignment/addProduct',product);
       }

       getData(){
           return this.http.get<any>('http://localhost:8080/angularassignment/getAllProducts')
       }

       deleteData(product){
           return this.http.delete<any>('http://localhost:8080/angularassignment/deleteProduct/{productName}')
       }

      /*  products=[
           {
               productName: 'Iphone',
               productPrice: 20000
           },
           {
            productName: 'Lenovo',
            productPrice: 10000
        },
        {
            productName: 'Nokia 6',
            productPrice: 3000
        }
       ] */
}