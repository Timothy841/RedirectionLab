public class PigLatin{

    public static String pigLatinSimple(String s){
      Character a = s.charAt(0);
      if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
        return (s+"hay").toLowerCase();
      }
      return (s.substring(1,s.length())+s.charAt(0)+"ay").toLowerCase();
    }

    public static String pigLatin(String s){
      Character a = s.charAt(0);
      String b = s.substring(0,2);
      String[] c = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
      for (int i = 0; i<c.length;i++){
        if (b.equals(c[i])){
          return s.substring(2,s.length())+b+"ay";
        }
      }
      if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
        return (s+"hay").toLowerCase();
      }
      return (s.substring(1,s.length())+s.charAt(0)+"ay").toLowerCase();
      }

  }
