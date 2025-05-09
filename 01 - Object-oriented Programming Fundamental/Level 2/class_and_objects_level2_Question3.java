import java.util.Scanner;
class PalindromeChecker  {
    String text;
    public boolean isPalindrome(String text){
        if (text.length()==0 || text.length()==1){
            return true;
        }
        if (text.charAt(0)==text.charAt(text.length()-1)){
            return isPalindrome(text.substring(1, text.length()-1));
        }
        else{
            return false;
        }
    }
    public void display(){
        boolean isPalindrome=isPalindrome(text);
        if(isPalindrome){
            System.out.println("The given text is a palindrome");
        }
        else{
            System.out.println("The given text is not a palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker=new PalindromeChecker();
        System.out.println("Enter the text.");
        Scanner sc=new Scanner(System.in);
        palindromeChecker.text= sc.nextLine();
        palindromeChecker.display();
    }
}
