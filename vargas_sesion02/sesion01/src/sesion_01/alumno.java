package sesion_01;
 
public class alumno {
    public alumno(String sNombre, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.nEdad = nEdad;
    }
    String sNombre = "Pierina";
    String sApellio = "Vargas";
    String sFecha_Nacimiento = "04/07/1995";

    public alumno(String sNombre, String sApellio, String sFecha_Nacimiento, String sCodigo, String sSexo, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.sApellio = sApellio;
        this.sFecha_Nacimiento = sFecha_Nacimiento;
        this.sCodigo = sCodigo;
        this.sSexo = sSexo;
        this.nEdad = nEdad;
    }
    String sCodigo ="2012227605";
    String sSexo = "Mujer";

    public void setSApellio(String sApellio) {
        this.sApellio = sApellio;
    }

    public String getSApellio() {
        return sApellio;
    }

    public void setSFecha_Nacimiento(String sFecha_Nacimiento) {
        this.sFecha_Nacimiento = sFecha_Nacimiento;
    }

    public String getSFecha_Nacimiento() {
        return sFecha_Nacimiento;
    }

    public void setSCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getSCodigo() {
        return sCodigo;
    }

    public void setSSexo(String sSexo) {
        this.sSexo = sSexo;
    }

    public String getSSexo() {
        return sSexo;
    }

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setNEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public int getNEdad() {
        return nEdad;
    }
    int nEdad;
    public alumno() {
        super();
    }
    public String SaludoBienvenida(String psNombre) {
        return "Hola mundo!!. Bienvenid@ " + psNombre;
    }
    public static void main(String[] args) {
        alumno myAlumno = new alumno();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + myAlumno.SaludoBienvenida("Pierina"));
        }
    }
}
