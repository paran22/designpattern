package ActionGame;

import ActionGame.entity.Knight;
import ActionGame.entity.Troll;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.fight();

        Troll troll = new Troll();
        troll.fight();
    }
}
