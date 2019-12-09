package challenges.java;

public class Java1DArray {

    public static boolean canWin(int leap, int[] game, int currentIndex) {
        //if trying to return back out of array return false
        //or if trying to go to an index with 1 return false
        if (currentIndex < 0 || game[currentIndex] == 1) return false;

        //return true if current index is the last index or if current index + leap is out of superior bounds
        if(currentIndex == game.length -1 || currentIndex + leap > game.length -1) return true;

        //avoid repeating
        game[currentIndex] = 1;

        return canWin(leap, game, currentIndex + leap) //test next step trying to go forward by leap
                || canWin(leap, game, currentIndex + 1) //test next step trying to go forward by one
                || canWin(leap, game, currentIndex - 1); //test nextStep trying to go back by 1
    }

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

}
