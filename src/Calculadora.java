public class Calculadora {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        System.out.println("Soma: " + somar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));
        System.out.println("Divisão: " + dividir(num1, num2));
        
        }
        public static int somar(int a, int b){
            return a + b;
        }
        public static int subtrair(int a, int b){
            return a - b;
        }
        public static int multiplicar(int a, int b){
            return a * b;
        }
        public static int dividir(int a, int b){         
            return (a / b);
        }
        
    }    