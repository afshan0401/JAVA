public class PalindromeString {
    public static void main(String[] args) {
        String s = "Madam";
        String rev = "";
        int lastChar = s.length()-1;
        StringBuilder rev1 = new StringBuilder();
        for(int i= lastChar;i>=0;i--){
            rev1.append(s.charAt(i));
        }
        // OR
        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();

        System.out.println(s);
        System.out.println(rev1);

        if(s.equalsIgnoreCase(rev1.toString())) System.out.println("palindrome" );
        else System.out.println("not palindrome" );


    }
}
