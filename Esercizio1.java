public class Esercizio1 {
    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concatena(String testo,int numero){
        return testo + numero;
    }
     public static String[] inserisciInArray(String[] array, String nuovaStringa) {


         String[] nuovoArray = new String[6];


         nuovoArray[0] = array[0];
         nuovoArray[1] = array[1];

         nuovoArray[2] = nuovaStringa;


         nuovoArray[3] = array[2];
         nuovoArray[4] = array[3];

         nuovoArray[5] = array[4];

         return nuovoArray;
     }




        public static void main(String[] args) {


        int prodotto = moltiplica(5,6);

        System.out.println( "Il prodotto è "+ prodotto);

        String concatenazione = concatena("Il numero è",33);
            System.out.println(concatenazione);

            String[] arrayOriginale = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
            String nuovaStringa = "Nuovo";

            String[] nuovoArray = inserisciInArray(arrayOriginale, nuovaStringa);


            System.out.print("Nuovo array: ");
            for (String elemento : nuovoArray) {
                System.out.print(elemento + " ");

            }


}}
