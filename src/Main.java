public class Main {
    public static void main(String[] args) {

        // ======= Begin Task 1 =========
        var dog = 8.0;  // Вводим новую переменную из кольца действительных чисел dog.
                        // Тип переменной dog задан присвоением значения 8.0.

        System.out.println("Our dog weighs " + dog + " kg."); // Выводим в консоли значение переменной dog.
        // Чтобы было не так скучно предположим, что в переменной хранится вес собаки.
        // Наша собака весит "dog" килограмм .

        var cat = 3.6;  // Вводим новую переменную cat c присвоением значения 3.6;

        System.out.println("Our cat weighs " + cat + " kg."); // Выводим в консоли значение переменной cat.
        // В том же формате: Наш кот весит "cat" килограмм.

        var paper = 7639;  // Вводим новую переменную c присвоением значения 7639;

        System.out.println("There is " + paper + " symbols in my paper"); // Выводим в консоли значение переменной paper.
        // В моей статье содержится "paper" символов.

        //Введем новые переменные типа String, которым присвоим значение переменных синим цветом
        String coloredDog = (char)27 + "[34m" + dog + (char)27 + "[0m";
        // В новой перменной типа String (строка ) вносим значение переменной dog синим цветом
        // изменили цвет вывода на синий "(char)27 + "[34m" и вернули цвет по умолчанию (char)27 + "[0m"
        String coloredCat = (char)27 + "[34m" + cat + (char)27 + "[0m"; // То же самое для cat
        String coloredPaper = (char)27 + "[34m" + paper + (char)27 + "[0m"; // То же самое для paper

        //Вывод значений переменных подсвеченных синим цветом
        System.out.println("\n" + "Our dog weighs " + coloredDog + " kg.");
        System.out.println("Our cat weighs " + coloredCat + " kg.");
        System.out.println("There is " + coloredPaper + " symbols in my paper");
        // ======= End Task 1 =========

        var c0 = (char)27 + "[0m";
        var c1 = (char)27 + "[34m";
        var c2 = (char)27 + "[35m";

        // ======= Begin Task 2 =======

        // Прибавим к каждой переменной 4
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        // выведем в консоль значения переменных
        System.out.println("\n" + "Our dog weighs " + c1 + dog + c0 + " kg.");
        System.out.println("Our dog weighs " + c1 + cat + c0 + " kg.");
        System.out.println("There is " + c1 + paper + c0 + " symbols in my paper");

        // ======= End Task 2 =========

        // ======= Begin Task 3 =======

        // Вносим изменения в каждую переменную
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639; // I'm'sorry, но так привычнее

        // выведем в консоль значения переменных
        System.out.println("\n" + "Our dog weighs " + c1 + dog + c0 + " kg.");
        System.out.println("Our dog weighs " + c1 + cat + c0 + " kg.");
        System.out.println("There is " + c1 + paper + c0 + " symbols in my paper");

        // ======= End Task 3 =========

        // ======= Begin Task 4 =======

        var friend = 19; // Step 1
        System.out.println("\n" + friend);

        friend += 2; // Step 2
        System.out.println(c1 + friend + c0 );

        friend /= 7; // Step 3
        System.out.println(c2 + friend + c0 );

        // ======= End Task 4 =========
    }
}