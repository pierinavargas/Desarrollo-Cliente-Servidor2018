package sesion01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class cProfesor {
    String sNombre;
    int nCuros;
    String sFechaIngreso;

    public cProfesor(String sFechaIngreso) {
        this.sFechaIngreso = sFechaIngreso;
    }

    public void setSFechaIngreso(String sFechaIngreso) {
        this.sFechaIngreso = sFechaIngreso;
    }

    public String getSFechaIngreso() {
        return sFechaIngreso;
    }

    public cProfesor(String sNombre, int nCuros) {
        this.sNombre = sNombre;
        this.nCuros = nCuros;
    }

    public cProfesor() {
        super();
    }

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setNCuros(int nCuros) {
        this.nCuros = nCuros;
    }

    public int getNCuros() {
        return nCuros;
    }
    public static void main(String[] args) throws ParseException {
       Scanner sn = new Scanner(System.in);
       cProfesor mycProfesor = new cProfesor();
       
       System.out.print("Ingrese su nombre: ");
       mycProfesor.sNombre = sn.next();
       System.out.print("Ingrese su el N° de Cursos que dicta: ");
       mycProfesor.nCuros =  sn.nextInt();
       System.out.print("Ingrese su Fecha de Ingreso: "); 
       mycProfesor.sFechaIngreso = sn.next();
       
       GregorianCalendar fechaActual = new GregorianCalendar();
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       Date fechaInicial = dateFormat.parse(mycProfesor.sFechaIngreso);
       Date fechaFinal = fechaActual.getTime();
         
       int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
       
         
       System.out.println("---------------------------");
       System.out.println("----------PROFESOR---------");
       System.out.println("Nombre: " + mycProfesor.sNombre);
       System.out.println("Curos: " + mycProfesor.nCuros);
       System.out.println("Fecha de Ingreso: " + mycProfesor.sFechaIngreso);
       System.out.println("Lleva trabajando: " + dias + " dias.");
    }
}

