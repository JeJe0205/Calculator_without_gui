public class Rechner {



    /**
     * constructor: initialize attributes
     * @autor Jenith Jeyaranjan
     */
    public Rechner() {

    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Rechner program = new Rechner();
        program.run();

    }

    /**
     * description
     */
    private void run() {


        Einleser einleser = new Einleser();
        Kalkulation calc = new Kalkulation();
        char auswahl = ' ';
        System.out.println("Wilkommen zum Taschenrechner :)");
        while(auswahl!= 'x') {


            System.out.println("Drücken sie die Zeichen: \n + zu addieren \n - zu subtrahieren  \n * zu multiplizieren \n / zu dividieren \n w zu wurzelziehen \n c zu sinus berechnen \n ! zu Fakultatieren \n g zu GGT berechnen \n h zu Hochrechnen  \n x zu beenden");
            auswahl = einleser.readChar();

            if (auswahl == '+') {
                double zahl1, zahl2;
                System.out.println("Sie haben die addition gewählt");
                System.out.println("Bitte die erste Zahl eingeben");
                zahl1 = einleser.readDouble();
                System.out.println("Bitte die zweite Zahl eingeben");
                zahl2 = einleser.readDouble();
                double resultat = calc.addiere(zahl1, zahl2);
                System.out.println("Das Resultat der Addition ist: " + resultat);

            } else if (auswahl == '-') {
                double zahl1, zahl2;
                System.out.println("Sie haben die subtrakton gewählt");
                System.out.println("Bitte die erste Zahl eingeben");
                zahl1 = einleser.readDouble();
                System.out.println("Bitte die zweite Zahl eingeben");
                zahl2 = einleser.readDouble();
                double resultat = calc.subtrahiere(zahl1, zahl2);
                System.out.println("Das Resultat der subtraktion ist: " + resultat);
            } else if (auswahl == '*') {
                double zahl1, zahl2;
                System.out.println("Sie haben die multiplikation gewählt");
                System.out.println("Bitte die erste Zahl eingeben");
                zahl1 = einleser.readDouble();
                System.out.println("Bitte die zweite Zahl eingeben");
                zahl2 = einleser.readDouble();
                double resultat = calc.multipliziere(zahl1, zahl2);
                System.out.println("Das Resultat der multiplikation ist: " + resultat);
            } else if (auswahl == '/') {
                double zahl1, zahl2;
                System.out.println("Sie haben die division gewählt");
                System.out.println("Bitte die erste Zahl eingeben");
                zahl1 = einleser.readDouble();
                System.out.println("Bitte die zweite Zahl eingeben");
                zahl2 = einleser.readDouble();
                double resultat = calc.dividiere(zahl1, zahl2);
                System.out.println("Das Resultat der Division ist: " + resultat);
            } else if (auswahl == 'w') {
                double zahl1, zahl2;
                System.out.println("Sie haben die Wurzel gewählt");
                System.out.println("Bitte die erste Zahl eingeben");
                zahl1 = einleser.readDouble();
                System.out.println("Bitte die Wurzel eingeben");
                zahl2 = einleser.readDouble();
                double resultat = calc.wurzel(zahl1);
                System.out.println("Das Resultat der wurzel ist: " + resultat);
            }
            else if (auswahl == 'c'){
                double zahl1;
                System.out.println("Sie haben die Funktion Sinus gewählt");
                System.out.println("Bitte die Zahl eingeben ");
                zahl1 = einleser.readDouble();
                double resultat = calc.sinus(zahl1,6);
                System.out.println("Resultat: " + resultat);

            }
            else if (auswahl == '!'){
                int zahl1;
                System.out.println("Sie haben die Funktion Falkultat gewählt");
                System.out.println("Bitte die Zahl eingeben");
                zahl1 = einleser.readInt();
                double resultat = calc.fact(zahl1);
                System.out.println("Resultat: " + resultat);

            }
            else if (auswahl == 'g'){
                int zahl1,zahl2;
                System.out.println("Sie haben die Funktion GGT gewählt");
                System.out.println("Bitte die erste Zahl eingeben");
                zahl1 = einleser.readInt();
                System.out.println("Bitte die zweite Zahl eingeben");
                zahl2 = einleser.readInt();
                int resultat = (int) calc.ggt(zahl1, zahl2);
                System.out.println("Resultat :" +resultat);

            }
            else if(auswahl == 'h'){
                double zahl1,zahl2;
                System.out.println("Sie haben die Funktion Hochrechnen gewählt");
                System.out.println("Bitte die Zahl eingenben eingeben");
                zahl1 = einleser.readDouble();
                System.out.println("Bitte den Exponent  eingeben");
                zahl2 = einleser.readDouble();
                double resultat = calc.hoch(zahl1,zahl2);
                System.out.println("Resultat :" + resultat);


            }

        }
        System.out.println("Danke das sie sich Zeit genommen haben, Auf Wiedersehen User :)");
        System.out.println("Danke das sie sich Zeit genommen haben den Programm zu Testen");
    }
}