package data.repositories;

import data.models.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    void deleteAll();
    void deleteById(int id);
    long count();
    void findById(int id);
    List<Post> findAll();

}
