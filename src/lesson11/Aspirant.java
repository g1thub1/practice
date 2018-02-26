package lesson11;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String scienceWork) {
        super(firstName, lastName, group, avgMark);
        this.scienceWork = scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public double getScholarship() {
        if (getAvgMark() == 9.6) {
            return 200;
        } else {
            return 180;
        }
    }
}
