public class D {
    private int D1; 
    private String D2; 

    // Construtor da classe D
    public D(int d1, String d2) {
        D1 = d1;
        D2 = d2;
    }

    // Método MD1 que retorna o valor de D1
    public int MD1() {
        return D1;
    }


    public void MD2() {
        System.out.println("Valor de D2: " + D2);
    }

 
    public int getD1() {
        return D1;
    }

    public void setD1(int d1) {
        D1 = d1;
    }

    public String getD2() {
        return D2;
    }

    public void setD2(String d2) {
        D2 = d2;
    }
}

