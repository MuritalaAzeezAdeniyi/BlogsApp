package data.repositories;

import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PostRepositoryImplTest {
    @Test
    public void testIfPostCanId() {
        PostRepositoryImpl postRepository = new PostRepositoryImpl();
        Post post = new Post();
        postRepository.save(post);
        assertNotNull(post.getId());
    }
    @Test
    public void testIfPostCanSave() {
        PostRepositoryImpl postRepository = new PostRepositoryImpl();
        Post post = new Post();
        postRepository.save(post);
        postRepository.save(post);
    }
  
}