import { Component } from '@angular/core';
import { boots } from './boots';
import { BootsService } from './boots.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public Boots: boots[] | undefined;

  constructor(private bootsService: BootsService){}
    public getBoots(): void{
      this.bootsService.getBoots().subscribe((
        response: boots[])=>{
          this.Boots=response;
        },
        (error: HttpErrorResponse)=>{
          alert(error.message);
        }
      );
    }
}
