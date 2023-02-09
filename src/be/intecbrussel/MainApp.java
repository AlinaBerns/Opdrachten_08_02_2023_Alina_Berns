package be.intecbrussel;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        /*
         Opdracht 1
         1Nathan houdt van fietsen. Het is belangrijk dat je bij inspanningen zoals fietsen, genoeg drinkt.
         Hij drinkt 0.5liter water per uur met fietsen.
         Schrijf een programma dat berekend hoeveel liter Nathan drinkt tijdens zijn fietsrit.
         Rond de liters die hij heeftgedronken af naar de kleinste waarde.
         */

        for (double uur = 1.0; uur <= 6.0; uur++) {
            double liter = Math.floor(uur * 0.5);

            if (liter == 1) {
                System.out.println("Je hebt 1 liter water gedronken");
            } else {
                System.out.println("Je hebt " + liter + " water gedronken");
            }
        }
        /*
        Opdracht 2
         Deze opdracht gaan we gebruik maken van de volgende dingen: Random class en een switch statement.
         We gaan vissen! Ik wil dat je een random getal gebruikt (bound 5) om te weten welke vis we hebbengevangen of
         dat het juist vuilnis is.
         Tot slot print je uit wat we hebben gevangen.
         */
        Random random = new Random();
        int randomInt = random.nextInt(5);

        switch (randomInt) {

            case 1:
                System.out.println("Je hebt een kabeljauw gevangen");
                break;

            case 2:
                System.out.println("Je hebt zalm gevangen.");
                break;

            case 3:
                System.out.println("Je hebt een koolvis gevangen.");
                break;

            default:
                System.out.println("Je hebt het vuilnis gevangen");

        }

        /*Opdracht 3
        Converteer een nummer naar een woord.
        Wanneer je een input krijgt van een nummer tussen de 0 en 9 wordtdit omgezet naar een woord.
        Bijvoorbeeld: input -> 1 output -> "One"
         */

        Scanner myScanner = new Scanner(System.in);

        int myInt;
        do {

            System.out.println("Voer een getal in van 0 tot 9");

            myInt = myScanner.nextInt();

            switch (myInt) {
                case 0:
                    System.out.println("nul");
                    break;

                case 1:
                    System.out.println("een");
                    break;

                case 2:
                    System.out.println("twee");
                    break;

                case 3:
                    System.out.println("drie");
                    break;

                case 4:
                    System.out.println("vier");
                    break;

                case 5:
                    System.out.println("vijf");
                    break;

                case 6:
                    System.out.println("zes");
                    break;

                case 7:
                    System.out.println("zeven");
                    break;

                case 8:
                    System.out.println("acht");
                    break;

                case 9:
                    System.out.println("negen");
                    break;

                default:
                    System.out.println("je hebt het verkeerde nummer ingevoerd");

            }


        } while (myInt > 10);

        /*
        Opdracht 6
        Verander de waarde van de deze variabel (Zie hieronder)
        in een absolute waarden met een ternaryoperator.
         */

        int x = -5;

        int absValue = (x<0)? -x: x;

        System.out.println(absValue);

        /*
        Opdracht 5 Rent a car.
    We gaan een auto huren voor onze vakantie.
    De manager van de autoverhuur zaak legt uit hoe hetmet de kosten en acties zit.
    per dag kost een auto € 40,
    -Als je de auto meer dan 7 dagen huurt krijg je € 50,
    - korting op het totaal bedrag.als je de auto 3 of meer dagen huurt krijg je een korting van € 20,
    - op de totaal prijs.
    Schrijf een applicatie om het totaal bedrag uit te rekenen voor de verschillende opties.
         */

        System.out.println("How many days do you want to rent a car for?");

        int d = myScanner.nextInt();
        int cost;

        if (3<=d&&d<7){
            cost = (d*40) - 20;
            System.out.printf("The price of renting a car for %d days: ", d);
            System.out.println(cost+" €");

        } else if (d>=7) {
            cost = (d*40) - 50;
            System.out.printf("The price of renting a car for %d days: ", d);
            System.out.println(cost+" €");

        }else{
            cost = d*40;
            System.out.printf("The price of renting a car for %d days: ", d);
            System.out.println(cost+" €");
        }

        /*
        Opdracht 4
        We gaan 1 week kamperen en in totaal mogen we maar 5 dagen vissen.
        Nu gaan we een overzicht maken (Zievoorbeeld hieronder) dat iedereen weet wanneer we gaan vissen.
        Schrijf een app om deze print out te krijgen.
        Je gebruikt bij deze opdracht een loop, if en keyword continue.
         */

        for (int day = 1; day<8; day++){

            if (day<6){
                System.out.println("Day "+day+": camping and fishing.");
            }else{
                System.out.println("Day "+day+": camping");
            }
            continue;
        }

        /* BONUS+Rock Paper Scissors+
        0 - rock
        2 - paper
        1 - scissors
                 */


        Scanner in = new Scanner(System.in);

        String user;
        String user_1;
        String stop = "stop";
        int aan_user = 0;
        int aan_comp = 0;

        System.out.println("Start game!");
        System.out.println("Rock, scissors, paper");

        do {
            user = in.nextLine();
            user_1 = user.toLowerCase(Locale.ROOT);

            int num = random.nextInt(3);

            if (num==0&&(user_1.equals("paper"))){
                System.out.println("Speler: PAPER, Computer: ROCK. You've won!");

                aan_user++;

            }else if (num==0&&(user_1.equals("scissors"))){
                System.out.println("Speler: SCISSORS, computer: ROCK. The computer won!");

                aan_comp++;

            }else if (num==0&&(user_1.equals("rock"))){
                System.out.println("Speler: ROCK, computer: ROCK. Draw!");

            }else if (num==2&&(user_1.equals("paper"))){
                System.out.println("Speler: PAPER, computer: PAPER. Draw!");

            } else if (num==2&&(user_1.equals("scissors"))) {
                System.out.println("Speler: SCISSORS, computer PAPER. You've won!");

                aan_user++;

            }else if (num==2&&(user_1.equals("rock"))){
                System.out.println("Speler: ROCK, computer: PAPER. The computer won!");

                aan_comp++;

            }else if (num==1&&(user_1.equals("scissors"))){
                System.out.println("Speler: SCISSORS, computer: SCISSORS. Draw!");

            } else if (num==1&&(user_1.equals("paper"))) {
                System.out.println("Speler: PAPER, computer: SCISSORS. The computer won!");

                aan_comp++;

            } else if (num==1&&(user_1.equals("rock"))) {
                System.out.println("Speler: ROCK, computer: SCISSORS. You've won!");

                aan_user++;
            }
        }while (!(user_1.equals(stop)));

        System.out.println("SPELER win(s): " + aan_user);
        System.out.println("COMPUTER win(s): " +aan_comp);

    }
}

