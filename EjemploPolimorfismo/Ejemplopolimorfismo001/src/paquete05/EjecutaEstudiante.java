package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide cuando terminar el proceso.
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        // ciclo que permite comprobar el polimorfismo
        do {
       //El usuario elige el tipo de estudiante
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia\n");         

            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();

            //Empezamos preguntandole al usuario los datos que siempre va a obtener cualquier tipo de estudiante
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            //Datos que se ingresa para la opcion 1
            if (tipoEstudiante == 1) {     
                //Proceso que se usa para el estudiante presencial, iniciamos declarando el objeto EstudiantePresencial
                EstudiantePresencial1 estudianteP = new EstudiantePresencial1();      
                //Datos ingresados por el usuario
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                //Llamamos a los datos de la subclase EstudiantePresencial1
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);          
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                
                 //Desde el metodo abstracto, calculamos la matricula presencial de la subclase
                estudianteP.calcularMatricula();       
                //Se añade el objeto a la ArrayList
                estudiantes.add(estudianteP);            
            } else {

                if (tipoEstudiante == 2) {
                    //Proceso que se usa para el estudiante Distancia, iniciamos declarando el objeto EstudianteDistancia
                    EstudianteDistancia1 estudianteD = new EstudianteDistancia1();
                    //Datos ingresados por el usuario
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();
                    //Llamamos a los datos de la subclase EstudianteDistancia1
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);           
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    
                     //Desde el metodo abstracto, Se calcula la matricula a distancia de la subclase
                    estudianteD.calcularMatricula();   
                    //Se añade el objeto a la ArrayList
                    estudiantes.add(estudianteD);  

                } else {
                    System.out.println("Opción fuera de rango");

                }
            }

            entrada.nextLine();
            // Se pregunta si se desea ingresar más estudiante
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");
            // se captura el valor ingresado por el usuario para la variable 
            // continuar
            continuar = entrada.nextLine(); 
            // se pregunta si el valor continuar es igual al valor "S", se sigue en 
            // ciclo repetitivo; si el valor es distinto de "S", se sale del ciclo
            // repetitivo
        } while (continuar.equals("S")); 
        
       
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }
}
