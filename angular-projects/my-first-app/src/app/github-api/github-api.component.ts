import { Component, OnInit } from '@angular/core';
import { GithubApiService } from '../github-api.service';
import { User } from '../User';

@Component({
  selector: 'app-github-api',
  templateUrl: './github-api.component.html',
  styleUrls: ['./github-api.component.css']
})
export class GithubApiComponent implements OnInit {

  constructor(private _apiService:GithubApiService) { }

  ngOnInit(): void {
  }

  user?:User;

  getUserDetails(userId:string){

    this._apiService.fetchGithubUserDetails(userId).subscribe(
      response=>{
        console.log(response);
        this.user=response;
      },
      error=>{
        console.log(error)
      }
    )
  }

}
