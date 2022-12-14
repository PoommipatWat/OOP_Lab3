import java.time.LocalDate;

public class User{
    private String name;
    private LocalDate dob;

    public void doSomething(){
        System.out.println("Hello " + this.name + " who was born on " + this.dob + "!");
    }

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String _name, int _year, int _month, int _day){
        this.name = _name;
        this.dob = LocalDate.of(_year, _month, _day);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public void setDob(){
        this.dob = LocalDate.now();
    }

    public void setDob(int _year, int _month, int _day){
        this.dob = LocalDate.of(_year, _month, _day);
    }

}