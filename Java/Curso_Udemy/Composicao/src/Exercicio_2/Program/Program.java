package Exercicio_2.Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Exercicio_2.entities.Comment;
import Exercicio_2.entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("How that's awesome");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}
}
