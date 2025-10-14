interface Volador {
    void Volar();
    
}
interface Nadador {
    void Nadar();
}

public class Pato implements Volador, Nadador{

    @Override
    public void Nadar() {
        System.out.println("El pato nada empujando el agua con sus patas palmeadas");
    }

    @Override
    public void Volar() {
        System.out.println("El pato vuela aprovechando el impulso de despegue las corrientes de vient, su peso y aleteo");
    }
}
class main2{
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.Nadar();
        pato.Volar();
    }
}
