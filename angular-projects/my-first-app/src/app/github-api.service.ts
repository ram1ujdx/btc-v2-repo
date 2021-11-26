import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class GithubApiService {

  constructor(private _httpClient:HttpClient) { }

  url="https://api.github.com/users/";

  public fetchGithubUserDetails(userid:string):Observable<User>{
    return this._httpClient.get<User>(this.url+userid)
  }

}
