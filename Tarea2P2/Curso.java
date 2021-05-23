
public class Curso
{
    private int nroEstudiantes;
    public void InstruccionesPrograma(){
        System.out.println(" 1er paso : se genera la cantidad de estudiantes ");
        System.out.println(" 2do paso: se crea el Registro de notas ");
        System.out.println(" 3er paso : se rellena o agrega la nota de cada estudiante, uno por uno(el numero de Estudiantes es de 1 a n)");
     System.out.print("\n 4to paso :Se usa cualquiera de los otros \r metodos para verificar cantidad de: aprobados \r reprobados"
         + "\n promedio de aprobacion de toda la clase"+"\nMejor nota de la clase");  
         
        }

    public Curso(int cantidadEstudiantes){
        nroEstudiantes=cantidadEstudiantes;
    }

    public int [] CrearRegistroDeNotasPorEstudiante(){
        int [] registro = new int [nroEstudiantes];
        return registro;
    }

    public void añadirNotasalRegistroparacadaEstudiante(int nota, int estudiante,int a []){
        a[estudiante -1] = nota;
    }

    public double promediodetodaslasnotas(int registro []){
        double suma = 0;
        for (int i = 0 ; i <registro.length; i++){
            suma = registro [i]+ suma;
        }
        double promedio = suma / registro.length;
        return promedio;
    }

    public double promedioDeNotasdeAprobaciondelaClase(int registro []){
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < registro.length; i++){
            if(registro [i] >51){
                suma = registro [i]+ suma;
                contador++;
            } 
        }
        double promedio = suma / contador;
        return promedio;
    }

    public double CantidadEstudiantesReprobados(int a []){
        int contador = 0;
        for (int i = 0; i < a.length; i++){
            if(a [i] <51){
                contador++;
            } 
        }
        return contador;
    }

    public double CantidadEstudiantesAprobados(int registro []){
        int aprobados = 0;
        for (int ciclo = 0; ciclo < registro.length; ciclo ++){
            if(registro [ciclo] >51){
                aprobados++;
            } 
        }
        return aprobados;
    }

    public double MayorNotaDelaClase(int registro []){
        int mayor =0;
        int aux =0;
        int almacenadordeposiciones=0;
        for (int i = 0; i< registro.length;i++){
            mayor= Math.max( registro[i], aux);
         
            if(mayor>aux){
            almacenadordeposiciones = i;
            }
               aux=mayor;
        }
        System.out.print("La nota de aprobacion le pertenece al estudiante :"+(almacenadordeposiciones+1));
        return mayor;
    }
    public double mayorv2(int a[]){
        int mayor =0 ;
          for (int i = 0; i< a.length;i++){
              if( a[i] >mayor){
                mayor = a[i];
                }
            }
           return mayor ;
        }

}
