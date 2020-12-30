import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      String c = "";
      while(n.hasNextLine()){
        Scanner a = new Scanner(n.nextLine());
        while (a.hasNext()){
          String b = a.next();
          for (int i = 0; i<b.length();i++){
            if (b.charAt(i)!=' '){
              c+="*";
            }
          }
          if (a.hasNext()){
            c+=" ";
          }
        }
        if (n.hasNextLine()){
          c+="\n";
        }
      }
      System.out.println(c);
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
