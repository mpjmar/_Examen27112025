package matematicas;
public class Operaciones {

    //throw new UnsupportedOperationException;
   
    public static boolean esCuadradoPerfecto(int num) {
        if (esIgual(num, 0))
            return true;
        for (int i = 1; !esMayor(cuadrado(i), num); i = inc(i))
            if (esIgual(cuadrado(i), num))
                return true;
        return false;
    }

    public static boolean esPrimo(int num) {
        if (esMenor(num, 2))
            return false;
        for (int i = 2; !esMayor(i, divide(num, 2)); i = inc(i)) 
            if (esIgual(resto(num, i), 0))
                return false;
        return true;
    }

    public static int cubo(int base) {
        return potencia(base, 3);
    }

    public static int cuadrado(int base) {
        return potencia(base, 2);
    }

    public static int potencia(int base, int exp) {
        if(esMenor(exp, 0))
            return 0;
        int res = 1;
        while (exp > 0) {
            res = multiplica(res, base);
            exp = dec(exp);
        }
        return res;
    }

    public static boolean esDivisor(int num1, int num2) {
        if (esIgual(num1, 0))
            return false;
        return esMultiplo(num2, num1);
    }
    
    public static boolean esMultiplo(int num1, int num2) {
        return (esIgual(resto(num1, num2), 0));
    }

    public static int resto(int num1, int num2) {
        /* if (esIgual(num2, 0))
            throw new ArithmeticException("División por cero.");
        int signo = 1;
        if (esIgual(num1, 0))
            return 0;
        if (!(num1 > 0)) {
            signo = -signo;
            num1 = -num1;
        }
        while (!esMenor(num1, num2)) {
            num1 = resta(num1, num2);
        } 
        return esIgual(signo, 1) ? num1 : -num1; */
        return (resta(num1, multiplica(divide(num1, num2), num2)));
    }

    public static int divide(int num1, int num2) {
        int res = 0;
        if (esIgual(num2, 0))
            throw new ArithmeticException("División por cero.");
        int signo = 1;
        if (esIgual(num1, 0))
            return 0;
        if (!(num1 > 0)) {
            signo = -signo;
            num1 = -num1;
        }
        if (!(num2 > 0)) {
            signo = -signo;
            num2 = -num2;
        }
        while (!esMenor(num1, num2)) {
            num1 = resta(num1, num2);
            res = inc(res);
        }
        return esIgual(signo, 1) ? res : -res;
    }

    public static int multiplica(int num1, int num2) {
        int res = 0;
        int signo = 1;
        if (esIgual(num1, 0) || esIgual(num2, 0))
            return 0;
        if (!(num1 > 0)) {
            signo = -signo;
            num1 = -num1;
        }
        if (!(num2 > 0)) {
            signo = -signo;
            num2 = -num2;
        }
        while (num2 > 0) {
            num2 = dec(num2);
            res = suma(res, num1);
        }
        return esIgual(signo, 1) ? res : -res;
    }

    public static boolean esIgual(int num1, int num2) {
        return (!esMayor(num1, num2) && !esMayor(num2, num1));
    }

    public static boolean esMenor(int num1, int num2) {
        return (resta(num2, num1) > 0);
    }

    public static boolean esMayor(int num1, int num2) {
        return (resta(num1, num2) > 0);
    }

    public static int dec(int num) {
        return resta(num, 1);
    }

    public static int resta(int num1, int num2) {
        return suma(num1, -num2);
    }

    public static int inc(int num) {
        return suma(num, 1);
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
