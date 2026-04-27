package Factory;

public class FactoryWhatsApp implements FactoryNotificar {

    @Override
    public void notificar() {
        System.out.println("WhatsApp NOTIFICACAO");
    }
}
