import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { AddProductComponent } from './add-product/add-product.component';
import { PostsComponent } from './posts/posts.component';
import { EditProductComponent } from './edit-product/edit-product.component';


const routes: Routes = [
  { path: 'products',component: ProductsComponent},
  { path: 'add-product',component: AddProductComponent},
  { path: 'edit-component', component:EditProductComponent},
  { path: 'posts',component:PostsComponent},
  { path: '',redirectTo: '/products',pathMatch:'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
