package NoorV;
public class Date {
    private int day;
    private int month;
    private int year;

    

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Exception checkDate() {
        if (day < 1 || day > 31) {
            return new Exception("Invalid day");
        }
        if (month < 1 || month > 12) {
            return new Exception("Invalid month");
        }
        if( month == 2 && day > 29 ){
            return new Exception("Invalid month");
        }if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                return new Exception("Invalid month ");
            }
        }
        return null;
    }

    public boolean isAfter(Date date) {
        if (year > date.year) {
            return true;
        }
        if (year == date.year && month > date.month) {
            return true;
        }
        if (year == date.year && month == date.month && day > date.day) {
            return true;
        }
        return false;
    }

    public boolean isBefore(Date date) {
        if (year < date.year) {
            return true;
        }
        if (year == date.year && month < date.month) {
            return true;
        }
        if (year == date.year && month == date.month && day < date.day) {
            return true;
        }
        return false;
    }
}
