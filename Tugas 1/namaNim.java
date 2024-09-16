import java.util.Scanner;

public class namaNim{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Masukkan nama: ");
    String nama = scanner.nextLine();

    System.out.print("Masukkan NIM: ");
    int nim = scanner.nextInt();

    System.out.println();

    System.out.print("Haloo " + nama);
    System.out.print(" dengan NIM " + nim);
    

    scanner.close();

    }
}