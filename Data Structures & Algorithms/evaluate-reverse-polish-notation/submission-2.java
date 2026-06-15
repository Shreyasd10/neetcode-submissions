class Solution {
    public int evalRPN(String[] tokens) {
        int result = 1;
        Stack<String> stack = new Stack<>();
        for(String s : tokens){
           if(!isOperator(s)){
               stack.push(s);
           }else{
               String firstNumber = stack.pop();
               String secondNumber = stack.pop();
               result = calculate(Integer.parseInt(secondNumber),Integer.parseInt(firstNumber),s);
               stack.push(String.valueOf(result));
           }
        }
        return Integer.parseInt(stack.pop());
    }

    private int calculate(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    private boolean isOperator(String token){
        return switch (token) {
            case "+" -> true;
            case "-" -> true;
            case "*" -> true;
            case "/" -> true;
            default -> false;
        };
    }
}
