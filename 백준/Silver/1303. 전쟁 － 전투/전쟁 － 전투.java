import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int N;
    static int M;

    static int temp;
    static int countW = 0;
    static int countB = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new String[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = String.valueOf(str.charAt(j));
            }
        }

        // 탐색시작
        for (int i = 0; i < M; i++) {
            for (int j = 0; j <N; j++) {
                if (visited[i][j] == false) {
                    String color = map[i][j];
                    temp = 0;
                    dfs(i, j ,color);

                    if (color.equals("W")) {
                        countW += temp * temp;
                    } else {
                        countB += temp * temp;
                    }
                }
            }
        }

        System.out.println(countW + " " + countB);

    }

    static void dfs(int x, int y, String color) {
        visited[x][y] = true;
        temp += 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N
                    && visited[nx][ny] == false && map[nx][ny].equals(color)) {
                dfs(nx, ny, map[nx][ny]);
            }
        }
    }
}
