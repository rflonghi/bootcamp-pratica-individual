package aula4;

public class Ex2_6 {

    public static class StringUtil {

        public static String rpad(String s, char c, int n) {
            String previous = s.substring(0, n);
            String after = s.substring(n);
            return previous + c + after;
        }

        public static String ltrim(String s) {
            return s.replaceAll("^\\s+", "");
        }

        public static String rtrim(String s) {
            return s.replaceAll("\\s+$", "");
        }

        public static String trim(String s) {
            return rtrim(ltrim(s));
        }

        public static int indexOfN(String s, char c, int n) {
            int found = 0;
            int position = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    found++;
                }
                if (found == n) {
                    position = i;
                    break;
                }
            }
            return position;
        }
    }
}
