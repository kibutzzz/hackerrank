package challenges.java;

import java.util.Arrays;
import java.util.Comparator;

public class JavaComparator {
    public static class Checker implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            if(o1.score < o2.score) {
                return 1;
            } else if(o1.score > o2.score) {
                return -1;
            }
            return o1.name.compareTo(o2.name);
        }
    }

    static class Player{
        String name;
        int score;

        public Player(String name, int score){
            this.name = name;
            this.score = score;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null) return false;
            if(!( obj instanceof Player)) return false;
            Player target = (Player) obj;
            return name.equals(target.name) && score == target.score;
        }
    }
}
