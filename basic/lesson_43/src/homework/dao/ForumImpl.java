package homework.dao;



import homework.model.Post;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ForumImpl implements Forum{
    private Post[] posts;
    private int size;
    public ForumImpl() {
        posts = new Post[0];
    }

    static Comparator <Post> comparator = (p1,p2) -> {
        return p1.getDate().compareTo(p2.getDate());
    };

    @Override
    public boolean addPost(Post post) {
        if (post == null || getPostById(post.getPostId()) != null) {
            return false;
        }
        post.addLike();

        int index = Arrays.binarySearch(posts, 0, size, post, comparator);
        if (index < 0) {
            index = -index - 1;
        }

        // Увеличиваем размер массива на 1
        posts = Arrays.copyOf(posts, size + 1);

        // Сдвигаем элементы с index и далее на одну позицию вправо
        System.arraycopy(posts, index, posts, index + 1, size - index);

        // Вставляем новый элемент на место index
        posts[index] = post;

        size++;
        return true;
    }





    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                System.arraycopy(posts,i+1,posts,i,size-1-i);
                posts[--size]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                posts[i].setContent(content);
                return true;
            }
        }
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                return posts[i];
            }
        }
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().equals(author)) {
                count++;
            }
        }

        Post[] postsByAuthor = new Post[count];
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().equals(author)) {
                postsByAuthor[index] = posts[i];
                index++;
            }
        }
        return postsByAuthor;
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            LocalDate postDate = posts[i].getDate().toLocalDate();

            if (posts[i].getAuthor().equals(author)
                    && postDate.compareTo(dateFrom) >= 0
                    && postDate.compareTo(dateTo) <= 0) {
                count++;
            }
        }

        Post[] matchingPosts = new Post[count];
        int index = 0;

        for (int i = 0; i < size; i++) {
            LocalDate postDate = posts[i].getDate().toLocalDate();

            if (posts[i].getAuthor().equals(author) &&
            postDate.compareTo(dateFrom) >= 0 &&
            postDate.compareTo(dateTo) <= 0) {
                matchingPosts[index] = posts[i];
                index++;
            }
        }
        return matchingPosts;
    }
    public void printArray(String title) {
        System.out.println(title);
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }

    @Override
    public int size() {
        return size;
    }
}
