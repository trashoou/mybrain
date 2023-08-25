package homework.forum.dao;

import homework.forum.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class ForumImpl implements Forum{
    private Post[] posts;
    private int size;

    public ForumImpl(int capacity) {
        this.posts = new Post[capacity];
    }

    static Comparator<Post> comparator = (p1, p2) -> {
        int res = p1.getPostId() - (p2.getPostId());
        return res;
    };

    @Override
    public boolean addPost(Post post) {
        if (post == null) {
            throw new IllegalArgumentException("Post cannot be null");
        }

        if (getPostById(post.getPostId())!=null) {
            throw new IllegalArgumentException("Post with the same ID already exists!");
        }
        // Инициализируем индекс для вставки поста.
        int index = 0;

        // Ищем место для вставки поста в отсортированном массиве.
        // Сравниваем пост с элементами массива с помощью компаратора до тех пор, пока не найдем
        // место, куда пост нужно вставить.
        while (index < size && comparator.compare(post,posts[index])>0) {
            index++;
        }
        // Проверяем, нужно ли увеличить размер массива.
        if (size + 1 > posts.length) {
            // Создаем новый массив с увеличенным размером.
            Post[] newPosts = new Post[posts.length * 2];
            // Копируем элементы из старого массива в новый массив до индекса вставки.
            System.arraycopy(posts,0,newPosts,0,index);
            // Копируем элементы из старого массива после индекса вставки в новый массив смещая их на одну позицию.
            System.arraycopy(posts, index, newPosts, index+1, size-index);
            // Вставляем новый пост на найденное место.
            newPosts[index] = post;
            // Заменяем старый массив новым массивом.
            posts = newPosts;
        } else {
            // Если размер массива достаточен, то просто сдвигаем элементы после индекса вставки.
            System.arraycopy(posts,index,posts,index+1,size-index);
            // Вставляем новый пост на найденное место.
            posts[index]=post;
        }

        // Увеличиваем счетчик размера массива и выводим сообщение.
        size++;
        System.out.println("Loading…\n" +
                "█▒▒▒▒▒▒▒▒▒");
        System.out.println("10%\n" +
                "███▒▒▒▒▒▒▒");
        System.out.println("30%\n" +
                "█████▒▒▒▒▒");
        System.out.println("50%\n" +
                "███████▒▒▒");
        System.out.println("100%\n" +
                "██████████");
        System.out.println("Post successful loaded!");
        return true;
    }


    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < size; i++) {
            if(posts[i].getPostId() == postId) {
                System.arraycopy(posts,i+1,posts,i,size - 1 - i);
                posts[--size] = null;
                System.out.println("Post removed!");
                return true;
            }
        }
        System.out.println("Post was not found!");
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        for (int i = 0; i < size; i++) {
            if(posts[i].getPostId() == postId) {
                posts[i].setContent(content);
                System.out.println("Post was successful updated!");
                return true;
            }
        }
        System.out.println("Post was not found!");
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        Post pattern = new Post(postId,null,null,null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(posts[i])) {
                System.out.println(posts[i]);
                return posts[i];
            } else {
                System.out.println("Post wasn't found!");
            }
        }


        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        Post[] result = new Post[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            Post post = posts[i];
            if (post != null && post.getAuthor().equals(author)) {
                result[count++] = post;
            }
        }
        if (count == 0) {
            System.out.println("Author wasn't found!");
        }

        Post[] actualResult = new Post[count];
        System.arraycopy(result,0,actualResult,0,count);
        for (int i = 0; i < actualResult.length; i++) {
            System.out.println(actualResult[i]);
        }
        return actualResult;
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDateTime dateFrom, LocalDateTime dateTo) {
        Post[] result = new Post[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            Post post = posts[i];
            if (post != null && post.getAuthor().equals(author) && dateFrom.isBefore(post.getDate()) && dateTo.isAfter(post.getDate())) {
                result[count++] = post;
            }
        }
        if (count == 0) {
            System.out.println("Author wasn't found!");
        }

        Post[] actualResult = new Post[count];
        System.arraycopy(result,0,actualResult,0,count);
        for (int i = 0; i < actualResult.length; i++) {
            System.out.println(actualResult[i]);
        }
        return actualResult;
    }

    @Override
    public int size() {
        return size;
    }
}
