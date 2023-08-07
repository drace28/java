import java.util.Scanner;
public class weightedsubstring {
    public static void main(String[] args) {
        // weighted substring
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] w = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            w[i] = sc.nextInt();
        }
        int[] p = new int[s.length()];
        int mx = 0, id = 0, resLen = 0, resCenter = 0;
        for (int i = 1; i < s.length(); i++) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;
            while (i + p[i] < s.length() && i - p[i] >= 0 && s.charAt(i + p[i]) == s.charAt(i - p[i])) {
                p[i]++;
            }
            if (mx < i + p[i]) {
                mx = i + p[i];
                id = i;
            }
            if (resLen < p[i]) {
                resLen = p[i];
                resCenter = i;
            }
        }
        System.out.println(s.substring((resCenter - resLen) / 2, (resCenter - resLen) / 2 + resLen - 1));
        sc.close();
    }
}
