import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-display-employee-data',
  imports: [FormsModule,CommonModule],
  templateUrl: './display-employee-data.html',
  styleUrl: './display-employee-data.css',
})
export class DisplayEmployeeData {
  tcname:string="thead-light"
 empDetails = [ 
  { "id": 1, firstName: 'John', lastName: 'Doe', role: 'Software Engineer', department: 'Engineering' }, 
  { "id": 2, firstName: 'Jane', lastName: 'Smith', role: 'Project Manager', department: 'Management' }, 
  { "id": 3, firstName: 'Peter', lastName: 'Jones', role: 'UX Designer', department: 'Design' }
];

changeStyle():void{
  this.tcname="table-dark";
}
}
