import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})
export class CrudComponent {
  StudentArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 
  // stname: string ="";
  // course: string ="";
  // fee: string ="";
  // currentStudentID = "";

  constructor(private http: HttpClient )
  {
    this.getAllStudent();
  }
 
  ngOnInit(): void {
  }
 
  getAllStudent()
  {
    this.http.get("https://jsonplaceholder.typicode.com/users")
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        console.log("hiiiii.resultdata.data");
        this.StudentArray = resultData;
    });
  }

 
}
