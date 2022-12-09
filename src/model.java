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