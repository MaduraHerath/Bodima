import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Search from 'Serarch/Search';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {
  private homejs = require('./home');
  constructor(private route:Router) {
     
   }

  ngOnInit() {
    
    
  }

}

