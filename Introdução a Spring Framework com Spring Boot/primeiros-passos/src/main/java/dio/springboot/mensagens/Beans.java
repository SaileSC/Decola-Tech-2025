package dio.springboot.mensagens;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope(scopeName = "prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreplay@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
