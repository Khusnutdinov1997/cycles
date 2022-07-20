public class Main {

    //Задание1
    public static void main(String[] args) {
         int i = 0;
         while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
         System.out.println("");
         for (; i>0; i--){
             System.out.print(i + " ");
        }
        System.out.println(" ");

    // Задание 2
        int friday = 1;
         for (; friday < 31; friday += 7){
              System.out.println("Сегодня пятница " + friday + " - e число. Неоюходимо подгоьовить отчет.");
         }

         //Задание 3
         int currentYear = 2022;
         int start = currentYear - 200;
         int end = currentYear + 100;
         // как можно сделать чтобы шаг увеличивался не на 1, а на 79?
         for (int x = start; x <= end; x++) {
             if ( x % 79 == 0){
                 System.out.println(x);
         }}
    }
}