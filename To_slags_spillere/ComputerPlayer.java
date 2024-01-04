package To_slags_spillere;

import To_slags_spillere.Player;
import java.util.Random;
public class ComputerPlayer implements Player {
    private final int maxValue = 10;
    private Random random = new Random();

    @Override
    public int makeAGuess(int value) {
        //for at sikre, at gættet er mellem 1 og maxValue tilføjes +1,
        return random.nextInt(maxValue) + 1;
    }
}

