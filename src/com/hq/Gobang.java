package com.hq;

import java.util.Scanner;

/**
 * 五子棋
 * Created by hq on 17/3/1.
 */
public class Gobang {
    public String [][] checker;
    public Boolean player;
    public int step;
    public static void main(String[] args) {
        Gobang gobang = new Gobang();
        gobang.init(8);
        gobang.order();
        while (true) {
            gobang.play();
        }
//        String str = "**++++++";
//        int index = str.indexOf("+++++");
//        System.out.println("index = " + index);
    }

    public void init(int step) {
        checker = new String[step][step];
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                checker[i][j] = ". ";
            }
        }
        this.step = step;
        drawChessboard(step);
    }

    public void drawChessboard(int step) {
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                System.out.print(checker[i][j]);
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input != null  && !"".equals(input) && input.matches("[0-9]+,[0-9]+")) {
            String[] place = input.split(",");
            int x = Integer.parseInt(place[0]);
            int y = Integer.parseInt(place[1]);
            if (!". ".equals(checker[x][y])) {
                System.out.println("此地方以落子, 请选择其他位置!");
            } else {
                if (player) {
                    checker[x][y] = "* ";
                } else {
                    checker[x][y] = "+ ";
                }
                drawChessboard(step);
                if (isSuccess(x, y)){
                    if (player) {
                        System.out.println("白方胜利!!!");
                    } else {
                        System.out.println("黑方胜利!!!");
                    }
                    System.exit(1);
                }
                player = !player;
            }
        } else {
            System.out.println("落子失败, 请输入正确的位置!");
        }

    }

    public void order() {
        System.out.println("Ready Go!!!");
        int or = (int)Math.random()*1999;
        if ((or % 2) == 0) {
            System.out.println("摇骰为偶白方执子!");
            player = true;
        } else {
            System.out.println("摇骰为奇黑方执子!");
            player = false;
        }
    }

    public boolean isSuccess(int x1, int y1) {
        String line = new String();
        int x = x1;
        int y = y1;
//        int count = 0;
        for (int count = 0; count < 4; count++) {
            switch (count) {
                case 0:
                    for (int i = 0; i < step; i++) {
                        line += checker[x][i];
                    }
                    break;
                case 1:
                    for (int i = 0; i < step; i++) {
                        line += checker[i][y];
                    }
                    break;
                case 2: {
                    while (x != step - 1 && y != 0) {
                        x++;
                        y--;
                    }
                    if (x == step - 1) {
                        for (int i = x; y < step; i--) {
                            line += checker[i][y++];
                        }
                    } else if (y == 0) {
                        for (int i = y; x > 0; i++) {
                            line += checker[x--][i];
                        }
                    }

                }
                break;
                case 3: {
                    while (x != 0 && y != 0) {
                        x--;
                        y--;
                    }
                    if (x == 0) {
                        for (int i = x; y < step; i++) {
                            line += checker[i][y++];
                        }
                    } else if (y == 0) {
                        for (int i = y; x < step; i++) {
                            line += checker[x++][i];
                        }
                    }
                    break;
                }
            }
            if ((line.indexOf("+ + + + +") >= 0) || (line.indexOf("* * * * *") >= 0)) {
                return true;
            } else {
                line = "";
            }
            x = x1;
            y = y1;
        }
            return false;
        }
}
