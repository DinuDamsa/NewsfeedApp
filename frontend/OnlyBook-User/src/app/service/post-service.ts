import {Post} from '../model/post';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';


export class PostService {

  constructor(private httpService: HttpClient) {
  }

  getPosts(): Observable<Post[]> {
    return this.httpService.get<any>("http://localhost:8080/onlyBook/api/post")
  }

}
