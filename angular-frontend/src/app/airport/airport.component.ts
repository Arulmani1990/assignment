import { Component, OnInit } from '@angular/core';
import { AirportService } from '../airport.service';
import { Router } from '@angular/router';

interface destinationInterface {
  code: string;
  name: string;
}

@Component({
  selector: 'app-airport',
  templateUrl: './airport.component.html',
  styleUrls: ['./airport.component.css']
})
export class AirportComponent implements OnInit {

  airportList: destinationInterface[];
  selectedDestination: destinationInterface;
  selectedOrigin: destinationInterface;
  fareDetails: any;

  constructor(private airportService: AirportService,
    private router: Router) { }    

  ngOnInit(): void {
    this.getAirports();
  }

  getAirports(){
    this.airportService.getOriginList().subscribe(res => {
      this.airportList = res._embedded.locations;
    });    
  }

  getFare(){
    console.log(this.selectedDestination);
    console.log(this.selectedOrigin);
    this.airportService.getFares(this.selectedOrigin.code, this.selectedDestination.code).subscribe( data =>{
     
      this.fareDetails = data;
    },    
    error => console.log(error));
  }
  
  onSubmit(){
    this.getFare();
  }
}
