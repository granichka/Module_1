package local.nix.tasks.demo;


import local.nix.second.level.tasks.stringHandler.StringHandler;
import local.nix.second.level.tasks.treeNodeHandler.TreeNode;
import local.nix.second.level.tasks.treeNodeHandler.TreeNodeHandler;

import java.io.*;

public class SecondLevelTasksDemo {

    public static void main(String[] arr) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("1.Учитывая строку, содержащую символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.\n" +
                    "Входная строка действительна, если:\n" +
                    "Открытые скобки должны быть закрыты скобками того же типа.\n" +
                    "Открытые скобки должны быть закрыты в правильном порядке.\n" +
                    "Обратите внимание, что пустая строка также считается допустимой.\n" +
                    "2. По заданному бинарному дереву найдите его максимальную глубину. Максимальная глубина - это количество\n" +
                    "узлов вдоль самого длинного пути от корневого узла до самого дальнего конечного узла." +
                    "\n/**" +
                    " * Definition for a binary tree.txt node.\n" +
                    " * public class TreeNode {\n" +
                    " *     int val;\n" +
                    " *     TreeNode left;\n" +
                    " *     TreeNode right;\n" +
                    " *     TreeNode(int x) { val = x; }\n" +
                    " * }");

            System.out.println();
            System.out.println("Введите номер задачи из второго уровня");
            String numberOfTask = br.readLine();
            int task = Integer.parseInt(numberOfTask);

            if (task == 1) {

                System.out.println("Введите строку для проверки");
                String test = br.readLine();
                System.out.println("Результат");
                System.out.println(StringHandler.checkIfStringIsCorrect(test));

            } else if (task == 2) {

                System.out.println("Найдем максимальную глубину следующего дерева");

                try(BufferedReader br1 = new BufferedReader(new FileReader(new File("tasks-demo/src/main/resources/tree.txt")))) {

                    String line;
                    while((line = br1.readLine()) != null){
                        System.out.println(line);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                TreeNode tree = new TreeNode(5);
                TreeNode left1 = new TreeNode(3);
                TreeNode right1 = new TreeNode(4);
                tree.left = left1;
                tree.right = right1;
                TreeNode left11 = new TreeNode(7);
                TreeNode right11 = new TreeNode(9);
                left1.left = left11;
                left1.right = right11;
                TreeNode left12 = new TreeNode(7);
                TreeNode right12 = new TreeNode(9);
                right1.left = left12;
                right1.right = right12;
                TreeNode left111 = new TreeNode(7);
                TreeNode right111 = new TreeNode(9);
                right11.left = left111;
                right11.right = right111;

                System.out.println("Результат");
                System.out.println(TreeNodeHandler.getMaxDepthOfTreeNode(tree));

            } else {
                System.out.println("Задачи с таким номером нет");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
