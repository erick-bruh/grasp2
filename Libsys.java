public class Libsys {
    // init global variables
    static int bookCount = 0;
    static int readerCount = 0;
    static Date dateToday = new Date(1, 1, 1900);

    public static void main(String[] args) {
        // task 1
        Reader r1 = new Reader("Jeff", "jeff@gmail.com");
        Reader r2 = new Reader("john", "john@gmail.com");
        Book b1 = new Book("Hunter x Hunter");
        Book b2 = new Book("nic take konkretne");
        setDate(5, 5, 2021);

        // task 2
        b1.borrow(r1);
        b2.borrow(r2);
        System.out.println(fine(b1));
        System.out.println(fine(b2));
        setDate(5, 6, 2021);

        // task 3
        b1.Return();
        System.out.println(fine(b1));
        System.out.println(fine(b2));
        setDate(6, 7, 2021);
        System.out.println(fine(b1));
        System.out.println(fine(b2));

        // task 4
        b2.Return();
        System.out.println(fine(b1));
        System.out.println(fine(b2));

    }

    // method to set the date today
    static void setDate(int day, int month, int year) {
        dateToday.setDay(day);
        dateToday.setMonth(month);
        dateToday.setYear(year);
    }

    Date getDate() {
        return dateToday;
    }

    // get fine for book
    static String fine(Book borrowed) {
        String result;
        int ammount = 0;

        // checking if the book has been borrowed
        if (borrowed.isBorrowed == false) {
            result = "the book " + borrowed.getName() + " is not currently borrowed by anyone";
        } else {

            // calculating fine
            if (borrowed.dateExpected.getYear() != dateToday.getYear()) {
                ammount = 10000;
            } else if (borrowed.dateExpected.getMonth() < dateToday.getMonth()) {
                ammount = (dateToday.getMonth() - borrowed.dateExpected.getMonth()) * 500;
            } else if (borrowed.dateExpected.getMonth() == dateToday.getMonth()
                    && borrowed.dateExpected.getDay() < dateToday.getDay()) {
                ammount = (dateToday.getDay() - borrowed.dateExpected.getDay()) * 15;
            } else {
                ammount = 0;
            }

            result = "the fine for book " + borrowed.getName() + " is " + ammount;
        }
        return result;
    }

}
