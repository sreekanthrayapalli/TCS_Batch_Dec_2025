import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-practise',
  imports: [
    CommonModule
  ],
  templateUrl: './practise.html',
  styleUrl: './practise.css',
})
export class Practise {
  value2:string[]=[];
  values=['abc','xyz','pqr','lmn','obc','xyzq'];
  data:string="";
  count:number=0;
  flag:boolean=false;
  displayDetais():void{
    this.flag=!this.flag;
  }
color:string="";
  displayValues():void{
    
    this.data=this.values[this.count++];
   
    this.value2.push(this.data);
    
    if(this.count>=5){
      this.color="blue";
    }else{
      this.color="";
    }
    if(this.count==this.values.length+1){
      this.count=0;
      this.value2=[];
    }
  }
}
