package task.com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentWithClock implements Learner{
    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }
    @Override
    public void learn() {
        learner.learn();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        System.out.println("Текущее время: " + time.format(now));
    }
}
