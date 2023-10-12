package exercise;

// BEGIN
public class ReversedSequence implements CharSequence{
    private String line;

    public ReversedSequence(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        char[] arLine = line.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = arLine.length - 1; i >= 0; i--) {
            sb.append(arLine[i]);
        }
        line = sb.toString();
        return line;
    }

    @Override
    public int length() {
        return line.split("").length;
    }

    @Override
    public char charAt(int index) {
        char[] arLine = line.toCharArray();
        for(int i = 0; i < arLine.length; i++) {
            if (i == index) {
                return arLine[i];
            }
        }
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        char[] arLine = line.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(arLine[i]);
        }
        return sb.toString();
    }
}
// END
