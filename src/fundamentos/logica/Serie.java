package fundamentos.logica;

public class Serie 
{
    public static String fibonacci(int numero)
    {
        String cadenaSerie = "" + String.valueOf(0);

        int a=0, b=1, c=0;
        for (int i=2; i<=numero; i++){
            a=b;
            b=c;
            c=a+b;

            cadenaSerie = cadenaSerie + " " + String.valueOf(c);
        }

        return cadenaSerie;
    }
}
   