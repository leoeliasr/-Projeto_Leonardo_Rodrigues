// Classe A atualizada
public class A {
    private int A1;
    private float A2;

    // Getters e setters omitidos para brevidade

    public void MA1() {
        System.out.println("Método MA1");
    }

    public void MA2() {
        System.out.println("Método MA2");
    }

    // Novo método MA3
    public void MA3() {
        System.out.println("Alteração a classe A partir do clone");
    }
}

// Nova classe C
public class C {
    private String C1;
    private int C2;

    public String getC1() {
        return C1;
    }

    public void setC1(String c1) {
        C1 = c1;
    }

    public int getC2() {
        return C2;
    }

    public void setC2(int c2) {
        C2 = c2;
    }

    public void MC1() {
        System.out.println("Método MC1");
    }

    public void MC2() {
        System.out.println("Método MC2");
    }
}
