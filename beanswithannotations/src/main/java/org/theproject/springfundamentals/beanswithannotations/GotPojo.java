package org.theproject.springfundamentals.beanswithannotations;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class GotPojo {
        private static final List<String> MESSAGES = List.of(
            "Renly is the King!  Long live the King!",
            "Robert is the King!  Long live the King!",
            "Stannis is the King!  Long live the King!",
            "Joffrey is the King!  Long live the King!",
            "Daenerys is the Queen!  Long live the Queen!",
            "Cersei is the Queen!  Long live the Queen!");

    public String longLiveTheMonarch() {
        Random r = new Random();
        int i = r.nextInt(MESSAGES.size());
        return MESSAGES.get(i);
    }
}
