package Factory;

public class FactoryEmail implements FactoryNotificar {

    @Override
    public void notificar() {
        System.out.println("FactoryEmail notificar");
    }
}
