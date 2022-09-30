public class BeanPerson {
    String rfc;
    String name;
    String apellido;
    String apellido2;
    String anio;
    String mes;
    String dia;

    public BeanPerson(String rfc, String name, String apellido, String apellido2, String anio, String mes, String dia) {
        this.rfc = rfc;
        this.name = name;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
