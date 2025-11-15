package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {


        LocalDate post1Date = LocalDate.of(2018, 06, 21);
        String post1Tilte = "Traveling to New Zealand";
        String post1Content = "I'm going to visit this wonderful contry";
        int post1Likes = 12;
        Comment post1Comment1 = new Comment("Have a nice trip.");
        Comment post1Comment2 = new Comment("Wow that's awesome!");


        LocalDate post2Date = LocalDate.of(2018, 07, 28);
        String post2Tilte = "Good night guys";
        String post2Content = "See you tomorrow";
        int post2Likes = 5;
        Comment post2Comment1 = new Comment("Good night");
        Comment post2Comment2 = new Comment("May the Force be with you");


        Post post1 = new Post(post1Date, post1Tilte, post1Content, post1Likes);
        post1.addComment(post1Comment1);
        post1.addComment(post1Comment2);

        Post post2 = new Post(post2Date, post2Tilte, post2Content, post2Likes);
        post2.addComment(post2Comment1);
        post2.addComment(post2Comment2);


        System.out.println(post1.getTitle());
        System.out.println(post1.getLikes() + " Likes - " + post1.getMoment());
        System.out.println(post1.getContent());
        System.out.println("Comments:");



        for(Comment c : post1.getPostComments()){
            System.out.println(c.getText());

        }

        System.out.println();
        System.out.println();


        System.out.println(post2.getTitle());
        System.out.println(post2.getLikes() + " Likes - " + post2.getMoment());
        System.out.println(post2.getContent());
        System.out.println("Comments:");
        for(Comment c : post2.getPostComments()){
            System.out.println(c.getText());

        }












    }

}
