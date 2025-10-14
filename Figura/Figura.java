public abstract class Figura {
    public abstract void calcularArea();
}

class Rectangulo extends Figura {
    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo constituye de 20m");
    }
}

class Triangulo extends Figura {
    @Override
    public void calcularArea() {
        System.out.println("El area del triangulo constituye de 13m");
    }
}
class main{
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calcularArea();
        triangulo.calcularArea();
    }
}