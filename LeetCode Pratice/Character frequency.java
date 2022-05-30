/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        while (q-- > 0) {
            int pos = sc.nextInt();
            int count = 0;
            String s1 = str.substring(0, pos - 1);
            String s = Character.toString(str.charAt(pos - 1));
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(s1);
            while (m.find()) {
                count++;
            }
            System.out.println(count);
        }
    }
}
