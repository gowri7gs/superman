import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  Students : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 

  constructor(private http: HttpClient )
  {
    this.getAllS();
  }
 
  ngOnInit(): void {
  }
 
  getAllS()
  {
    this.http.get("https://jsonplaceholder.typicode.com/users")
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        console.log("hiiiii.resultdata.data");
        this.Students = resultData;
    });
  }
}
