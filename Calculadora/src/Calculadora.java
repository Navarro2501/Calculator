import java.util.Scanner;
public class Calculadora {    
    static double areaCirculo(double radio){
        double area;
        area=3.1416*(radio*radio);
        return area;
    }
    static double areaCuadrado(double lado){
        double area;
        area=lado*lado;
        return area;
    }
    static void imprimirArea(double area){
        System.out.println("El área de la figura es:"+area);
    }
    public static void main(String[] args) {             
        double dato, k;
        int a;
        Scanner leer=new Scanner(System.in);        
        do{
        System.out.println("Menu\nWhat do you want to do?\n\t1)Get a circle's area\n\t2)Get an square's area\n\t3)Exit\n\tPress a number to continue:");            
        a=leer.nextInt();
        switch(a){        
            case 1: System.out.println("Please write the radius' lenght:");
                    dato=leer.nextDouble();
                    k=areaCirculo(dato);
                    imprimirArea(k);
                    break;
            case 2: System.out.println("Please write the side's lenght:");
                    dato=leer.nextDouble();
                    k=areaCuadrado(dato);
                    imprimirArea(k);
                    break;
            case 3: break;
            default: System.out.println("Invalid option. Please choose option 1), 2) or 3).");        
        }
        }while(a!=3);
    }   
}