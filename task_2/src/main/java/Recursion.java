public class Recursion {
    private static final String alphabet = "aeiouyAEIOUY";

    public static String interviewRecursionTest(String line) {
        if (line.length() == 1) {
            return line;
        }
        boolean bool = alphabet.indexOf(line.substring(0, line.length()/2).charAt(line.length()/2-1)) != -1 || alphabet.indexOf(line.substring(line.length()/2).charAt(0)) != -1;

        if (bool) {
            return interviewRecursionTest(line.substring(0, line.length()/2)) + "*" + interviewRecursionTest(line.substring(line.length()/2));
        }
        else
            return interviewRecursionTest(line.substring(0, line.length()/2)) + "" + interviewRecursionTest(line.substring(line.length()/2));
    }

    public static String interviewRecursionTest2(String line) {
        if (line.length() == 1) {
            if (alphabet.contains(line))
                return "*" + line + "*";
            else
                return line;
        }
        else {
            return (interviewRecursionTest2(line.substring(0, line.length()/2)) + interviewRecursionTest2(line.substring(line.length()/2))).replace("**", "*");
        }
    }


}
