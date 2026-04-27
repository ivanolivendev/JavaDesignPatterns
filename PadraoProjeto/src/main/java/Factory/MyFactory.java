package Factory;

import DependencyInjection.EmailNotificar;
import DependencyInjection.SmsNotificar;

public class MyFactory {

    public FactoryNotificar factory (FactoryDependency dependencia)
    {

        return switch (dependencia){
            case WHATSAPP -> new FactoryWhatsApp();
            case SMS -> new FactorySms();
            case EMAIL -> new FactoryEmail();
            default -> throw new IllegalArgumentException("Tipo desconhecido");
        };



    }



    }

