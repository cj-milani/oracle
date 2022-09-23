import java.util.*;

/*
 * To do: Nothing at the moment, but consider suggestion in oracle.txt
 *
 */

public class oracle {

    public static void main (String[] args) {
        int line1;
        int line2;
        int line3;
        int line4;
        int line5;
        int line6;
        String line1_;
        String line2_;
        String line3_;
        String line4_;
        String line5_;
        String line6_;
        String lines;
        boolean special1;
        boolean special2;
        boolean special3;
        boolean special4;
        boolean special5;
        boolean special6;

        Scanner portal = new Scanner(System.in);

        System.out.println("\nAsk a question and press enter.\n");
        portal.nextLine();
        System.out.println("\n");

        line1 = line();
        special1 = isSpecial(line1);
        line2 = line();
        special2 = isSpecial(line2);
        line3 = line();
        special3 = isSpecial(line3);
        line4 = line();
        special4 = isSpecial(line4);
        line5 = line();
        special5 = isSpecial(line5);
        line6 = line();
        special6 = isSpecial(line6);

        line6_ = drawLine(line6);
        line5_ = drawLine(line5);
        line4_ = drawLine(line4);
        line3_ = drawLine(line3);
        line2_ = drawLine(line2);
        line1_ = drawLine(line1);
        lines = line1_ + line2_ + line3_ + line4_ + line5_ + line6_;
        System.out.println("\n");
        hexagram(lines);

        System.out.println("\n");

        if (special1 || special2 || special3 || special4 || special5 ||
            special6) {
            System.out.print("\n  The lines that changed: ");            }
        else {
            System.out.print("\n  No changing lines.");
            System.out.println("\n");
        }
        if (special1) {
            System.out.print("1 ");
            if (line1 == 0) {
                line1 = 1;
            }
            else {
                line1 = 2;
            }
        }
        if (special2) {
            System.out.print("2 ");
            if (line2 == 0) {
                line2 = 1;
            }
            else{
                line2 = 2;
            }
        }
        if (special3) {
            System.out.print("3 ");
            if (line3 == 0) {
                line3 = 1;
            }
            else{
                line3 = 2;
            }
        }
        if (special4) {
            System.out.print("4 ");
            if (line4 == 0) {
                line4 = 1;
            }
            else{
                line4 = 2;
            }
        }
        if (special5) {
            System.out.print("5 ");
            if (line5 == 0) {
                line5 = 1;
            }
            else{
                line5 = 2;
            }
        }
        if (special6) {
            System.out.print("6 ");
            if (line6 == 0) {
                line6 = 1;
            }
            else{
                line6 = 2;
            }
        }

        if (special1 || special2 || special3 || special4 || special5 ||
            special6) {
                System.out.print("\n");
                System.out.println("\n  Resulting hexagram:");
                System.out.println("\n");
                line6_ = drawLine(line6);
                line5_ = drawLine(line5);
                line4_ = drawLine(line4);
                line3_ = drawLine(line3);
                line2_ = drawLine(line2);
                line1_ = drawLine(line1);
                lines = line1_ + line2_ + line3_ + line4_ + line5_ + line6_;
                System.out.println("\n");
                hexagram(lines);
        }

        System.out.println("\n");

    }

    public static int line () {
        int flips = 0;
        int side = 0;
        int line = 0;

        Random yy = new Random();

        do {
            flips += 1;
            side = yy.nextInt(2);
            if (side == 1) {
                line += 1;
            }
        } while (flips < 3);

        return line;
    }

    public static boolean isSpecial (int line) {
        boolean special = false;

        if (line == 0) {
            special = true;
        }
        if (line == 3) {
            special = true;
        }

        return special;
    }

    public static String drawLine (int line) {
        String line_;

        if (line == 0 || line == 2) {
            System.out.println("_____  _____");
            line_ = "_____  _____";
        }
        else {
            System.out.println("____________");
            line_ = "____________";
        }
        return line_;
    }

    public static void hexagram (String s) {
        if (s.equals("____________" + "____________" + "____________" +
            "____________" + "____________" + "____________")) {
                System.out.println("01 • The Dynamic");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("02 • The Magnetic");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("03 • Difficulty");
        }
        else if (s.equals("_____  _____" + "____________" + "_____  _____" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("04 • Inexperience");
        }
        else if (s.equals("____________" + "____________" + "____________" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("05 • Waiting");
        }
        else if (s.equals("_____  _____" + "____________" + "_____  _____" +
            "____________" + "____________" + "____________")) {
            System.out.println("06 • Stress");
        }
        else if (s.equals("_____  _____" + "____________" + "_____  _____" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("07 • Discipline");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("08 • Holding Together");
        }
        else if (s.equals("____________" + "____________" + "____________" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("09 • Passive Restraint");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "____________" + "____________" + "____________")) {
            System.out.println("10 • Cautious Advance");
        }
        else if (s.equals("____________" + "____________" + "____________" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("11 • Harmony");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "____________" + "____________" + "____________")) {
            System.out.println("12 • Divorcement");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "____________" + "____________" + "____________")) {
            System.out.println("13 • Union of Forces");
        }
        else if (s.equals("____________" + "____________" + "____________" +
            "____________" + "_____  _____" + "____________")) {
            System.out.println("14 • Wealth");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("15 • Temperance");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "____________" + "_____  _____" + "_____  _____")) {
            System.out.println("16 • Enthusiasm/Self-Deception/Repose");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("17 • Following");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("18 • Repair");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("19 • Approach");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("20 • Contemplation");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "____________" + "_____  _____" + "____________")) {
            System.out.println("21 • Discernment");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("22 • Persona");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("23 • Disintegration");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("24 • Return");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "____________" + "____________" + "____________")) {
            System.out.println("25 • Innocence");
        }
        else if (s.equals("____________" + "____________" + "____________" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("26 • Controlled Power");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("27 • Nourishment");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("28 • Critical Mass");
        }
        else if (s.equals("_____  _____" + "____________" + "_____  _____" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("29 • Danger");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "____________" + "_____  _____" + "____________")) {
            System.out.println("30 • Clarity");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("31 • Initiative (Influence)");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "____________" + "_____  _____" + "_____  _____")){
            System.out.println("32 • Consistency");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "____________" + "____________" + "____________")) {
            System.out.println("33 • Retreat");
        }
        else if (s.equals("____________" + "____________" + "____________" +
            "____________" + "_____  _____" + "_____  _____")) {
            System.out.println("34 • Great Power");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "____________" + "_____  _____" + "____________")) {
            System.out.println("35 • Advance of Consciousness");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("36 • Clouded Perception");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("37 • The Family");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "____________" + "_____  _____" + "____________")) {
            System.out.println("38 • Mutual Alienation");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("39 • Impasse");
        }
        else if (s.equals("_____  _____" + "____________" + "_____  _____" +
            "____________" + "_____  _____" + "_____  _____")) {
            System.out.println("40 • Liberation");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("41 • Compensating Sacrifice");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("42 • Increase");
        }
        else if (s.equals("____________" + "____________" + "____________" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("43 • Resoluteness");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "____________" + "____________" + "____________")) {
            System.out.println("44 • Temptation");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "_____  _____" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("45 • Gathering Together (Contraction)");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "_____  _____" + "_____  _____" + "_____  _____")) {
            System.out.println("46 • Pushing Upward");
        }
        else if (s.equals("_____  _____" + "____________" + "_____  _____" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("47 • Oppression");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("48 • The Well");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("49 • Metamorphosis");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "____________" + "_____  _____" + "____________")) {
            System.out.println("50 • The Sacrificial Vessel");
        }
        else if (s.equals("____________" + "_____  _____" + "_____  _____" +
            "____________" + "_____  _____" + "_____  _____")) {
            System.out.println("51 • Shock/Thunder");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "_____  _____" + "_____  _____" + "____________")) {
            System.out.println("52 • Keeping Still");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("53 • Gradual Progress");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "____________" + "_____  _____" + "_____  _____")) {
            System.out.println("54 • Propriety/Making-Do");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "____________" + "_____  _____" + "_____  _____")) {
            System.out.println("55 • Abundance (Expansion of Awareness)");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "____________" + "_____  _____" + "____________")) {
            System.out.println("56 • Transition");
        }
        else if (s.equals("_____  _____" + "____________" + "____________" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("57 • Penetration");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "____________" + "____________" + "_____  _____")) {
            System.out.println("58 • Joy (Self-indulgence)");
        }
        else if (s.equals("_____  _____" + "____________" + "_____  _____" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("59 • Expansion (Dispersion)");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("60 • Restrictive Regulations");
        }
        else if (s.equals("____________" + "____________" + "_____  _____" +
            "_____  _____" + "____________" + "____________")) {
            System.out.println("61 • Inner Truth");
        }
        else if (s.equals("_____  _____" + "_____  _____" + "____________" +
            "____________" + "_____  _____" + "_____  _____")) {
            System.out.println("62 • Small Powers");
        }
        else if (s.equals("____________" + "_____  _____" + "____________" +
            "_____  _____" + "____________" + "_____  _____")) {
            System.out.println("63 • Completion");
        }
        else {
            System.out.println("64 • Unfinished Business");
        }
    }
}
