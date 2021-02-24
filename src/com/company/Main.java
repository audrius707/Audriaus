package com.company;

public class Main {

    public static void main(String[] args) {
        Adresas adresas = new Adresas();
        System.out.println(gautiMiestoPavadinima(adresas));
        Adresas adresas1  =new Adresas(new Miestas("Kaunas"));
        System.out.println(gautiMiestoPavadinima(adresas1));

    }


        public static String gautiMiestoPavadinima(Adresas adresas) {
            if (adresas != null) {
                Miestas miestas = adresas.getMiestas();
                if (miestas != null) {
                    return miestas.getPavadinimas();
                }
            }
            return null;
        }

}