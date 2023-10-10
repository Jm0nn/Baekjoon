import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		boolean[] visit = new boolean[100001];
		Queue<int[]> queue = new ArrayDeque<>();

		visit[n] = true;
		queue.offer(new int[] { n, 0 });

		int ans = 0;
		int cnt = 0;

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int move = cur[1];

			visit[x] = true;

			if (cnt > 0 && ans < move)
				break;

			if (x == k) {
				ans = move;
				++cnt;
			}

			for (int i = 0; i < 3; ++i) {
				int nx = x;

				switch (i) {
				case 0:
					nx *= 2;
					break;

				case 1:
					nx -= 1;
					break;

				case 2:
					nx += 1;
					break;
				}

				if (0 > nx || nx > 100000 || visit[nx])
					continue;

				queue.offer(new int[] { nx, move + 1 });
			}
		}

		System.out.println(ans);
		System.out.println(cnt);
	}

}