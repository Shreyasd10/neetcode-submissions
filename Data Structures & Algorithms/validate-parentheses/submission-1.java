class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if(!complement(c,pop)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean complement(char close, char open) {
        System.out.println(close);
        System.out.println(open);
        return switch (close) {
            case ')' -> open == '(';
            case ']' -> open == '[';
            case '}' -> open == '{';
            default -> false;
        };
    }
}
