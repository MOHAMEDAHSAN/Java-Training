import java.util.Scanner;

public class swtichCase {
    public static void main(String[] args) {
        int[][] dates = { };
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] date={};
            date[0]=sc.nextInt();
            date[1]=sc.nextInt();
            dates[i]=date;
            int day = dates[i][0];
            int month = dates[i][1];

            String dayName = "";
            String monthName = "";

            switch (day) {
                case 1: dayName = "Mon"; break;
                case 2: dayName = "Tue"; break;
                case 3: dayName = "Wed"; break;
                case 4: dayName = "Thu"; break;
                case 5: dayName = "Fri"; break;
                case 6: dayName = "Sat"; break;
                case 7: dayName = "Sun"; break;
                default: dayName = "InvalidDay";
            }

            // Switch for month
            switch (month) {
                case 1: monthName = "Jan"; break;
                case 2: monthName = "Feb"; break;
                case 3: monthName = "Mar"; break;
                case 4: monthName = "Apr"; break;
                case 5: monthName = "May"; break;
                case 6: monthName = "Jun"; break;
                case 7: monthName = "Jul"; break;
                case 8: monthName = "Aug"; break;
                case 9: monthName = "Sep"; break;
                case 10: monthName = "Oct"; break;
                case 11: monthName = "Nov"; break;
                case 12: monthName = "Dec"; break;
                default: monthName = "InvalidMonth";
            }

            System.out.println(dayName + " " + monthName);
        }
        sc.close();
    }
}
