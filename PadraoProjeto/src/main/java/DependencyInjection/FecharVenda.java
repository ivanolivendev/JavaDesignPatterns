package DependencyInjection;

public class FecharVenda {

    private final Notificar notificar;

    public FecharVenda(Notificar notificar) {
        this.notificar = notificar;
    }

    public void fecharVenda() {
        notificar.notificar();
    }
}
