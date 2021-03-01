import {Post} from '../../model/post';
import {PostService} from '../../service/post-service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-post-list',
  templateUrl: 'post-list-component.html',
  styleUrls: ['post-list-component.scss']
})

export class PostListComponent implements OnInit{
  public posts: Post[];

  constructor(private postService: PostService) {
  }

  ngOnInit() {
    this.getPosts();
    console.log(this.posts);
  }

  getPosts(): void {
    this.postService.getPosts().subscribe(posts => {console.log(posts); this.posts = posts; });
  }

}

