import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {

 	public static void main(String[] args) {
    String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/home.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/detector", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/detector.vtl");

          String word = request.queryParams("word");
          Integer totalScore = Scrabble.scrabbleMethod(word);


          model.put("totalScore", totalScore);
          model.put("word", request.queryParams("word"));
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
      }


 	public static Integer scrabbleMethod(String word){

 		word = word.toUpperCase();
 		Integer totalScore = 0;
 		char[] wordSplit = word.toCharArray();

 		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
 		hmap.put('A', 1);
 		hmap.put('E', 1);
 		hmap.put('I', 1);
 		hmap.put('O', 1);
 		hmap.put('U', 1);
 		hmap.put('L', 1);
 		hmap.put('N', 1);
 		hmap.put('R', 1);
 		hmap.put('S', 1);
 		hmap.put('T', 1);
 		hmap.put('D', 2);
 		hmap.put('G', 2);
 		hmap.put('B', 3);
 		hmap.put('C', 3);
 		hmap.put('M', 3);
 		hmap.put('P', 3);
 		hmap.put('F', 4);
 		hmap.put('H', 4);
 		hmap.put('V', 4);
 		hmap.put('W', 4);
 		hmap.put('Y', 4);
 		hmap.put('K', 5);
 		hmap.put('J', 8);
 		hmap.put('X', 8);
 		hmap.put('Q', 10);
 		hmap.put('Z', 10);

 		for(char letter : wordSplit){
 			totalScore += hmap.get(letter);
 		}

 			return totalScore;
 		}

 	}
