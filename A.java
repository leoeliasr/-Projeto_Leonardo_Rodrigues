// Classe A
public class A {
    private int A1;
    private float A2;

    public int getA1() {
        return A1;
    }

    public void setA1(int a1) {
        A1 = a1;
    }

    public float getA2() {
        return A2;
    }

    public void setA2(float a2) {
        A2 = a2;
    }

    public void MA1() {
        System.out.println("Método MA1");
    }

    public void MA2() {
        System.out.println("Método MA2");
    }

    // Método main adicionado
    public static void main(String[] args) {
        A objetoA = new A();
        objetoA.setA1(10); // Exemplo de uso do setter
        objetoA.setA2(20.0f); // Exemplo de uso do setter
        objetoA.MA1();
        objetoA.MA2();
    }
}
