public class LeapYear {
    public static void main(String[] args) {
        LeapYear ly = new LeapYear();
        System.out.println(ly.leapYearCheck(2020));
    }

    public String leapYearCheck(int year) {

        boolean flag = false;
        // if (year % 100 == 0) {
        //     if (year % 400 == 0) {
        //         flag = true;
        //     } else {
        //         flag = false;
        //     }
        // } else if (year % 4 == 0) {
        //     flag = true;
        // } else {
        //     flag = false;
        // }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        if (flag)
            return "leap year";
        else
            return "not leap year";
    }
}
