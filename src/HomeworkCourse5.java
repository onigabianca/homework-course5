import java.util.Random;

public class HomeworkCourse5 {




    public static void main(String[] args) {





        int[] array = {1, 7, 0, 2, 3, 6};
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

        int suma = sumOfArray(array);
        System.out.println("Suma numerelor intregi este:");
        System.out.println(suma);

        int count = countImpar(array);
        System.out.println("Numarul de elemente impare:");
        System.out.println(count);

        System.out.println("Numerele mai mari sunt:");
        int[] newArrayy = biggerThen(array,4);
        System.out.println(newArrayy);


        System.out.println("Functie donatii:");
        functieDonatii();

        //System.out.println("Functie donatii nr max:");
       // functieDonatiiMaxim();





    }

    private static void functieDonatii() {
        Random random = new Random();
        int targetDonatii = 12;
        int countDonatii=0;

        do {
           int randomNumber = random.nextInt(0, targetDonatii);
            System.out.println("Random number is:");
            System.out.println(randomNumber);
            countDonatii = countDonatii + randomNumber;
            System.out.println("Donatii adunate:");
            System.out.println(countDonatii);
            if (countDonatii==targetDonatii){
                System.out.println("SUCCES");}
        }while (countDonatii<targetDonatii);



        }

    //trebuia cu do while si asta doar ca am ceva gresit la primul(depaseste donatiile si atunci nu am mai modificat aceasta)
    /*private static void functieDonatiiMaxim() {
        Random random = new Random();
        int intNumberDoi = 5;
        int numberOfD = 12;
        int k=0;
        int randomNumberDoi= random.nextInt(intNumberDoi);

        while((randomNumberDoi<=intNumberDoi) && (k<numberOfD)) {
            randomNumberDoi=random.nextInt();
            k++;

            if ((randomNumberDoi == intNumberDoi) || (k>numberOfD))
            {
                System.out.println("Campanie incheiata");}

        }
    }
*/
    private static int[] biggerThen(int[] array, int givenNumber) {

        int[] newArray=new int[array.length];
        for(int i=0;i<array.length;i++) {
            for (int j = newArray.length - 1; j > 0; j--)
                if (array[i] > givenNumber) {

                    newArray[j] = array[i];
                }
        }

        return newArray;


    }





    private static int countImpar(int[] array) {
        int countNumber=0;
        for(int number:array)
            if(number%2 == 1)
            {
                countNumber++;
            } return countNumber;
    }

    private static int sumOfArray(int[] array) {
        int sum=0;
        for(int number: array){
            sum=sum+number;
        }
        return sum;
    }


}


