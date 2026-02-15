public class PrintNameFiveTimes {
    public static void main(String[] args) {
        printName("Afshan", 5);
    }

    public static void printName(String name,int times){
        if(times == 0) return;
        
        System.out.println(name);

        printName(name, times -1 );
    }
}
