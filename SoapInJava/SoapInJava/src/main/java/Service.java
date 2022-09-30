import com.sun.corba.se.spi.activation.EndPointInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

@WebService(name = "Service", targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class Service {
    Scanner sc = new Scanner(System.in);

    @WebMethod(operationName = "responseMessage")
    public String responseMessage(@WebParam(name = "message")String message){
        return "El mensaje recibido fue " + message;
    }

    //Método que RANDOM
    Random random = new Random();
    @WebMethod(operationName = "guessNumber")

    //el int number es el parametro que va a recibir desde el cliente
    public String guessNumber (@WebParam(name = "number") int number){
        int numberram = random.nextInt(10);
        System.out.println(numberram);
        if (number != numberram){
            return "Try Again";
        }
        return "You´re right";
    }

    @WebMethod(operationName = "characters")
    public String characters(@WebParam(name = "name") String name){
        char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        String cadenanueva ="";
        if (name == null){
            return "Pleace type something";
        }
        else{
            for (int i=0; i<name.length(); i++){
                for (int j=0; j< consonantes.length; j++){
                    if (name.charAt(i) == consonantes[j]){
                        cadenanueva += name.charAt(i);
                    }
                }
            }
            return cadenanueva;
        }
    }

    @WebMethod(operationName = "rfc")
    public String rfc (@WebParam(name = "rfc") BeanPerson person){

        String ram3 = UUID.randomUUID().toString().toUpperCase().substring(0, 3);
        String patern = person.getApellido2().toUpperCase();
        String nombre = person.getName().toUpperCase();
        String RFC = person.getApellido().substring(0, 2).toUpperCase() + patern.charAt(0) +
                nombre.charAt(0) + person.getAnio().substring(2, 4).toUpperCase() + person.getMes() + person.getDia() + ram3;

        return RFC;
    }


    public static void main(String[] args) {
        System.out.println("Initializaning server...");
        Endpoint.publish("http://localhost:8081/Service", new Service());
        System.out.println("Wating request");
    }
}
