package aula4;

public class Ex2_4 {

    public static class Fracao {
        public static Double adicionar(Double a, Double b){
            return (a + b);
        }

        public static Double subtrair(Double a, Double b){
            return (a - b);
        }

        public static Double multiplicar(Double a, Double b){
            return (a * b);
        }

        public static Double dividir(Double a, Double b){
            return (a / b);
        }
        public static Double adicionar(Integer a, Double b){
            return (Double.valueOf(a) + b);
        }

        public static Double subtrair(Integer a, Double b){
            return (Double.valueOf(a) - b);
        }

        public static Double multiplicar(Integer a, Double b){
            return (Double.valueOf(a) * b);
        }

        public static Double dividir(Integer a, Double b){
            return (Double.valueOf(a) / b);
        }
        public static Double adicionar(Double a, Integer b){
            return (a + Double.valueOf(b));
        }

        public static Double subtrair(Double a, Integer b){
            return (a - Double.valueOf(b));
        }

        public static Double multiplicar(Double a, Integer b){
            return (a * Double.valueOf(b));
        }

        public static Double dividir(Double a, Integer b){
            return (a / Double.valueOf(b));
        }
        public static Integer adicionar(Integer a, Integer b){
            return (a + b);
        }

        public static Integer subtrair(Integer a, Integer b){
            return (a - b);
        }

        public static Integer multiplicar(Integer a, Integer b){
            return (a * b);
        }

        public static Double dividir(Integer a, Integer b){
            return (Double.valueOf(a) / Double.valueOf(b));
        }
    }
}
