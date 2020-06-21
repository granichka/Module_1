package local.nix.third.level.tasks.lifePlay;

public class LifePlay {

    public  static int[][] defineSurrounding(int[][] board, int i, int j) {


        if(i == 0) {

            if(j == 0) {

                int[][] surrounding = {{i    , j + 1},
                        {i    , j + 2},
                        {i + 1, j    },
                        {i + 1, j + 1},
                        {i + 1, j + 2},
                        {i + 2, j    },
                        {i + 2, j + 1},
                        {i + 2, j + 2}};
                return surrounding;

            } else if (j == board[0].length-1) {

                int[][] surrounding1 = {{i    , j - 2},
                        {i    , j - 1},
                        {i + 1, j - 2},
                        {i + 1, j - 1},
                        {i + 1, j    },
                        {i + 2, j - 2},
                        {i + 2, j - 1},
                        {i + 2, j    }};
                return surrounding1;

            } else {

                int[][] surrounding2 = {{i    , j - 1},
                        {i    , j + 1},
                        {i + 1, j - 1},
                        {i + 1, j    },
                        {i + 1, j + 1},
                        {i + 2, j - 1},
                        {i + 2, j    },
                        {i + 2, j + 2}};
                return surrounding2;
            }

        } else if(i == board.length-1) {

            if(j == 0) {

                int[][] surrounding = {{i - 2, j    },
                        {i - 2, j + 1},
                        {i - 2, j + 2},
                        {i - 1, j    },
                        {i - 1, j + 1},
                        {i - 1, j + 2},
                        {i    , j + 1},
                        {i    , j + 2}};
                return surrounding;

            } else if (j == board[0].length-1) {

                int[][] surrounding1 = {{i - 2, j - 2},
                        {i - 2, j - 1},
                        {i - 1, j    },
                        {i - 1, j - 2},
                        {i - 1, j - 1},
                        {i - 1, j    },
                        {i    , j - 2},
                        {i    , j - 1}};
                return surrounding1;

            } else {

                int[][] surrounding2 = {{i - 2, j - 1},
                        {i - 2, j    },
                        {i - 2, j + 1},
                        {i - 1, j - 1},
                        {i - 1, j    },
                        {i - 1, j + 1},
                        {i    , j - 1},
                        {i    , j + 1}};
                return surrounding2;
            }

        } else {

            if(j == 0) {

                int[][] surrounding = {{i - 1, j    },
                        {i - 1, j + 1},
                        {i - 1, j + 2},
                        {i    , j + 1},
                        {i    , j + 2},
                        {i + 1, j    },
                        {i + 1, j + 1},
                        {i + 1, j + 2}};
                return surrounding;

            } else if (j == board[0].length-1) {

                int[][] surrounding1 = {{i - 1, j - 2},
                        {i - 1, j - 1},
                        {i - 1, j    },
                        {i    , j - 2},
                        {i    , j - 1},
                        {i + 1, j - 2},
                        {i + 1, j - 1},
                        {i + 1, j    }};
                return surrounding1;

            } else {

                int[][] surrounding2 = {{i - 1, j - 1},
                        {i - 1, j    },
                        {i - 1, j + 1},
                        {i    , j - 1},
                        {i    , j + 1},
                        {i + 1, j - 1},
                        {i + 1, j    },
                        {i + 1, j + 1}};
                return surrounding2;
            }
        }
    }


    public  static int countSurrounding(int[][] board, int i, int j) {

        int count = 0;
        int[][] surrounding = defineSurrounding(board, i, j);

        for (int subArray[]: surrounding) {
            try {
                if (board[subArray[0]][subArray[1]] == 1) {
                    count++;
                }
            }
            catch (ArrayIndexOutOfBoundsException e) { };
        }
        return count;
    }

    public static int[][] play(int[][]arr) {

        int[][] newArr = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                int status = arr[i][j];
                int countOfCurrentCell = countSurrounding(arr, i, j);
                newArr[i][j] = checkTheRules(status, countOfCurrentCell);

            }

        }

        return newArr;

    }

    public static  int  checkTheRules(int status, int countOfCurrentCell) {

        if(status == 0 && countOfCurrentCell == 3) {
            return 1;
        } else if ((status == 1 && countOfCurrentCell == 2) || (status == 1 && countOfCurrentCell == 3)) {
            return 1;
        } else {
            return 0;
        }
    }

}
