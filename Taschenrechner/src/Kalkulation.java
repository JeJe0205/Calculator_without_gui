public class Kalkulation {

    public Kalkulation() {
    }

    ;

    public double addiere(double zahl1, double zahl2) {
        double summe;
        summe = zahl1 + zahl2;
        return summe;
    }

    public double subtrahiere(double zahl1, double zahl2) {
        double differenz;
        differenz = zahl1 - zahl2;
        return differenz;
    }

    public double multipliziere(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public double dividiere(double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }

    public double wurzel(double zahl1) {
        return Math.sqrt(zahl1);
    }

    public double sinus(double x, int y) {
        double zahl1;
        double zaehler;
        double nenner;
        double exponent;
        int vorzeichen;

        zahl1 = 0;
        zaehler = x;
        nenner = 1;
        exponent = 1;
        vorzeichen = 1;


        while (y > 0) {
            zahl1 = zahl1 + (vorzeichen) * zaehler / nenner;

            zaehler = zaehler * x * x;
            vorzeichen = -vorzeichen;
            nenner = nenner * (exponent + 1) * (exponent + 2);
            exponent = exponent + 2;

            y = y - 1;

        }
        return zahl1;
    }

    public double fact(int n) {
        long fact = 1;

        while (n > 0) {
            fact = n * fact;
            n = n - 1;
        }
        return fact;
    }

    public double ggt(int zahl1, int zahl2) {
        int ggt = 0;
        do{
            int rest = zahl1 % zahl2;
            if(zahl2 > zahl1) {
                rest = zahl1;
            }
            if(rest == 0){
                ggt = zahl2;
                return ggt;
            }
            zahl1 = zahl2;
            zahl2 = rest;
        }while(zahl2 != ggt);
        return 0;
    }
    public double hoch(double a, double n){
        if(0 == n) { return 1; }
        double resultat = 1.0;
        while(n > 1) {
            if(gerade((int) n)) {
                a = a * a;
                n = n / 2;
            } else {
                resultat = resultat * a;
                a = a * a;
                n = (n-1) / 2;
            }
        }
        return resultat * a;
    }

    boolean gerade(int n) {
        return 0 == n % 2;

    }
}