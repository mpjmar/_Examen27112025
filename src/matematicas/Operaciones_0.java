package matematicas;

public class Operaciones_0 {
    
    /**
     * Versión sobrecargada de {@link #esPrimo(long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @return {@code true} si {@code num1} es primo
     * y {@code false} si no lo es.
     */
    /**public static boolean esPrimo(int num1) {
        return esPrimo((long) num1); 
    }

    
     * Indica si un número es primo.
     * 
     * @param num1 un número entero.
     * @return {@code true} si {@code num1} es primo
     *  y {@code false} si no lo es.
     */
    /* public static boolean esPrimo(long num1) {
        long i = num1;
        while (i > 2) {
            if (esIgual(resto(num1, i)), 0)
                return false;
            i--;
        }
        return true;
    } */

    /**
     * Versión sobrecargada de {@link #esDivisor(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return {@code true} si {@code num1} es divisor
     * de {@code num2} y {@code false} si no lo es.
     */
    public static boolean esDivisor(int num1, int num2) {
        return esDivisor((long) num1, (long) num2); 
    }

    /**
     * Indica si un número es divisor de otro dado.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return {@code true} si {@code num1} es divisor
     * de {@code num2} y {@code false} si no lo es.
     */
    public static boolean esDivisor(long num1, long num2) {
        return esIgual(resto(num1, num2), 0);
    }

    /**
     * Versión sobrecargada de {@link #esMultiplo(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return {@code true} si {@code num1} es múltiplo
     * de {@code num2} y {@code false} si no lo es.
     */
        public static boolean esMultiplo(int num1, int num2) {
            return esMultiplo((long) num1, (long) num2); 
        }
    
        /**
         * Indica si un número es múltiplo de otro dado.
         * 
         * @param num1 un número entero.
         * @param num2 un número entero.
         * @return {@code true} si {@code num1} es múltiplo
         * de {@code num2} y {@code false} si no lo es.
         */
        public static boolean esMultiplo(long num1, long num2) {
            return esIgual(resto(num1, num2), 0);
        }

    /**
     * Versión sobrecargada de {@link #cubo(long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @return el resultado de elevar {@code num1} a 3.
     */
    public static int cubo(int num) {
        return (int) potencia((long) num, 3); 
    }

    /**
     * Eleva un entero a 3.
     * 
     * @param num1 un número entero.
     * @return el resultado de elevar {@code num1} 3.
     */
    public static long cubo(long num) {
        return potencia(num, 3);
    }

    /**
     * Versión sobrecargada de {@link #cuadrado(long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @return el resultado de elevar {@code num1} a 2.
     */
    public static int cuadrado(int num) {
        return (int) potencia((long) num, 2); 
    }

    /**
     * Eleva un entero a 2.
     * 
     * @param num1 un número entero.
     * @return el resultado de elevar {@code num1} 2.
     */
    public static long cuadrado(long num) {
        return potencia(num, 2);
    }
    
    /**
     * Versión sobrecargada de {@link #potencia(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de elevar {@code num1} a 
     * {@code num2}.
     */
    public static int potencia(int num1, int num2) {
        return (int) potencia((long) num1, (long) num2); 
    }

    /**
     * Eleva un entero a un valor pasado por parámetro.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de elevar {@code num1} 
     * a {@code num2}.
     */
    public static long potencia(long num1, long num2) {
        boolean esNegativo = esMenor(num1, 0) && esMayor(num2, 0) || esMenor(num2, 0) && esMayor(num1, 0);
        long res = 1;
        for (int i = 0; i < num2; i++)
            res = multiplica(res, num1);
        return esNegativo ? -res : res; 
    }

    /**
     * Versión sobrecargada de {@link #resto(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resto de la división de {@code num1} y 
     * {@code num2}.
     */
        public static int resto(int num1, int num2) {
            return (int) resto((long) num1, (long) num2); 
        }
    
        /**
         * Divide 2 números enteros.
         * 
         * @param num1 un número entero.
         * @param num2 un número entero.
         * @return el resto de la división de {@code num1} 
         * y {@code num2}.
         */
        public static long resto(long num1, long num2) {
            while (num1 >= num2)
                num1 = resta(num1, num2);
            return num1; 
        }

    /**
     * Versión sobrecargada de {@link #divide(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la división de {@code num1} y 
     * {@code num2}.
     */
    public static int divide(int num1, int num2) {
        return (int) divide((long) num1, (long) num2); 
    }

    /**
     * Divide 2 números enteros.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la división de {@code num1} 
     * y {@code num2}.
     */
    public static long divide(long num1, long num2) {
        boolean esNegativo = esMenor(num1, 0) && esMayor(num2, 0) || esMenor(num2, 0) && esMayor(num1, 0);
        long res = 0;
        while (num1 > 0) {
            num1 = resta(num1, num2);
            res = suma(res, 1);
        }
        return esNegativo ? -res : res; 
    }

    /**
     * Versión sobrecargada de {@link #multiplica(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la multiplicación de {@code num1} y 
     * {@code num2}.
     */
    public static int multiplica(int num1, int num2) {
        return (int) multiplica((long) num1, (long) num2); 
    }

    /**
     * Multiplica 2 números enteros.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la multiplicación de {@code num1} 
     * y {@code num2}.
     */
    public static long multiplica(long num1, long num2) {
        boolean esNegativo = esMenor(num1, 0) && esMayor(num2, 0) || esMenor(num2, 0) && esMayor(num1, 0);
        long res = num2;
        while (res > 0) {
            res = suma(res, num1);
            res--;
        }
        return esNegativo ? -res : res; 
    }

    /**
     * Versión sobrecargada de {@link #esIgual(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return {@code true} si {@code num1} es igual que 
     * o {@code false} si no lo es.
     */
    public static boolean esIgual(int num1, int num2) {
        return  esIgual((long) num1, (long) num2); 
    }

    /**
     * Devuelve si {@code num1} es igual que {@code num2}. 
     * 
     * @param num1 un número entero.
     * @param num2 el valor 1.
     * @return {@code true} si {@code num1} es igual que 
     * o {@code false} si no lo es.
     */
    public static boolean esIgual(long num1, long num2) {
        return !(esMenor(num1, num2) && esMayor(num1, num2));
    }

    /**
     * Versión sobrecargada de {@link #esMenor(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return {@code true} si {@code num1} es menor que 
     * o {@code false} si no lo es.
     */
    public static boolean esMenor(int num1, int num2) {
        return  esMenor((long) num1, (long) num2); 
    }

    /**
     * Devuelve si {@code num1} es menor que {@code num2}. 
     * 
     * @param num1 un número entero.
     * @param num2 el valor 1.
     * @return {@code true} si {@code num1} es menor que 
     * o {@code false} si no lo es.
     */
    public static boolean esMenor(long num1, long num2) {
        return (resta(num2, num1) > 0);
    }

    /**
     * Versión sobrecargada de {@link #esMayor(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return {@code true} si {@code num1} es mayor que 
     * o {@code false} si no lo es.
     */
    public static boolean esMayor(int num1, int num2) {
        return  esMayor((long) num1, (long) num2); 
    }

    /**
     * Devuelve si {@code num1} es mayor que {@code num2}.
     * 
     * @param num1 un número entero.
     * @param num2 el valor 1.
     * @return {@code true} si {@code num1} es mayor que 
     * o {@code false} si no lo es.
     */
    public static boolean esMayor(long num1, long num2) {
        return (resta(num1, num2) > 0);
    }

    /**
     * Versión sobrecargada de {@link #dec(long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @return el número {@code num1} decrementado en 1.
     */
    public static int dec(int num1) {
        return (int) dec((long) num1); 
    }

    /**
     * Decrementa en 1 un valor pasado por parámetro.
     * 
     * @param num1 un número entero.
     * @return el número {@code num1} decrementado en 1.
     */
    public static long dec(long num1) {
        return  resta(num1, 1);
    }

    /**
     * Versión sobrecargada de {@link #resta(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la resta de {@code num1} y 
     * {@code num2}.
     */
    public static int resta(int num1, int num2) {
       return (int) resta((long) num1, (long) num2); 
    }

    /**
     * Suma 2 números enteros
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la resta de {@code num1} y 
     * {@code num2}.
     */
    public static long resta(long num1, long num2) {
        return  num1 + (-num2); 
    }

    /**
     * Versión sobrecargada de {@link #inc(long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @return el número {@code num1} incrementado en 1.
     */
    public static int inc(int num1) {
        return (int) inc((long) num1); 
    }

    /**
     * Incrementa en 1 un valor pasado por parámetro.
     * 
     * @param num1 un número entero.
     * @return el número {@code num1} incrementado en 1.
     */
    public static long inc(long num1) {
        return  suma(num1, 1);
    }

    /**
     * Versión sobrecargada de {@link #suma(long, long)} que 
     * acepta {@code int}.
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la suma de {@code num1} y 
     * {@code num2}.
     */
    public static int suma(int num1, int num2) {
        return (int) suma((long) num1, (long) num2); 
    }

    /**
     * Suma 2 números enteros
     * 
     * @param num1 un número entero.
     * @param num2 un número entero.
     * @return el resultado de la suma de {@code num1} 
     * y {@code num2}.
     */
    public static long suma(long num1, long num2) {
        return num1 + num2; 
    }
}
