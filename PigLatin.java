public class PigLatin{

    public static String pigLatinSimple(String s){
      Character a = s.charAt(0);
      if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
        return (s+"hay").toLowerCase();
      }
      return (s.substring(1,s.length())+s.charAt(0)+"ay").toLowerCase();
    }

  }
