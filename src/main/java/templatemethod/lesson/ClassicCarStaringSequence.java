package templatemethod.lesson;

public class ClassicCarStaringSequence extends CarStaringSequence {

    @Override
    public void startTheIgnition() {
        System.out.println("Turn the key");
    }

    @Override
    public void setTheGear() {
        System.out.println("Choose a gear");
    }
}
