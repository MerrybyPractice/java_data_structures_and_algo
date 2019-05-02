public class MultiBracketValidation {
    public boolean multiBracketValidation(String input) {
        char[] inputArray = input.toCharArray();

        int paren = 0;
        int square = 0;
        int curly = 0;

        boolean returnValue = true;

        for (char c : inputArray) {
            switch (c) {
                case '(':
                    paren++;
                    break;
                case ')':
                    paren--;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                default:
                    break;
            }

            if (paren < 0 || square < 0 || curly < 0) {
                returnValue = false;
            } else {
                returnValue = true;
            }
        }

        if (paren != 0) {
            returnValue = false;
        } else if (square != 0) {
            returnValue = false;
        } else if (curly != 0) {
            returnValue = false;
        }

        return returnValue;
    }
}
