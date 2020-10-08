package Clases;

public class Libros {
    private String PreFarenheit, PreRevival, PreElAlquimista, farenheit, revival, alquimista;



    public Libros()
    {
        PreFarenheit = "5000";
        PreRevival = "12000";
        PreElAlquimista = "45000";
        farenheit = "Farenheit";
        revival="Revival";
        alquimista="El Alquimista";
    }

    public String getPreFarenheit() {
        return PreFarenheit;
    }

    public void setPreFarenheit(String preFarenheit) {
        PreFarenheit = preFarenheit;
    }

    public String getPreRevival() {
        return PreRevival;
    }

    public void setPreRevival(String preRevival) {
        PreRevival = preRevival;
    }

    public String getPreElAlquimista() {
        return PreElAlquimista;
    }

    public void setPreElAlquimista(String preElAlquimista) {
        PreElAlquimista = preElAlquimista;
    }

    public String getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(String farenheit) {
        this.farenheit = farenheit;
    }

    public String getRevival() {
        return revival;
    }

    public void setRevival(String revival) {
        this.revival = revival;
    }

    public String getAlquimista() {
        return alquimista;
    }

    public void setAlquimista(String alquimista) {
        this.alquimista = alquimista;
    }
}
