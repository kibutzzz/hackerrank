package challenges.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SimpleTextEditor {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        int numberOfActions = Integer.parseInt(next());
        String s = "";
        String[] stack = new String[numberOfActions];
        int stackTop = 0;
        for (int i = 0; i < numberOfActions; i++) {
            int nextAction = Integer.parseInt(next());
            if (nextAction == 1) {
                stack[stackTop++] = s;
                s += next();
            } else if (nextAction == 2) {
                stack[stackTop++] = s;
                s = new String(s.toCharArray(), 0, s.length() - Integer.parseInt(next()));
            } else if (nextAction == 3) {
                System.out.println(s.charAt(Integer.parseInt(next()) - 1));
            } else if (nextAction == 4) {
                s = stack[--stackTop];
            }
        }
    }

}

