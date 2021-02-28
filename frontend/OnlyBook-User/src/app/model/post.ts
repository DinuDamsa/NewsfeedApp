import { User } from './user';
import { Category } from './category';
import { PostDetails } from './post-details';

export class Post {
  id: number;
  title: string;
  textContent: string;
  contentPicturePath: string;
  userNickname: string;
  category: string;
}
