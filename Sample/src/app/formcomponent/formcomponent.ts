import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { DisplayEmployeeData } from '../display-employee-data/display-employee-data';
import { DisplayDeptData } from '../display-dept-data/display-dept-data';
import { Practise } from '../practise/practise';

@Component({
  selector: 'app-formcomponent',
  imports: [FormsModule, 
    CommonModule,
    DisplayEmployeeData,
    DisplayDeptData,
    Practise
  ],
  templateUrl: './formcomponent.html',
  styleUrl: './formcomponent.css',
})
export class Formcomponent {

  displayDataInfo:string="";

  displayData(data:string):void{
    this.displayDataInfo=data;
  }

}
