import java.time.LocalDate;

public class Passport {
    String name;
    String last;
    String id;
    LocalDate localDate;
    String gender;
    String national;
    public  Passport(){};

    public Passport (String name,String last,String id,String national,String gender,LocalDate localDate){
        this.name = name;
        this.last = last;
        this.id = id;
        this.gender = gender;
        this.national = national;
        this.localDate = localDate;
    }


}
