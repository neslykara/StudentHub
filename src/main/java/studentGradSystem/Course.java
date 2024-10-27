package studentGradSystem;

public class Course
{
   private String name;
   private String prefix;
   private String teacher;
   private int code;
   private double yaziliNotu;
   private double sozluNotu;


    public Course(String name, String prefix, String teacher, int code, double yaziliNotu, double sozluNotu) {
        this.name = name;
        this.prefix = prefix;
        this.teacher = teacher;
        this.code = code;
        this.yaziliNotu = yaziliNotu;
        this.sozluNotu = sozluNotu;
    }

    //getter
    public String getName() {return name;}
    public String getPrefix() {return prefix;}
    public String getTeacher() {return teacher;}
    public int getCode() {return code;}
    public double getYaziliNotu() {return yaziliNotu;}
    public double getSozluNotu() {return sozluNotu;}

    //setter
    public void setName(String name) {this.name = name;}
    public void setPrefix(String prefix) {this.prefix = prefix;}
    public void setTeacher(String teacher) {this.teacher = teacher;}
    public void setCode(int code) {this.code = code;}
    public void setYaziliNotu(double yaziliNotu) {this.yaziliNotu = yaziliNotu;}
    public void setSozluNotu(double sozluNotu) {this.sozluNotu = sozluNotu;}
}
