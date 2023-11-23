    package scdlab5;    
    public class q4 {
        public static <T extends Number> double add(T num1, T num2) {
            return num1.doubleValue() + num2.doubleValue();
        }

        public static <T extends Number> double subtract(T num1, T num2) {
            return num1.doubleValue() - num2.doubleValue();
        }

        public static <T extends Number> double multiply(T num1, T num2) {
            return num1.doubleValue() * num2.doubleValue();
        }

        public static <T extends Number> double divide(T num1, T num2) {
            if (num2.doubleValue() == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return num1.doubleValue() / num2.doubleValue();
        }

        public static void main(String[] args) {
            int intNum1 = 10;
            int intNum2 = 5;
            double doubleNum1 = 20.5;
            double doubleNum2 = 2.0;

            System.out.println("Integer Addition: " + add(intNum1, intNum2));

            System.out.println("Double Subtraction: " + subtract(doubleNum1, doubleNum2));

            System.out.println("Mixed Data Types (Multiplication): " + multiply(intNum1, doubleNum2));

            try {
                System.out.println("Division: " + divide(intNum1, 0));
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
