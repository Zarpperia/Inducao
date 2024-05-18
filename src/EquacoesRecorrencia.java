public class EquacoesRecorrencia {
    public static void main(String[] args) {
        int n = 5; // Altere o valor de n conforme necessário
        int c = 3; // Defina o valor de c conforme necessário
        int resultadoA = calcularRecorrenciaA(n);
        int resultadoB = calcularRecorrenciaB(n, c);
        int resultadoC = calcularRecorrenciaC(n);

        System.out.println("Resultado da Equação a. T(" + n + ") = " + resultadoA);
        System.out.println("Resultado da Equação b. T(" + n + ") = " + resultadoB);
        System.out.println("Resultado da Equação c. T(" + n + ") = " + resultadoC);
    }

    public static int calcularRecorrenciaA(int n) {
        if (n == 0) {
            return 1;
        }
        return calcularRecorrenciaA(n - 1) + (int) Math.pow(2, n);
    }

    public static int calcularRecorrenciaB(int n, int c) {
        if (n == 0) {
            return 0;
        }
        return c * calcularRecorrenciaB(n - 1, c);
    }

    public static int calcularRecorrenciaC(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcularRecorrenciaC(n / 3);
    }
}
