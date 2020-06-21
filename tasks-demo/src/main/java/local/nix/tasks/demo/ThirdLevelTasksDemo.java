package local.nix.tasks.demo;

import local.nix.third.level.tasks.lifePlay.LifePlay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ThirdLevelTasksDemo {

    public static void main(String[] arr) {

        final Random random = new Random();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите колличество строк m");
            String rows = br.readLine();
            int m = Integer.parseInt(rows);
            System.out.println("Введите колличество столбцов n");
            String columns = br.readLine();
            int n = Integer.parseInt(columns);

            int[][] desk = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < desk[i].length; j++) {
                    desk[i][j] = random.nextInt(2);
                }
            }

            System.out.println("Начальное состояние:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(desk[i][j] + " ");
                }
                System.out.println();
            }

            int[][] result = LifePlay.play(desk);
            System.out.println("Обновление:");
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

