package game;

import game.model.*;

public class View {

    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = String.join("", "┌" + "─┬".repeat(9) + "─┐");
    private static final String midl10 = String.join("", "├" + "─┼".repeat(9) + "─┤");
    private static final String bottom10 = String.join("", "└" + "─┴".repeat(9) + "─┘");
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf("%" + dif + "s", ":\t"); else System.out.print(":\t");
    }
    private static String getChar(int y, int x){
        String out = " ";
        char letter;
        for (BaseHero human: Main.allTeam) {
            letter = human.toString().charAt(0);                             // first letter of super class name
            if (human.getPosition().x == x && human.getPosition().y == y) {
                if (Main.teamGood.contains(human)) out = (AnsiColors.ANSI_GREEN + letter + AnsiColors.ANSI_RESET);
                if (Main.teamEvil.contains(human)) out = (AnsiColors.ANSI_BLUE + letter + AnsiColors.ANSI_RESET);
                if (BaseHero.State.Dead.equals(human.state)) out = (AnsiColors.ANSI_RED + letter + AnsiColors.ANSI_RESET);
            }
        }
        return "|" + out;
    }
    public static void view() {
        System.out.print(AnsiColors.ANSI_YELLOW + ((step == 1)?"First step":"Step" + step) + AnsiColors.ANSI_RESET);
        step++;
        Main.allTeam.forEach((v) -> l[0] = Math.max(l[0], v.getInfo().length()));   // Самая длиная строка l[0]
        System.out.println("_".repeat(l[0]*2));
        System.out.print(top10 + "    ");
        System.out.print(AnsiColors.ANSI_GREEN+":\tGreen side"+AnsiColors.ANSI_RESET);
        System.out.print(" ".repeat(l[0]-9));
        System.out.println(AnsiColors.ANSI_BLUE+"Blue side"+AnsiColors.ANSI_RESET);
        for (int i = 1; i < 11; i++) System.out.print(getChar(1, i));
        System.out.print("|    ");
        System.out.print(Main.teamGood.get(0).getInfo());
        tabSetter(Main.teamGood.get(0).getInfo().length(), l[0]);
        System.out.println(Main.teamEvil.get(0).getInfo());
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(Main.teamGood.get(i-1).getInfo());
            tabSetter(Main.teamGood.get(i-1).getInfo().length(), l[0]);
            System.out.println(Main.teamEvil.get(i-1).getInfo());
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(Main.teamGood.get(9).getInfo());
        tabSetter(Main.teamGood.get(9).getInfo().length(), l[0]);
        System.out.println(Main.teamEvil.get(9).getInfo());
        System.out.println(bottom10);
    }
}
