package model;

public class Tester implements IWorkable {
    private int bugsDetectedCount;

    public Tester(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public void work(){
        System.out.println("Ten CV");
    }
}
