public class Practical11  {
   
    public static boolean verifyPassword(String password){
      boolean hasLowerCase = false;
      boolean hasUpperCase = false;
      boolean hasDigit = false;
      boolean hasLength = password.length() >= 8;
      boolean hasSpecial = false;
      String specialChars = "+_()*&^%$#@!{}:\"<>?|[]\\;',./~`";
      
      for (int i=0; i<password.length();i++){
      char c = password.charAt(i);
      if (Character.isLowerCase(c)){
         hasLowerCase=true;
     }else if (Character.isDigit(c)){
         hasDigit=true;
     }else if (Character.isUpperCase(c)){
         hasUpperCase=true;
     }else if (specialChars.contains(String.valueOf(c))){
         hasSpecial=true;
         }
      }
      if (!hasLength){
        System.out.println("Password must have a miniumum of 8 characters.");
      }
      if (!hasLowerCase){
        System.out.println("Password must have at least one lowercase.");
      }
      if (!hasDigit){
        System.out.println("Password must have at least one digit.");
      }
      if (!hasUpperCase){
        System.out.println("Password must at least one uppercase.");
      }
      if (!hasSpecial){
        System.out.println("Password must have at least one special character.");
      }
      return hasLength&&hasLowerCase&&hasDigit&&hasUpperCase&&hasSpecial;
      }
      
      public static void main(String[]args){
        String password = "PAULOS2!#";
        String password2 = "CSc221;|.";
        String password3 = ".,[]Sc!c";
        String password4 = "c0msc!+``";
        String password5 = "Paul4125570";
        String password6 = "Uwc2@";
        
        
        System.out.println("Is the 1st password valid: " + verifyPassword(password));
        System.out.println("Is the 2nd password valid: " + verifyPassword(password2));
        System.out.println("Is the 3rd password valid: " + verifyPassword(password3));
        System.out.println("Is the 4th password valid: " + verifyPassword(password4));
        System.out.println("Is the 5th password valid: " + verifyPassword(password5));
        System.out.println("Is the 6th password valid: " + verifyPassword(password6));
      }
     }
    