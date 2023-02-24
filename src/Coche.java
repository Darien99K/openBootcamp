public class Coche
{
    int puertas = 4;
    public void sumarPuerta()
    {
        this.puertas++;
    }

    public static void main(String[] args)
    {
        Coche miCoche = new Coche();
        miCoche.sumarPuerta();
        System.out.println(miCoche.puertas);
    }
}