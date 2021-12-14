public class Reader {

    private String name;
    private String email;
    private int id;

    Reader(String name, String email){
        this.name = name;
        this.email = email;
        // set id based on number of books in library
        id = ++Libsys.readerCount;
    }

    
}
