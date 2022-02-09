package Java.Assignment4;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class KycFormDate {
    Date signUpDate, currentDate;
    String stringStartDate, stringEndDate;
    Date startDate, endDate;

    public void range(String inputSignUpDate, String inputCurrentDate) {
        try {
            //Date to string convertion
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate = dateFormatter.parse(inputCurrentDate);
            //checking the validity of date
            if (signUpDate.after(currentDate)) {
                System.out.println("No range");
            } else {
                startDate = signUpDate;
                //setting sign up year to start date
                startDate.setYear(currentDate.getYear());
                //creating calendar object
                Calendar calendar = Calendar.getInstance();
                //setting startdate as calender current date
                calendar.setTime(startDate);
                //subtracting 30 days from the calender date
                calendar.add(Calendar.DATE, -30);
                startDate = calendar.getTime();
                //adding 60 days to the calender date
                calendar.add(Calendar.DATE, 60);
                endDate = calendar.getTime();
                //verify the end date if end date passes the current date than set as current date
                if (endDate.after(currentDate)) {
                    endDate = currentDate;
                }
            }
            //changing date object to string
            stringStartDate = dateFormatter.format(startDate);
            stringEndDate = dateFormatter.format(endDate);
            //pirnting the dates
            System.out.print(stringStartDate);
            System.out.print("        ");
            System.out.println(stringEndDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Assignment4 {
    public static void main(String[] args) {
        //creating the object of KycFormClass class
        KycFormDate obj =new KycFormDate();
        //calling the method rangeKyc by passing the arguments by its object
        obj.range("16-07-1998", "27-06-2017");
        obj.range("04-02-2016", "04-04-2017");
        obj.range("04-05-2017", "04-04-2017");
        obj.range("04-04-2015", "04-04-2016");
        obj.range("04-04-2015", "15-03-2016");
    }
}

