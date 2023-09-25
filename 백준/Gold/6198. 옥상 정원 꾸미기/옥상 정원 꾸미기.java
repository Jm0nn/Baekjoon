import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		long sum = 0;

		while (n-- > 0) {
			int k = Integer.parseInt(br.readLine());
			while (!stack.isEmpty() && stack.peek() <= k)
				stack.pop();

			sum += stack.size();
			stack.push(k);
		}

		System.out.println(sum);
	}

}