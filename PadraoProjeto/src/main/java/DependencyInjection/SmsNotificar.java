package DependencyInjection;

public class SmsNotificar implements Notificar{
    @Override
    public void notificar() {
        System.out.println("Notificando Sms...");

    }
}
