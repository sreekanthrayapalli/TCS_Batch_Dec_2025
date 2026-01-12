import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Formcomponent } from './formcomponent/formcomponent';
import { MyOwnDirective } from './my-own-directive';
import { CommonModule } from '@angular/common';
import { CustomPipePipe } from './custom-pipe-pipe';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Formcomponent,
    MyOwnDirective,
    CommonModule,
    CustomPipePipe
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {

  names=["abc","xyz","pqr","lms","pro","sub"];

  name:string="abc";
  title:string="Sample Title";
  todayDate:Date=new Date();

  emp={
    "name":"abc",
    "sal":5000,
    "address":"hyderabad"
  };
}
