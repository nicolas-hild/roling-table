import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get( '/users');
  }

  addUser(user: any, id: number) {
    user.id = id;
    return this.http.post( '/users', user);
  }

}
