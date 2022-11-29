import java.util.*;

public class Main {
    static int N;                   // 지도의 크기
    static int[][] map;             // 지도배열 선언
    static boolean[][] visited;     // 지도 방문여부 배열
    // 상 우 하 좌
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int count = 0;

    public static void main(String[] args) {
        // 문제 조건 입력부분 시작
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        // 끝

        // 단지번호찾기 시작
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 집이 있으면서(1) && 방문하지 않은 곳
                if(map[i][j] == 1 && visited[i][j] == false) {
                    count = 0;
                    dfs(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for (int i : answer) {
            System.out.println(i);
        }
    }

    static void dfs(int x, int y) {
        count++;
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N
            && visited[nx][ny] == false && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
