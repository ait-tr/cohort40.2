package l45.improvisation;

import java.time.LocalDateTime;

public class TimeIt {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Step #" + i);
        }
        LocalDateTime finish = LocalDateTime.now();

        float finishSecs = finish.getSecond() + (float) finish.getNano() / 1000000000;
        float startsSecs = start.getSecond() + (float) start.getNano() / 1000000000;

        System.out.println("Код выполнился за " + (finishSecs - startsSecs) + " секунд");
    }
}
