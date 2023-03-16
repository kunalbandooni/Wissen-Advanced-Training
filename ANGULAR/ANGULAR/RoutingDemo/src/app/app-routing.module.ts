import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { NoPageFoundComponent } from './no-page-found/no-page-found.component';
import { ProductsComponent } from './products/products.component';

const routes: Routes = [
  {path:"", component: HomeComponent},
  {path:"Home", component: HomeComponent},
  {path:"Products", component: ProductsComponent},
  {path:"**", component: NoPageFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
