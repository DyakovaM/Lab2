package LAB2;

import java.util.Random;
import java.util.Scanner;

public class Scholarship {
    public static void main(String args[]) {
        Scanner in = null;
        int[] arr;
        System.out.print("Введите кол-во человек ");
        int x = in.nextInt();
        arr = new int[x];
        int j;
        Student students;
        students = arr[j];
        for (int i = 0; i < x; i++) {
            System.out.print("Выберете должность: 1 - Студент, 2 - Аспирант ");
            int y = in.nextInt();
            if (y == 1) {
                System.out.print("Введите Фамилию: ");
                String a = in.next();
                System.out.print("Введите Фамилию: ");
                String b = in.next();
                System.out.print("Введите среднюю оценку: ");
                double c = in.nextInt();
                System.out.print("Введите номер группы: ");
                String d = in.next();
                Student = new Student(a, b, c, d);
                arr[j] = Student;
            }
            if (x == 2) {
                System.out.print("Введите Фамилию: ");
                String a = in.next();
                System.out.print("Введите Фамилию: ");
                String b = in.next();
                System.out.print("Введите среднюю оценку: ");
                double c = in.nextInt();
                System.out.print("Введите номер группы: ");
                String d = in.next();
                System.out.print("Введите название учебной работы: ");
                String e = in.next();
                new Aspirant(a, b, c, d, e);
                arr[j] = Aspirant;
                for (Student s : students) {
                    System.out.println(s.getScholarship());
                }
            }
        }
    }
}
