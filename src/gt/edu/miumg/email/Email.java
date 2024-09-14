package gt.edu.miumg.email;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private List<String> destinatarios;
    private String asunto;
    private String cuerpo;
    private List<String> adjuntos;


    private Email() {
        this.destinatarios = new ArrayList<>();
        this.adjuntos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Email{" +
                "destinatarios=" + destinatarios +
                ", asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", adjuntos=" + adjuntos +
                '}';
    }


    public static class EmailBuilder {
        private Email email;

        public EmailBuilder() {
            this.email = new Email();
        }


        public EmailBuilder agregarDestinatario(String destinatario) {
            if (destinatario == null || destinatario.isEmpty()) {
                throw new IllegalArgumentException("Debe haber al menos un destinatario.");
            }
            this.email.destinatarios.add(destinatario);
            return this;
        }

        public EmailBuilder setAsunto(String asunto) {
            this.email.asunto = asunto;
            return this;
        }

        public EmailBuilder setCuerpo(String cuerpo) {
            this.email.cuerpo = cuerpo;
            return this;
        }

        public EmailBuilder agregarAdjunto(String adjunto) {
            this.email.adjuntos.add(adjunto);
            return this;
        }


        public Email build() {
            if (this.email.destinatarios.isEmpty()) {
                throw new IllegalArgumentException("El correo debe tener al menos un destinatario.");
            }
            return this.email;
        }
    }
}
