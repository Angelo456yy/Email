import gt.edu.miumg.email.Email;

public class Main {
    public static void main(String[] args) {

        Email email = new Email.EmailBuilder()
                .agregarDestinatario("al8817515@gmail.com")
                .setAsunto("Solicitud de empleo ")
                .setCuerpo("Por este medio envio mis datos para la solicitud de empleo")
                .build();


        System.out.println(email);
    }
}