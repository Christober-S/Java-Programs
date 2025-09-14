package Patterns;

public class NamePatternChristober {
    public static void main(String[] args) {
        String name = "CHRISTOBER";
        name = name.toUpperCase();

        for (int row = 0; row < 7; row++) {
            for (int k = 0; k < name.length(); k++) {
                char ch = name.charAt(k);
                printLetter(ch, row);
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    static void printLetter(char ch, int row) {
        switch (ch) {
            case 'C':
                for (int col = 0; col < 7; col++) {
                    if ((row == 0 || row == 6) && col > 0 ||
                            (col == 0 && row > 0 && row < 6))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'H':
                for (int col = 0; col < 7; col++) {
                    if (col == 0 || col == 6 || row == 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'R':
                for (int col = 0; col < 7; col++) {
                    if (col == 0 ||
                            (row == 0 || row == 3) && col < 6 ||
                            col == 6 && row > 0 && row < 3 ||
                            col == row - 2 && row > 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'I':
                for (int col = 0; col < 7; col++) {
                    if (row == 0 || row == 6 || col == 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'S':
                for (int col = 0; col < 7; col++) {
                    if ((row == 0 || row == 3 || row == 6) && col > 0 && col < 6 ||
                            (col == 0 && (row > 0 && row < 3)) ||
                            (col == 6 && (row > 3 && row < 6)))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'T': // T
                for (int col = 0; col < 7; col++) {
                    if (row == 0 || col == 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'O': // O
                for (int col = 0; col < 7; col++) {
                    if ((row == 0 || row == 6) && col > 0 && col < 6 ||
                            (col == 0 || col == 6) && row > 0 && row < 6)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'B': // B
                for (int col = 0; col < 7; col++) {
                    if (col == 0 ||
                            (row == 0 || row == 3 || row == 6) && col < 6 ||
                            col == 6 && row != 0 && row != 3 && row != 6)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            case 'E': // E
                for (int col = 0; col < 7; col++) {
                    if (col == 0 ||
                            row == 0 || row == 3 || row == 6)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                break;

            default:
                for (int col = 0; col < 7; col++) {
                    System.out.print(" ");
                }
        }
    }
}
