import java.util.*;
public class PigLatin{

  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      while(n.hasNextLine()){
        Scanner a = new Scanner(n.nextLine());
        while (a.hasNext()){
          String b = a.next();
          System.out.print(pigLatinBest(b));
          if (a.hasNext()){
            System.out.print(" ");
          }
      }
      if (n.hasNextLine()){
        System.out.println();
      }
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()
    }
  }

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    Character a = s.charAt(0);
    if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
      return (s+"hay");
    }
    return (s.substring(1,s.length())+s.charAt(0)+"ay");
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    Character a = s.charAt(0);
    String b = s.substring(0,2);
    String[] c = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i<c.length;i++){
      if (b.equals(c[i])){
        return (s.substring(2,s.length())+b+"ay");
      }
    }
    if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
      return (s+"hay");
    }
    return (s.substring(1,s.length())+s.charAt(0)+"ay");
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    Character a = s.charAt(0);
    String b = "";
    if (s.length()>1){
      b = s.substring(0,2);
    }
    String[] c = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    Character d = s.charAt(s.length()-1);
    boolean e = false;
    if (!Character.isLetter(a)){
      return s;
    }
    if (!Character.isLetter(d) && !Character.isDigit(d)){
      e = true;
      s = s.substring(0,s.length()-1);
    }
    if (s.length()>1){
      for (int i = 0; i<c.length;i++){
        if (b.equals(c[i]) && e == false){
          return (s.substring(2,s.length())+b+"ay");
        }
        if (b.equals(c[i]) && e == true){
          return (s.substring(2,s.length())+b+"ay"+d);
        }
      }
    }
    if ((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') && e == false){
      return (s+"hay");
    }
    if ((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') && e == true){
      return (s+"hay"+d);
    }
    if (e == false){
      return (s.substring(1,s.length())+s.charAt(0)+"ay");
    }
    return (s.substring(1,s.length())+s.charAt(0)+"ay"+d);
  }

}
