package homework.dao;

import homework.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    ForumImpl forum;
    Post[] posts = new Post[5];

    @BeforeEach
    void setUp() {
        forum = new ForumImpl();
        posts[0] = new Post(1, "title1", "author1", "content1");
        posts[1] = new Post(2, "title2", "author2", "content2");
        posts[2] = new Post(3, "title3", "author3", "content3");

        for (int i = 0; i < posts.length - 1; i++) {
            forum.addPost(posts[i]);
        }
    }


    @Test
    void addPost() {
        forum.printArray("Original array");
        Post newPost = new Post(4,"new title","new author","new content");
        Post newPost1 = new Post(5,"new title","new author","new content");
        assertTrue(forum.addPost(newPost));
        assertEquals(newPost,forum.getPostById(4));
        assertTrue(forum.addPost(newPost1));
        forum.printArray("Array after new post");

    }

    @Test
    void removePost() {
        forum.printArray("Original array");
        assertTrue(forum.removePost(1));
        assertEquals(2,forum.size());
        forum.printArray("Array after removing");
    }

    @Test
    void updatePost() {
        forum.printArray("Original array");
        assertTrue(forum.updatePost(1,"updated content"));
        assertEquals("updated content", forum.getPostById(1).getContent());
        forum.printArray("Array after updating");
    }

    @Test
    void getPostById() {
        Post retrievedPost = forum.getPostById(3);
        assertNotNull(retrievedPost);
        assertEquals(posts[2],retrievedPost);
    }

    @Test
    void getPostsByAuthor() {
        Post[] authorPosts = forum.getPostsByAuthor("author2");
        assertNotNull(authorPosts);
        assertEquals(1,authorPosts.length);
        assertEquals(posts[1],authorPosts[0]);
    }

    @Test
    void testGetPostsByAuthor() {
        LocalDate dateFrom = LocalDate.now().minusDays(1);
        LocalDate dateTo = LocalDate.now().plusDays(1);
        Post[] authorPosts = forum.getPostsByAuthor("author3",dateFrom,dateTo);
        assertNotNull(authorPosts);
        assertEquals(1,authorPosts.length);
        assertEquals(posts[2],authorPosts[0]);
    }
}