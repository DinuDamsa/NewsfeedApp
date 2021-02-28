import {Post} from '../model/post';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private httpService: HttpClient) {
  }

  getPosts(): Observable<Post[]> {
    return this.httpService.get<Post[]>('http://localhost:8080/onlyBook/api/post');
  }
}
