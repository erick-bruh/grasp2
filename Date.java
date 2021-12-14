public class Date {
    int day;
    int month;
    int year;



    Date(int day, int month, int year) {
        if (day > 30 || day < 1 || month > 12 || month < 1 || year > 2030 || year < 1900) {

        } else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    void setDay(int day) {
        this.day = day;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void setYear(int year) {
        this.year = year;
    }

}
