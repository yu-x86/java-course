package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
		
		LocalDateTime moment1 = LocalDateTime.parse("21/06/2018 13:05:44", fmt1);
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Post post1 = new Post(moment1, "Traveling to New Zealand", "I'm goig to visit this wonderful country!", 12);
		post1.addComment(c1);
		post1.addComment(c2);
		
		LocalDateTime moment2 = LocalDateTime.parse("28/07/2018 23:14:19", fmt1);
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post post2 = new Post(moment2, "Good night guys", "See you tomorrow", 5);
		post2.addComment(c3);
		post2.addComment(c4);
		
		System.out.println(post1.toString());
		System.out.println(post2.toString());
	}
}
