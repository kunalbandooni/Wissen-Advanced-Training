import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HighLightDirective } from './high-light.directive';
import { DelayDirective } from './delay.directive';
import { PipesDemoComponent } from './pipes-demo/pipes-demo.component';
import { TempConvertorPipe } from './temp-convertor.pipe';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HighLightDirective,
    DelayDirective,
    PipesDemoComponent,
    TempConvertorPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
