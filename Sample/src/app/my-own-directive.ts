import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appMyOwnDirective]',
})
export class MyOwnDirective {
  constructor(el: ElementRef) { 
el.nativeElement.style.backgroundColor = 'yellow'; 
} 
}
