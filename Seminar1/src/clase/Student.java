package clase;

public class Student extends Persoana {
    private String idStudent;

    public String getIdStudent() {
        return idStudent;
    }

    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public Student() {
        super("STUD22", 18);
        this.idStudent = "0";
    }


    @Override
    public float calculVenit() {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
