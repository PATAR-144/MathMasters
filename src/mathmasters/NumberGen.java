package mathmasters;

import java.util.Random;

public class NumberGen {
    Random random =  new Random();

    public int getRandomZeroToNine(){
        return random.nextInt(10);
    }

    public int getRandomOneToThree(){
        return (random.nextInt(3) + 1);
    }


}
