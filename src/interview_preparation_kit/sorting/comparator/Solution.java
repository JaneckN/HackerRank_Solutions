package interview_preparation_kit.sorting.comparator;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 25 July 2021 @ 23:15
 */


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score < b.score) {
            return 1;
        } else if (a.score > b.score) {
            return -1;
        } else {
            return compareByName(a, b);
        }
    }

    private int compareByName(Player a, Player b) {
        return a.name.compareTo(b.name);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
