import {Post} from '../model/post';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private httpService: HttpClient) {
  }

  getPosts(): Observable<Post[]> {
    return this.httpService.get<Post[]>(environment.baseUrl + '/post');
  }
}
