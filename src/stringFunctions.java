public class stringFunctions {
    public static boolean checPalindrome(String Name){
        String outpu = "";
        char ch ;
        for(int i = 0 ; i<Name.length() ; i++){
            ch = Name.charAt(i);
            outpu = ch + outpu;
        }
        return Name.equalsIgnoreCase(outpu);
    }
    public static void main(String[] args) {
        String Name = "Malayalam";
        boolean Result = checPalindrome(Name);
        if (Result) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }
}