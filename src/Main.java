import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(" HW 17.10.22 Strings ");


        // Task1

        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = " Ivanov " + " Ivan " + " Ivanovich ";
        System.out.println(fullName);

           //Task 2
        //s = "abcd";
        //String s1 = s.toUpperCase();
        ///* s1 будет присвоена копия строки s, где все символы будут в верхнем
        //регистре, т. е. "ABCD" */

        fullName = " Ivanov Ivan Ivanovich ";
        fullName = fullName.toUpperCase();
        System.out.println( " Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // Task 3
        //String s2 = s.replace('a', 'b');
        ///* s2 получит строку s, где все символы 'a' (первый параметр)
        //будут заменены на 'b' (второй параметр), т. е. "bb c de" */

        String newFullName = " Иванов Семён Семёныч ";
        newFullName = newFullName.replace('ё', 'e');
        System.out.println(" Данные ФИО сотрудника —" + newFullName);


    }
}