package day10_shorthand_operators;

public class IncrementDecrementOperators {

    public static void main(String[] args) {


        int i= 1;
        i++;
        System.out.println(" i = " +i);
        i++;
       i++;
        ++i;
        ++i;
        int linesOfCode =15;
       System.out.println(" linesOfCode = " + linesOfCode);
       // increase linesOfCodes by 1 , 4 different ways that we learned today
       linesOfCode = linesOfCode +1;
      linesOfCode +=1;//hort hand operator
        linesOfCode++;
      ++linesOfCode;
       System.out.println(" linesOfCode = " + linesOfCode);
// type 4 different ways of decreasing by 1
        linesOfCode = linesOfCode - 1;// tradition
       linesOfCode -= 1;
       linesOfCode --;// post decreament
       --linesOfCode;//pre decreament
        System.out.println("lineOfCodes = " +linesOfCode);

       char letter = 'a';
       System.out.println("letter = " + letter);

        letter ++;
        ++letter;
       System.out.println("letter = " + letter);
       ++letter;
       System.out.println("letter = " +letter);
       letter--;
        System.out.println("letter = " +letter);

letter--;letter--;letter--;
        System.out.println("letter ="+ letter);

    }
}
