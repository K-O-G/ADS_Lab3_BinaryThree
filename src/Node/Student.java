package Node;

/**
 * Created by Катя on 12.02.2017.
 */
public class Student {


    private int  studentIDCard;
    private String  surname ;
    private String name;
    private int academicYear;
    private String gender;
    private String maritalStatus;

    @Override
    public String toString() {
        return String.format("%-8d | %-9s | %-5s | %-1d | %-6s | %s",studentIDCard, surname, name, academicYear, gender, maritalStatus);
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }


    private enum surnameR {Lashenko,Gorobets, Morsenko,Olonko,Duzy,Nonamenko}
    private enum nameMaleR {Vasya,Petya,Vlad,Tolya}
    private enum nameFemaleR {Olya,Katya,Vera,Ann}
    private enum genderR {male,female}
    private enum maritalStatusR {unmarried,married,/* divorced, widowed*/}


    public Student(int index) {
        this.studentIDCard = index;
        this.gender = randomGender();
        this.surname = randomSurname();
        this.name = randomName();
        this.academicYear = randomAcademicYear();
        this.maritalStatus = randomMaritalStatus();
    }

    private int randomStudentIDCard(){
        return (int)(Math.random()*99999999);
    }

    private int randomAcademicYear(){
        return (int)(Math.random()*6+1);
    }

    private String randomSurname(){
        return (surnameR.values()[(int)(Math.random()*6)]).toString();
    }
    private String randomName(){
        if (gender.equals("female")) {
            return (nameFemaleR.values()[(int) (Math.random() * 4)]).toString();
        }
        else{
            return (nameMaleR.values()[(int) (Math.random() * 4)]).toString();
        }
    }

    private String randomGender(){
        return (genderR.values()[(int)(Math.random()*2)]).toString();
    }

    private String randomMaritalStatus(){
        return (maritalStatusR.values()[(int)(Math.random()*2)]).toString();
    }

    public int getStudentIDCard() {
        return studentIDCard;
    }
}
