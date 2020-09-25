package de.telran.dao;

import de.telran.data.Post;
import de.telran.data.UserAdmin;

import java.util.Scanner;

public class Forum {
    private Post[] posts;
    private int size;

    public Forum(int capacity){
        posts = new Post[capacity];
        size = 0;
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

    //class ValidatorDate  public boolean validationDate(int year, int month, int day);  //2019 2 29

    public void updatePostByAdmin(int postId, Scanner scanner){
        if(checkPassword(scanner)){
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


    private boolean checkPassword(Scanner scanner){
        for (int i = 0; i <size ; i++) {
            if(posts[i].getAuthor().getClass().getSimpleName().equals("UserAdmin")){
                UserAdmin admin = (UserAdmin)posts[i].getAuthor();
                int count = 3;
                while(count>0){
                    System.out.println("enter password, please");
                    String password = scanner.nextLine();
                    if(admin.getPassword().equals(password))
                        return true;
                    else count--;
                }
                break;
            }

        }
        return false;
    }

}
