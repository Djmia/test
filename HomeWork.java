public class HomeWork {
    public static void main(String[] args) {
        //ЗАДАЧА - 1
        // Напишете програма, която отпечатва боят на буквите на първото ви име,
        // след това го отпечатайте веднъж само с главни букви,
        // и веднъж само с малки.

        System.out.println("\nЗАДАЧА - 1, \nа)Брой букви в името");
        String myName = "Милен";
        System.out.println("Резултат:" +"\t" + myName.length());

        // след това го отпечатайте веднъж само с главни букви,
        System.out.println("\nб)името с главни букви");
        System.out.println("Резултат:" + "\t" + myName.toUpperCase());

        // и веднъж само с малки.
        System.out.println("\nв)името с малки букви");
        System.out.println("Резултат:" + "\t" + myName.toLowerCase());

        //ЗАДАЧА - 2
        //Напишете програма, която да събира две числа и да отпечатва резултата в конзолата.
        System.out.println("\nЗАДАЧА - 2, \nа)Събиране на 2 числа с малко помощ от интернет :)");
        int a = 23;
        int b = 35;
        int sum = a + b;
        System.out.println("Резултата е = " + sum);

        System.out.println("\nб)Без интернет бих го написал така...System.out.println(23+35);");
        System.out.println(23+35);

        //ЗАДАЧА 3
        // Напишете програма, която да показва абсолютната стойност на числата: -147, 15, 0, 18,
        // резултата да се отпечатват на един и съши ред, с разделение табулация.
        System.out.println("\nЗАДАЧА 3 - абсолютна ст-ст, печат с табулация");

        System.out.print(Math.abs(-147)+"\t");
        System.out.print(Math.abs(15)+"\t");
        System.out.print(Math.abs(0)+"\t");
        System.out.print(Math.abs(18));


        //ЗАДАЧА 4
        //Напишете програма, която изчислява корен квадратен на числата: 8, 353, 78, 3, -67, 723, 2000, -100,
        //резултатите да се отпечатват на един и същи ред.
        System.out.println("\n\nЗАДАЧА 4 - коренквадратен");
        System.out.print(Math.sqrt(8) + "\t");
        System.out.print(Math.sqrt(353) + "\t");
        System.out.print(Math.sqrt(78) + "\t");
        System.out.print(Math.sqrt(3) + "\t");
        System.out.print(Math.sqrt(-67) + "\t");
        System.out.print(Math.sqrt(723) + "\t");
        System.out.print(Math.sqrt(2000) + "\t");
        System.out.print(Math.sqrt(-100));

        //Отрицателно число не може да се коренува,
        //затова го правя в абсолщтна стойност и тогава го коренувам
        //Тук просто експериментирам с един клас Math но с два метода в един ред. Мисля че се получи.
        int c = -67;
        int d = -100;
        System.out.print("\n" + Math.sqrt(Math.abs(c))+"\t");
        System.out.print(Math.sqrt(Math.abs(d)));


        //ЗАДАЧА 5
        //Напишете програма, която повдига на степен 2-ра числата: -20, 92, 638, 73, 200, -22,
        //резултатите да се отпечатват на един и същи ред.
        System.out.println("\n\nЗАДАЧА 5 - степенуване");
        int aa = -20;
        int bb = 92;
        int cc = 638;
        int dd = 73;
        int ee = 200;
        int ff = -22;
        System.out.print(Math.pow(aa,2) + "\t");
        System.out.print(Math.pow(bb,2) + "\t");
        System.out.print(Math.pow(cc,2) + "\t");
        System.out.print(Math.pow(dd,2) + "\t");
        System.out.print(Math.pow(ee,2) + "\t");
        System.out.print(Math.pow(ff,2));


        System.out.println("\n\n\nКРАЙ НА ДОМАШНОТО");

    }

}
