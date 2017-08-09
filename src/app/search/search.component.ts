import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor() { }

  ngOnInit() {

    $(document).ready(function() {
	$('#my-range').range({
		min: 0,
		max: 10,
		start: 5
	});
});

  }

}
