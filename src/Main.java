public class Main{
    // Enter a string and the program will reverse it and print it out.
    public static void main(String[] args){
        String toReverse = "input a string here and it will be reversed";

        for(int i = toReverse.length() -1; i >= 0; i--){
            System.out.print(toReverse.charAt(i));
        }
    }
}
