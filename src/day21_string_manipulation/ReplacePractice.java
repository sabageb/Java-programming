package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word) ;

        word = word.replace("hub","lab");//
        System.out.println("word = " + word);
//gitlab
// i -> o   a->i
        System.out.println(word.replace('i','o').replace('a','i'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println("withNoSpaces =" + withNoSpaces);
        // "java -> to "selenium, replace "fun -> "a lot of fun->assign back to withNoSpaces

       // sentence= sentence.replace(("java","selenium")
        //                 .replace("fun","a lot of fun");


        sentence=sentence.replace("java","selenium");
        sentence =sentence.replace("fun", " a lot of fun ");
        //sentence=sentence.replace("sentence = " + sentence);


        //System.out.println("withNoSpaces = " + withNoSpaces);



String result = "1-40 of over 4000 results for java book";

        result.replace("1-48 of over ","").replace(" ","")
        .replace("result for java book", "");

        System.out.println("result = " + result);

     //   int count = Integer.parseInt(result);
       // count++;
        //if(count > 0){
          //  System.out.println("search success");
        }



    }
