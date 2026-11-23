class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        int resultado = 0;

        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        } else if ("".equals(operation)){
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if (!"+".equals(operation) && !"*".equals(operation) && !"/".equals(operation)) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        try {  

                switch (operation) {
            case "+":
                resultado = operand1 + operand2;
                operation = "+";
                break;
            case "*":
                resultado = operand1 * operand2;
                operation = "*";
                break;
            case "/":
                resultado = operand1 / operand2;
                        operation = "/";
                break;
                }
            } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e); 
        }
        
        return operand1 + " " + operation + " " + operand2 + " = " + resultado;
    }
}
