import { User } from './user';
import { Category } from './category';
import { PostDetails } from './post-details';

export class Post {
  id: number;
  user: User;
  postDetails: PostDetails;
  category: Category;
}
