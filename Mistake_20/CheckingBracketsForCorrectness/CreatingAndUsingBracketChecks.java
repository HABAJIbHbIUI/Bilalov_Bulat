package Homework_20.CheckingBracketsForCorrectness;

public class CreatingAndUsingBracketChecks {
    public static void main(String[] args) {

    }
}

class CheckTheBrackets {
    private String input;

    CheckTheBrackets(String in) {
        input = in;
    }

    public void check() {
        int SizeString = input.length();
        Stack stack1 = new Stack(SizeString);
        for (int i = 0; i < SizeString; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack1.push(ch);
                    break;
                case ')':
                case '}':
                case ']':
                    if (!stack1.isEmpty()) {
                        char chx = stack1.pop();
                        if (ch == '}' && chx == '{' || ch == ')' && chx == '(' || ch == ']' && chx == '[') {
                            System.out.println("An error occurred.");
                        }
                    }
                default:
                    break;
            }
        }
    }
}


