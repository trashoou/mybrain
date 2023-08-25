package homework.forum.dao;

import homework.forum.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Forum {
    boolean addPost(Post post);
    boolean removePost(int postId);
    boolean updatePost(int postId,String content);
    Post getPostById(int postId);
    Post[] getPostsByAuthor(String author);
    Post[] getPostsByAuthor(String author, LocalDateTime dateFrom, LocalDateTime dateTo);
    int size();
}
