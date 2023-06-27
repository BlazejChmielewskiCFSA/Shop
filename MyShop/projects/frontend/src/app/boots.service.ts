import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { boots } from './boots';

@Injectable({
  providedIn: 'root'
})
export class BootsService {

  private apiServerUrl='';
  constructor(private http: HttpClient) { }

  public getBoots():Observable<boots[]>{
    return this.http.get<boots[]>(`${this.apiServerUrl}/boots/all`);
  }

  public addBoots(Boots: boots):Observable<boots>{
    return this.http.post<boots>(`${this.apiServerUrl}/boots/add`, Boots);
  }

  public updateBoots(Boots: boots):Observable<boots>{
    return this.http.put<boots>(`${this.apiServerUrl}/boots/update`, Boots);
  }

  public deleteBoots(bootId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/boots/delete/${bootId}`);
  }

}
