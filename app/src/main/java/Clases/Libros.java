package Clases;

public class Libros {
    private String PreFarenheit, PreRevival, PreElAlquimista, PrePoder, PreDespertar,
            farenheit, revival, alquimista, poder, despertar;



    public Libros()
    {
        PreFarenheit = "7000";
        PreRevival = "22000";
        PreElAlquimista = "45000";
        PrePoder="88000";
        PreDespertar="156000";
        farenheit = "Farenheit";
        revival="Revival";
        alquimista="El Alquimista";
        poder="El Poder";
        despertar="Despertar";
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

    public String getPrePoder() {
        return PrePoder;
    }

    public void setPrePoder(String prePoder) {
        PrePoder = prePoder;
    }

    public String getPreDespertar() {
        return PreDespertar;
    }

    public void setPreDespertar(String preDespertar) {
        PreDespertar = preDespertar;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDespertar() {
        return despertar;
    }

    public void setDespertar(String despertar) {
        this.despertar = despertar;
    }
}
