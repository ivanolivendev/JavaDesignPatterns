package Factory;

public class FactorySms implements FactoryNotificar{

    @Override
    public void notificar() {
        System.out.println("SMS NOTIFICACAO");
    }
}
