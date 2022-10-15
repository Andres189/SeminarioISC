package actividadcajero;

import java.util.Scanner;

public class ActividadCajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pin="1235";
        Boolean flag=true;
        int intentos=1;
        Scanner sc = new Scanner(System.in);       
        do{
            System.out.println("Ingresa el NIP de la tarjeta:");
            String pinaux = sc.nextLine();
            if(pinaux.equals(pin)){
                System.out.println("Bienvenido");
                flag = false;

            }else if(intentos<3){
                System.out.println("NIP incorrecto "+intentos+ " intento superado");
                intentos++;
            }else{
                System.out.println("Superaste el numero maximo de intentos");
                System.exit(0);
            }
        }while(flag==true);
        
    }
    
}
