public class SomaQuadrados {
    public static void main(String[] args) {
        int n = 10; /* Altere o valor de n conforme necessário */
        int resultado = SomaQuaDosdrados(n);
        System.out.println("Pn(" + n + ") = " + resultado);
    }

    public static int SomaQuaDosdrados(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}
