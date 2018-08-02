public class CodeupStudent {

    private int id;
    private String name;
    private String cpuModel;
    private double grade;

    public CodeupStudent(int id, String name, String cpuModel, double grade) {
        this.id = id;
        this.name = name;
        this.cpuModel = cpuModel;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
