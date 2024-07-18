package data.repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {
    List<Post> posts = new ArrayList<Post>();
   private int id = 1;


    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
    public int generateId(){
        return id++;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void findById(int id) {

    }

    @Override
    public List<Post> findAll() {
        return List.of();
    }
}
