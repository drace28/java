import java.util.Scanner;
public class Mancheralgorithm {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "$#";
        for (int i = 0; i < s.length(); i++) {
            t += s.charAt(i);
            t += "#";
        }
        int[] p = new int[t.length()];
        int mx = 0, id = 0, resLen = 0, resCenter = 0;
        for (int i = 1; i < t.length(); i++) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;
            while (i + p[i] < t.length() && i - p[i] >= 0 && t.charAt(i + p[i]) == t.charAt(i - p[i])) {
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
