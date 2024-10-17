package app;

public class Corrector {

    public static final String ANSI_ORANGE = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public String handleData(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            count++;
            if (str.equals("orange")) {
                sb.append(ANSI_BLUE+count+ANSI_RESET).append(")").append(ANSI_ORANGE).append(str).append(ANSI_RESET).append("\n");
            } else {
                sb.append(ANSI_BLUE+count+ANSI_RESET).append(")").append(str).append("\n");
            }
        }
        return sb.toString();
    }
}
