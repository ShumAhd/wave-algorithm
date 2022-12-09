import java.util.Random;

public class model {
    static int[][] map(int sizeY, int sizeX) {
        Random ra = new Random();
        int[][] map = new int[sizeY][sizeX];
        int randnum = 0;
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                randnum = ra.nextInt(-1, 6);
                if (i == 0 || i == sizeY - 1) {
                    map[i][j] = -1;
                } else if (j == 0 || j == sizeX - 1) {
                    map[i][j] = -1;
                } else if (randnum == -1) {
                    map[i][j] = randnum;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        return map;
    }
    static int[][] volnaLi(int[][] arr, int startX, int startY, int way) {
        if (arr[startX][startY] != -3) {
            if (arr[startX][startY] != -2)
                arr[startX][startY] = way;
            if (arr[startX][startY - 1] != -1 && arr[startX][startY - 1] == 0 || arr[startX][startY - 1] > way) {
                arr[startX][startY - 1] = way;
                volnaLi(arr, startX, startY - 1, way + 1);
            }
            if (arr[startX - 1][startY] != -1 && arr[startX - 1][startY] == 0 || arr[startX - 1][startY] > way) {
                arr[startX - 1][startY] = way;
                volnaLi(arr, startX - 1, startY, way + 1);
            }
            if (arr[startX][startY + 1] != -1 && arr[startX][startY + 1] == 0 || arr[startX][startY + 1] > way) {
                arr[startX][startY + 1] = way;
                volnaLi(arr, startX, startY + 1, way + 1);
            }
            if (arr[startX + 1][startY] != -1 && arr[startX + 1][startY] == 0 || arr[startX + 1][startY] > way) {
                arr[startX + 1][startY] = way;
                volnaLi(arr, startX + 1, startY, way + 1);
            }
            // }
        }
        return arr;
    }