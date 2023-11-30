package Enums.practices.practice02;

import Enums.practices.practice02.entities.Comment;
import Enums.practices.practice02.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        LocalDateTime today = LocalDateTime.now();
        Date todayDate = Date.from(today.atZone(ZoneId.systemDefault()).toInstant());

        Comment comment01 = new Comment("Have a nice day!");
        Comment comment02 = new Comment("I like you!");

        Post post01 = new Post(simpleDateFormat.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
                "I'm going to visit this wonderful country!" , 12);

        post01.addComment(comment01);
        post01.addComment(comment02);

        Post post02 = new Post(todayDate, "Good night!", "See yoy tomorrow", 23);
        Comment comment03 = new Comment("WTF");
        Comment comment04 = new Comment("GZUZZZZ!");

        post02.addComment(comment03);
        post02.addComment(comment04);


        System.out.println(post01);
        System.out.println(post02);

    }
}
