package local.nix.tasks.demo;

import local.nix.first.level.tasks.arraysHandler.ArraysHandler;
import local.nix.first.level.tasks.horseStepChecker.Horse;
import local.nix.first.level.tasks.horseStepChecker.HorseStepChecker;
import local.nix.first.level.tasks.triangleHandler.Point;
import local.nix.first.level.tasks.triangleHandler.TriangleHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class FirstLevelTasksDemo {

    public static void main(String[] arr) {

        final Random random = new Random();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("1.Дан массив чисел. Вернуть число уникальных символов\n" +
                    "Пример: для 1 4 5 1 1 3 ответ 4.\n" +
                    "2.Ход коня по бесконечной шахматной доске. Вводится текущее положение коня\n" +
                    "и клетка в которую пробуют его передвинуть за 1 ход. Программа должна проверить,\n" +
                    "возможно ли это сделать.\n" +
                    "3.Даны точки A,B,C  на плоскости.  Вычислить площадь  треугольника ABC.");
            System.out.println();
            System.out.println("Введите номер задачи из первого уровня");
            String numberOfTask = br.readLine();
            int task = Integer.parseInt(numberOfTask);

            if(task == 1) {

                System.out.println("Введите размерность массива n");
                String size = br.readLine();
                int n = Integer.parseInt(size);
                Integer[] result = new Integer[n];

                System.out.println("Исходный массив:");
                for(int i = 0; i < n; i ++) {
                    result[i] = random.nextInt(11);
                    System.out.print(result[i] + " ");
                }

                System.out.println();
                System.out.println("Результат:");
                System.out.println(ArraysHandler.getAmountOfUniqueNumbers(result));

            } else if (task == 2) {

                System.out.println("Введите текущую координату х коня");
                String x1 = br.readLine();
                int currentX = Integer.parseInt(x1);
                System.out.println("Введите текущую координату y коня");
                String y1 = br.readLine();
                int currentY = Integer.parseInt(y1);
                Horse horse = new Horse(currentX, currentY);

                System.out.println("Введите новую координату х коня");
                String x2 = br.readLine();
                int newX = Integer.parseInt(x2);
                System.out.println("Введите новую координату y коня");
                String y2 = br.readLine();
                int newY = Integer.parseInt(y2);
                System.out.println("Результат");
                System.out.println(HorseStepChecker.checkHorseStep(horse.getX(), horse.getY(), newX, newY));
            } else if(task == 3) {

                System.out.println("Введите х первой точки");
                String firstX = br.readLine();
                int x1 = Integer.parseInt(firstX);
                System.out.println("Введите y первой точки");
                String firstY = br.readLine();
                int y1 = Integer.parseInt(firstY);
                Point point1 = new Point(x1, y1);
                System.out.println("Введите х второй точки");
                String secondX = br.readLine();
                int x2 = Integer.parseInt(secondX);
                System.out.println("Введите y второй точки");
                String secondY = br.readLine();
                int y2 = Integer.parseInt(secondY);
                Point point2 = new Point(x2, y2);
                System.out.println("Введите х третьей точки");
                String thirdX = br.readLine();
                int x3 = Integer.parseInt(thirdX);
                System.out.println("Введите y третьей точки");
                String thirdY = br.readLine();
                int y3 = Integer.parseInt(thirdY);
                Point point3 = new Point(x3, y3);

                System.out.println("Резульат");
                System.out.println(TriangleHandler.getSquareOfTriangleOnPoints(point1, point2, point3));


            } else {
                System.out.println("Задачи с таким номером нет");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
