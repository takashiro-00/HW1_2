import java.time.LocalDate;

public class Student {
    private String name;
    private String gender;
    private LocalDate dob;
    public Student(String name, String gender, int year,int month,int day) {
        if(!isValidName(name)){
            throw new InvalidNameException(name);
        }
        this.name = name;
        this.gender = gender;
        if(!isValidDob(year)){
            throw new InvalidDobException(year);
        }
        this.dob = LocalDate.of(year,month,day);
    }
    public Boolean isValidName(String name){
        return name.matches("^[a-zA-Z\\s]+$");
    }
    public Boolean isValidDob(int year){

        return year >= 2006 && year <= 2017;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
