package system;

public class Graduater extends Student {

    private String researchTopic;

    public Graduater(int id, String name, String course,
                           double gpa, String researchTopic) {

        super(id, name, course, gpa);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}
