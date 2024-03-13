import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        Random rand = new Random();
        for (int i = 0; i < 5; i++) 
        {
            int liczba = rand.nextInt(101); 
            int squaredNumber = liczba * liczba;
            System.out.println("Losowa liczba: " + liczba + ", Potęga tej liczby: " + squaredNumber);
            suma += squaredNumber;
        }
        System.out.println("Wynik dodawania 5 losowych liczb: " + suma);
    }
}

