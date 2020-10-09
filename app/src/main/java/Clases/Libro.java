package Clases;

public class Libro {

    private int farenheith;
    private int revival;
    private int ElAlquimista;
    private int Elpoder;
    private  int Despertar;

    public Libro()
    {
        farenheith= 7000;
        revival = 22000;
        ElAlquimista = 45000;
        Elpoder = 88000;
        Despertar = 156000;
    }

    public int getFarenheith()
    {
        return farenheith;
    }
    public int getRevival()
    {
        return revival;
    }
    public int getElAlquimista()
    {
        return ElAlquimista;
    }
    public int getElpoder(){return Elpoder;}
    public int getDespertar(){return Despertar; }
}
