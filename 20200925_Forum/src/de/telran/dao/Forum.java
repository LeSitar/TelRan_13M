package de.telran.dao;

import de.telran.data.Admin;
import de.telran.data.Post;
import de.telran.data.User;
import de.telran.data.UserAdmin;

import java.util.Scanner;

public class Forum {
    private Post[] posts;
    private int size;
    private Admin admin;

    public Forum(int capacity, String password){
        posts = new Post[capacity];
        size = 0;
        this.admin = new Admin(password);
    }

    public int getSize() {
        return size;
    }

    public boolean addPost(Post post){
        if(size<posts.length){
            posts[size] = post;
            size++;
            return true;
        }
        return false;
    }

    //User user1 = new User("Vasya", 20);

    public Post[] getLastPostsByAuthor(String author, int numberOfPost){
        Post[] authorsPosts = new Post[numberOfPost];
        int index = 0;
        for (int i = 0; i <size ; i++) {
            if(posts[i].getAuthor().getUserName().equalsIgnoreCase(author) && index<numberOfPost){
                authorsPosts[index] = posts[i];
                index++;
            }
        }
        return authorsPosts;
    }

    public int getCountLikesByTitle(String title){
        for (int i = 0; i <size ; i++) {
            if(posts[i].getTitle().equalsIgnoreCase(title)){
                return posts[i].getLikes();
            }
        }
        return -1;
    }


    public void updatePostByUserAdmin(int postId, Scanner scanner, User admin){
        if(!(admin instanceof UserAdmin))
            System.out.println("access is denied");
       else if(((UserAdmin)admin).checkPassword(scanner)){
            boolean flag = false;
            for (int i = 0; i <size ; i++) {
                if(posts[i].getPostID()==postId){
                    System.out.println("old content: " + posts[i].getContent());
                    System.out.println("Enter new content");
                    posts[i].setContent(scanner.nextLine());
                    System.out.println(postId + " content change to: " + posts[i].getContent());
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("post not found");
            }
        }else {
            System.out.println("access is denied");
        }
    }

    public void updatePostByAdmin(int postId, Scanner scanner){
        if(admin.checkPassword(scanner)){
            boolean flag = false;
            for (int i = 0; i <size ; i++) {
                if(posts[i].getPostID()==postId){
                    System.out.println("old content: " + posts[i].getContent());
                    System.out.println("Enter new content");
                    posts[i].setContent(scanner.nextLine());
                    System.out.println(postId + " content change to: " + posts[i].getContent());
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("post not found");
            }
        }else {
            System.out.println("access is denied");
        }
    }




}
