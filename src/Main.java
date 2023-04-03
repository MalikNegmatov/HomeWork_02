public class Main {
    public static void main(String[] args) {

        var taskCount = 0;
        var taskScreen = "Задача №";
        // ======= Begin Task 1 =========
        taskCount++;
        System.out.println(taskScreen + taskCount + ".1");

        var dog = 8.0;  // Вводим новую переменную присвоением значения 8.0;
        System.out.println("Our dog weighs " + dog + " kg."); // Выводим в консоли значение переменной dog.
        // Чтобы было не так скучно предположим, что в переменной хранится вес собаки.
        // Наша собака весит "dog" килограмм .

        var cat = 3.6;  // Вводим новую переменную cat присвоением значения 3.6;
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

        System.out.println("\n" + taskScreen + taskCount + ".2");

        //Вывод значений переменных подсвеченных синим цветом
        System.out.println("Our dog weighs " + coloredDog + " kg.");
        System.out.println("Our cat weighs " + coloredCat + " kg.");
        System.out.println("There is " + coloredPaper + " symbols in my paper");
// ======= End Task 1 =========

        var c0 = (char)27 + "[0m";
        var c1 = (char)27 + "[34m";
        var c2 = (char)27 + "[31m";

// ======= Begin Task 2 =======
        taskCount++;
        System.out.println("\n" + taskScreen + taskCount);

        // Прибавим к каждой переменной 4
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        // выведем в консоль значения переменных
        System.out.println("Our dog weighs " + c1 + dog + c0 + " kg.");
        System.out.println("Our dog weighs " + c1 + cat + c0 + " kg.");
        System.out.println("There is " + c1 + paper + c0 + " symbols in my paper");
// ======= End Task 2 =========

// ======= Begin Task 3 =======
        taskCount++;
        System.out.println("\n" + taskScreen + taskCount);

        // Вносим изменения в каждую переменную
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639; // I'm'sorry, но так привычнее

        // выведем в консоль значения переменных
        System.out.println("Our dog weighs " + c1 + dog + c0 + " kg.");
        System.out.println("Our dog weighs " + c1 + cat + c0 + " kg.");
        System.out.println("There is " + c1 + paper + c0 + " symbols in my paper");
// ======= End Task 3 =========

// ======= Begin Task 4 =======
        taskCount++;
        System.out.println("\n" + taskScreen + taskCount);

        var friend = 19; // Step 1
        System.out.println(friend);

        friend += 2; // Step 2
        System.out.println(c1 + friend + c0 );

        friend /= 7; // Step 3
        System.out.println(c2 + friend + c0 );
// ======= End Task 4 =========

// ======= Begin Task 5 =======
        taskCount++;
        System.out.println("\n" + taskScreen + taskCount);

        var frog = 3.5; // Step 1
        System.out.println(frog);

        frog *= 10; // Step 2
        System.out.println(c1 + frog + c0 );

        frog /= 3.5; // Step 3
        System.out.println(c2 + frog + c0 );

        frog += 4; // Step 4
        System.out.println(frog);
// ======= End Task 5 =========

// ======= Begin Task 6 =======
        taskCount++;
        System.out.println("\n" + taskScreen + taskCount);

        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера = " + c1 + firstBoxerWeight + c0 + " кг.");

        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера = " + c1 + secondBoxerWeight + c0 + " кг.");

        var weightDifference = (secondBoxerWeight - firstBoxerWeight);
        System.out.println("Разница в весе боксеров = " + c1 + weightDifference + c0 + " кг.");
// ======= End Task 6 =========

// ======= Begin Task 7 =======
        taskCount++;
        System.out.println("\n" + taskScreen + taskCount);

        var boxerOneWeight = 78.2;
        System.out.println("Вес первого боксера = " + c1 + boxerOneWeight + c0 + " кг.");

        var boxerTwoWeight = 82.7;
        System.out.println("Вес второго боксера = " + c1 + boxerTwoWeight + c0 + " кг.");

        weightDifference = (boxerTwoWeight - boxerOneWeight);
        System.out.println("1-й способ: Разница в весе боксеров = " + c1 + weightDifference + c0 + " кг.");

        weightDifference = (boxerTwoWeight % boxerOneWeight);
        System.out.println("2-й способ: Разница в весе боксеров = " + c1 + weightDifference + c0 + " кг.");
// ======= End Task 7 =========

// ======= Begin Task 8 =======
        taskCount++;
        System.out.println("\n" + taskScreen + taskCount + ".1");

        var totalManHour = 640;
        var oneEmployeeNorm = 8;
        var totalEmployee = totalManHour/oneEmployeeNorm;

        System.out.println("Всего работников в компании — " + c1 + totalEmployee + c0 + " человек.");

        System.out.println("\n" + taskScreen + taskCount + ".1");

        totalEmployee += 94;
        var manHour = totalManHour/totalEmployee;
        var s1 = "Если в компании работает ";
        var s2 = " человек, то всего ";
        var s3 = " часа работы может быть поделено между сотрудниками.";
        System.out.println(s1 + c1 + totalEmployee + c0 + s2 + c1 + manHour + c0 + s3);
// ======= End Task 8 =========
    }
}