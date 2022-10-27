import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AirportService {
  private baseURL = "http://localhost:9000/airports/";

  constructor(private httpClient: HttpClient) { }
  
  getOriginList(): Observable<any>{
    return this.httpClient.get<any>(`${this.baseURL}`+'list');
  }
  
  getFares(org:any, dest:any): Observable<any> {
    return this.httpClient.get(`${this.baseURL}`+"fares/"+org+'/'+dest)
  }
}

