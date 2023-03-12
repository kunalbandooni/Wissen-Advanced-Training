import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appHighLight]'
})
export class HighLightDirective {

  constructor(private e1: ElementRef) { }

  @HostListener('mouseenter') changeStyleMouseEnter(){
    this.changeStyle('red');
  }

  @HostListener('mouseleave') changeStyleMouseLeave(){
    this.changeStyle('blue');
  }

  changeStyle(color: string){
    this.e1.nativeElement.style.color = color;
  }
}
