package DependencyInjection;

public class EmailNotificar implements Notificar{
    @Override
    public void notificar() {
        System.out.println("Notificando email...");
    }
}
