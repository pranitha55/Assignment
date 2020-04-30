import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
message: string;
  products;

  constructor(
    private productService: ProductService,
    private router: Router) {
    this.getProducts();
   }

  getProducts(){
    this.productService.getData().subscribe(response =>{
      console.log(response);
      this.products = response.products;
    },error =>{
    console.log(error);
    });
  }

  deleteProduct(product){
    this.productService.deleteData(product).subscribe(response =>{
      console.log(response);
      if(response.error){
        this.message='Failed to delete the product';
      }else{
        this.message='Product deleted successfully';
      }
      setTimeout(() =>{

      this.message=null;

      },5000);
        this.getProducts();
      
    });
  }
  selectProduct(product){
    this.router.navigateByUrl('/edit-product');
  }

  ngOnInit(): void {
  }

}
