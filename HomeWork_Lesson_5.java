public class HomeWork_Lesson_5 {
    public static void main(String[] args) {

        //Програма Distance, която изчислява растроянието от точка (x,y) до (0,0) по ф-лата
        // result = sqrt(x2 + y2)
        //Метод 1 - общо изчисляване
        System.out.println("Задача 1 - Изчисляване по формула");
        System.out.println("=>=>=> Метод 1 - на един ред");

        int x = 2;
        int y = 4;

        double result = Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));

        System.out.println("разстоянието от точка (x,y) до (0,0) е :" + result);


        //Метод 2 - изчисляване на части със символни нозове
        System.out.println("\n=>=>=> Метод 2 - чрез символни низове:");
        x *= x;
        y *= y;

        int sbor = x+y;
        double sqRt = Math.sqrt(sbor);

        System.out.println("разстоянието от точка (x,y) до (0,0) по втория метод е :" + sqRt);


        //Задача 2 - сравняване на променливи
        System.out.println("\n\nЗадача 2 - сравняване на променливи:");
        System.out.println("=>=>=> Метод 1");

        //тъй като нямам представа как се представят дати в Java, а като число ден и число дата,
        // немога да си представя как бих ги сравнявал въобше в период от други две двойки дати,
        // реших за улеснение или не, да конвертирам, т.е да представя датите като числа

        int myDate = 44646; //това е числото което отговаря на дата 26.03.2022
        int varDate1 = 44640; //това е число което отговаря за първия период от 20.03.2022
        int varDate2 = 44732; //това е число което отговаря за втория период до 20.06.2022

        boolean prov1 = myDate >= varDate1; //true
        boolean prov2 = myDate <= varDate2; // true
        boolean period = prov1 && prov2; //true x&&y

        System.out.println("Моята дата е 26.03.2022");
        System.out.println("моята дата: >= ли е, т.е намира ли се след 20.03:  " + prov1);
        System.out.println("моята дата <= ли е, т.е намира ли се преди 20.06:  " + prov2);
        System.out.println("т.е в периода ли е между 20.03 и 20.06:  " + period);


        //Метод 2 - с логически оператор на един ред x && y, true && true = true
        System.out.println("\n=>=>=> Метод 2 - с логически оператор през boolean на един ред x && y, true && true = true");
        boolean prov3 = myDate >= varDate1 && myDate <= varDate2;
        System.out.println("--> в периода ли е между 20.03 и 20.06:  " + prov3);


        //Метод 3 - директно в конзолата през sout, сравняване на int-овете един ред
        System.out.println("\n=>=>=> Метод 3 - директно в конзолата през sout, сравняване на int-овете един ред");
        System.out.println("Датата ми намира ли се между периода ?: "
                + ((myDate >= varDate1 && myDate <= varDate2)? "ДА" : "НЕ"));


        //Метод 4 - директно сравняване на int-овете един ред
        System.out.println("\n=>=>=> Метод 4 - директно сравняване на int-овете един ред");
        System.out.println("Отговори ми: Датата ми намира ли се между зададения период");
        System.out.println("\t\t" + ((myDate >= varDate1 && myDate <= varDate2)?
                "===> Да в периода е" : "===> Не, не е в периода"));


        //Задача 3 - Индекс на телесна маса BMI
        // BMI = W / h²
        // W = Тегло в кг., пр. 82кг.
        // h = Височина в метри, пр. 1.75 метра

        System.out.println("\n\nЗадача 3 - ИТМ");

        double W = 82; //Въведи колограми
        double h = 1.78; //Въведи височина
        h *= h; //h²

        double BMI = W/h;
        long roundBMI = (long)BMI; //Кастваме към long за получаване на цяло число, тъй като не ми трябва с плаваща запетая

        System.out.println("=> Вашето тегло е: " + W);
        System.out.println("=> Вашета височина е: " + Math.sqrt(h));
        System.out.println("=> Индекда ви на телесна маса е: " + roundBMI);

        int low = 18; //нисък до <18
        int norm = 25; //нормален >=18 <25
        int high = 29; //наднормен >=25 <29 и //висок >=29

        System.out.print(roundBMI < 18 ? "\t=>=>=> !!! Нисък, яж повече!" : "");
        System.out.print(roundBMI >= low && roundBMI < norm ? "\t=>=>=> !!! Нормален, супер си!" : "");
        System.out.print(roundBMI >= norm && roundBMI < high ? "\t=>=>=> !!! Наднормен, трябва да отслабнеш" : "");
        System.out.print(roundBMI >= high ? "\t=>=>=> !!! Висок, за диета си," : "");

        char endGame = '\u2705';
        char endGame2 = '\u27AA';
        System.out.println("\n\n\n" + endGame2 + endGame2 + endGame2);
        System.out.println("" + endGame + endGame + endGame + "\tКРАЙ НА ДОМАШНОТО\t" + endGame + endGame + endGame);

    }
}

