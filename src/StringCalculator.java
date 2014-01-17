import static java.lang.Integer.parseInt;

public class StringCalculator {
    public int calculate(String s) {
        return sumTokens(getToken(s));
    }

    private int sumTokens(String[] tokens) {
        int acc = 0;
        for(String t : tokens) {
            acc += parseInt(t);
        }
        return acc;
    }

    private String[] getToken(String s) {
        if("".equals(s)) return new String[0];
        return s.split(",");
    }
}
