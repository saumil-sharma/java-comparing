package comparator;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import comparator.player.Player;
import comparator.player.PlayerAgeComparator;

public class App{
    public static void main(String[] args) {
        App mainApp = new App();
        mainApp.start();
    }

    private void start(){
        Player captain = new Player("John", 1, 36);
        Player first = new Player("Adam", 2, 31);
        Player second = new Player("Jacob", 3, 91);

        List<Player> players = new ArrayList<Player>();
        players.add(captain);
        players.add(first);
        players.add(second);

        System.out.println("Unsorted\n" + players);

        Collections.sort(players, new PlayerAgeComparator());

        System.out.println("Sorted\n" + players);
    }
}