import java.io.*;

public class Twenty {

    public static boolean isLeapYear(int y) {
        boolean ret = false;
        
        if (y % 400 == 0) {
            ret = true;
        }
        else if (y % 100 == 0) {
            ret = false;
        }
        else if (y % 4 == 0) {
            ret = true;
        }
        else {
            ret = false;
        }
        
        return ret;
    }
    
    public static String computeDate(int day, int year) {
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthNames[] = {"Januart", "February", "March", 
                                "April", "May", "June", 
                                "July", "August", "September", 
                                "October", "November", "December"};
                                
        boolean leap = isLeapYear(year);
        
        if (leap) {
            monthDays[1] = 29;
        }
        
        int i = 0;
        int daySum = 0;
        for (i = 0; i < monthDays.length; i++) {
            daySum += monthDays[i];
            if (daySum >= day) {
                break;
            }
        }
        
        int date = day + monthDays[i] - daySum;
        
        StringBuffer sb = new StringBuffer();
        sb.append(date);
        sb.append("th ");
        sb.append(monthNames[i]);
        sb.append(", ");
        sb.append(year);
        
        return sb.toString();
    }
    
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Day number: ");
        int dayNum = Integer.parseInt(in.readLine());
        System.out.print("Year: ");
        int year = Integer.parseInt(in.readLine());
        System.out.print("Date after (n days): ");
        int n = Integer.parseInt(in.readLine());
        
        if (dayNum < 1 || dayNum > 366) {
            System.out.println("Day number out of range.");
            return;
        }
         
        if (n < 1 || n > 100) {
            System.out.println("Date after N days out of range");
            return;
        }
        
        String dateStr = computeDate(dayNum, year);
        
        int nDays = dayNum + n;
        int nYear = year;
        boolean leap = isLeapYear(year);
        
        if (leap && nDays > 366) {
            nYear = nYear + 1;
            nDays = nDays - 366;
        }
        else if (nDays > 365) {
            nYear = nYear + 1;
            nDays = nDays - 365;
        }
        
        String nDateStr = computeDate(nDays, nYear);
        
        System.out.println();
        System.out.println("Date: " + dateStr);
        System.out.println("Date after " + n 
                            + " days: " + nDateStr);
    }

}