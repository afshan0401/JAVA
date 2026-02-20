public class DuckNumberRec{
    public static void main(String[] args) {
        int num = 041;
        String str = String.valueOf(num);
        
        System.out.println(duckOrNot(num)?"duck":"not duck");

    }


    public static boolean duckOrNot(int num){
        
        if(num==0) return false;

        return checkZero(num);
    }

    public static boolean checkZero(int num){
        if(num ==0) return false;

        if(num%10== 0) return true;

        return checkZero(num/10);
    }
}