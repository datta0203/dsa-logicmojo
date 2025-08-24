package Backtracking.TowersOfHanoi;

public class TowersOfHanoi {

    static int findNumberOfMovesRecursive(int n) {
        if (n == 1) return 1;

        return findNumberOfMovesRecursive(n - 1) * 2 + 1;
    }

    static int findNumberOfMoves(int discs) {
        return findNumberOfMovesRecursive(discs);
    }

    static void printMovesRecursive(int disks, char source, char dest, char aux) {
        if (disks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
            return;
        }

        printMovesRecursive(disks - 1, source, aux, dest);
        System.out.println("Move disk " + disks + " from " + source + " to " + dest);
        printMovesRecursive(disks - 1, aux, dest, source);
    }

    public static void main(String[] args) {
        int disks = 3;
        char source = 'A';
        char aux = 'B';
        char dest = 'C';
        System.out.println(findNumberOfMoves(3));
        printMovesRecursive(3, source, dest, aux);

    }
}
