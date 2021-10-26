package vishnu.assignment4;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        for(int i=0;i<n+1;i++)
        {
            String signUp = sc.next();
            String currDate = sc.next();
            Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(signUp);
            Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(currDate);
            calendar.setTime(date1);
            LocalDate signUpDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
            int month = calendar.get(Calendar.MONTH)+1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            calendar.setTime(date2);
            LocalDate currentDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
            LocalDate curYearSignUp = LocalDate.of(calendar.get(Calendar.YEAR),month,day);
            if(signUpDate.getYear()!=currentDate.getYear())
            {
                LocalDate startingDate = curYearSignUp.minusDays(30);
                LocalDate endDate = curYearSignUp.plusDays(30);
                LocalDate FinalEndDate ;
                if(endDate.compareTo(currentDate) > 0)
                        FinalEndDate = currentDate;
                else
                        FinalEndDate = endDate;

                  System.out.println(startingDate+" "+FinalEndDate);
            }
            else
                System.out.println("No range");

        }
    }
}
