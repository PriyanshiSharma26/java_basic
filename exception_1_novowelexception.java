package exception;
import java.util.Scanner;
 class Vowel_Check {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a strinng");
      String userInput=sc.nextLine();
      try{
          checkVowels(userInput);
      

        System.out.println("String contains vowels.");
      
      } catch (NoVowelsException e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
  
    public static void checkVowels(String text) throws NoVowelsException {
      boolean containsVowels = false;
     // String vowels = "aeiouAEIOU";
  
      for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        //if (vowels.contains(String.valueOf(ch))) {
        if(ch=='a'||ch=='i'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
          containsVowels = true;
          break;
        }
      }
      if (!containsVowels) {
        throw new NoVowelsException("String does not contain any vowels.");
      }
    }
  }
  class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
      super(message);
    }
  }
  
    

