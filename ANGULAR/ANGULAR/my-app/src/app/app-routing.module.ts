import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { PipesDemoComponent } from './pipes-demo/pipes-demo.component';

const routes: Routes = [
  {path:"", component: AppComponent},
  {path:"PipesDemo", component:PipesDemoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
