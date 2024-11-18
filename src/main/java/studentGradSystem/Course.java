package studentGradSystem;

public class Course
{
   private String name;
   private String prefix;
   private Teacher teacher;
   private int code;
   private int sinavNotu1;
   private int sinavNotu2;
   private int sozluNotu1;
   private int sozluNotu2;
   private int sozluNotu3;
   private double courseOrtNot;
   final double yaziliNotuOran =0.7;
   final double sozluNotuOran = 0.3;

   //constructor
    public Course(String name,Teacher teacher, int sinavNotu1, int sinavNotu2, int sozluNotu1, int sozluNotu2, int sozluNotu3,double courseOrtNot) {
        this.name = name;
        this.teacher = teacher;
        this.sinavNotu1 = sinavNotu1;
        this.sinavNotu2 = sinavNotu2;
        this.sozluNotu1 = sozluNotu1;
        this.sozluNotu2 = sozluNotu2;
        this.sozluNotu3 = sozluNotu3;
        this.courseOrtNot = courseOrtNot;
    }


    public Course(String name,Teacher teacher, int sinavNotu1, int sozluNotu1, int sozluNotu2, double courseOrtNot) {

        this.name = name;
        this.teacher = teacher;
        this.sinavNotu1 = sinavNotu1;
        this.sozluNotu1 = sozluNotu1;
        this.sozluNotu2 = sozluNotu2;
        this.courseOrtNot = courseOrtNot;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getCode() {
        return code;
    }

    public int getSinavNotu1() {
        return sinavNotu1;
    }

    public int getSinavNotu2() {
        return sinavNotu2;
    }

    public int getSozluNotu1() {
        return sozluNotu1;
    }

    public int getSozluNotu2() {
        return sozluNotu2;
    }

    public int getSozluNotu3() {
        return sozluNotu3;
    }

    public double getYaziliNotuOran() {
        return yaziliNotuOran;
    }

    public double getSozluNotuOran() {
        return sozluNotuOran;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSinavNotu1(int sinavNotu1) {
        this.sinavNotu1 = sinavNotu1;
    }

    public void setSinavNotu2(int sinavNotu2) {
        this.sinavNotu2 = sinavNotu2;
    }

    public void setSozluNotu1(int sozluNotu1) {this.sozluNotu1 = sozluNotu1;}

    public void setSozluNotu2(int sozluNotu2) {
        this.sozluNotu2 = sozluNotu2;
    }

    public void setSozluNotu3(int sozluNotu3) {
        this.sozluNotu3 = sozluNotu3;
    }

    public double getCourseOrtNot() {
        return courseOrtNot;
    }

    public void setCourseOrtNot(double courseOrtNot) {
        this.courseOrtNot = courseOrtNot;
    }

    @Override
    public String toString() {
        return  "Ders adı: "+name +"\n"+  teacher +
                "\n Notları:\n sinavNotu1=" + sinavNotu1 +
                "\n sinavNotu2=" + sinavNotu2 +
                "\n sozluNotu1=" + sozluNotu1 +
                "\n sozluNotu2=" + sozluNotu2 +
                "\n sozluNotu3=" + sozluNotu3 +
                "\n"+name + " not ortalaması: "+courseOrtNot;
    }
}
