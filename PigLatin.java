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
        return (s.substring(2,s.length())+b+"ay").toLowerCase();
      }
    }
    if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
      return (s+"hay").toLowerCase();
    }
    return (s.substring(1,s.length())+s.charAt(0)+"ay").toLowerCase();
  }

  public static String pigLatinBest(String s){
    Character a = s.charAt(0);
    String b = s.substring(0,2);
    String[] c = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    Character d = s.charAt(s.length());
    boolean e = false;
    if (!Character.isLetter(a)){
      return s.toLowerCase();
    }
    if (!Character.isLetter(d) && !Character.isDigit(d)){
      e = true;
      s = s.substring(0,s.length()-1);
    }
    for (int i = 0; i<c.length;i++){
      if (b.equals(c[i]) && e == false){
        return (s.substring(2,s.length())+b+"ay").toLowerCase();
      }
      if (b.equals(c[i]) && e == true){
        return (s.substring(2,s.length())+b+"ay"+d).toLowerCase();
      }
    }
    if ((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') && e == false){
      return (s+"hay").toLowerCase();
    }
    if ((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') && e == true){
      return (s+"hay"+d).toLowerCase();
    }
    if (e == false){
      return (s.substring(1,s.length())+s.charAt(0)+"ay").toLowerCase();
    }
    return (s.substring(1,s.length())+s.charAt(0)+"ay"+d).toLowerCase();
  }

}
