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
    static double areaTriangulo(double base, double altura){
        double area;
        area=(base*altura)/2;
        return area;
    }
    static double areaPentagono(double lado, double apotema){
        double area;
        area=(lado*5*apotema)/2;
        return area;
    }
    static double areaHexagono(double lado, double apotema){
        double area;
        area=(lado*6*apotema)/2;
        return area;
    }
    static void imprimirArea(double area){
        System.out.println("This figure's area is: "+area);
    }
    public static void main(String[] args) {             
        double dato, dato2, k;
        int a;
        Scanner leer=new Scanner(System.in);        
        do{
        System.out.println("Menu\nWhat do you want to do?\n\t1)Get a circle's area\n\t2)Get an square's area\n\t3)Get a triangle's area\n\t4)Get a pentagon's Area\n\t5)Get an hexagon's area\n\t6)Exit\n\tWrite a number and press enter to continue:");            
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
            case 3: System.out.println("Please write the triangle's base:");
                    dato=leer.nextDouble();
                    System.out.println("Please write the triangle's height:");
                    dato2=leer.nextDouble();
                    k=areaTriangulo(dato,dato2);
                    imprimirArea(k);
                    break;
            case 4: System.out.println("Please write the size of one of the pentagon's side:");
                    dato=leer.nextDouble();
                    System.out.println("Please write the size of the apothem:");
                    dato2=leer.nextDouble();
                    k=areaPentagono(dato, dato2);
                    imprimirArea(k);
                    break;
            case 5: System.out.println("Please write the size of one of the hexagon's side:");
                    dato=leer.nextDouble();
                    System.out.println("Please write the size of the apothem:");
                    dato2=leer.nextDouble();
                    k=areaHexagono(dato, dato2);
                    imprimirArea(k);
                    break;
            case 6: break;
            default: System.out.println("Invalid option. Please choose a valid option and press enter.");        
        }
        }while(a!=6);
    }   
}