import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = input.nextInt();
        if( mat > 100 || mat < 0){
            mat = 0;
        }
        System.out.print("fizik notunuz:");
        fizik = input.nextInt();
        if( fizik > 100 || fizik < 0){
            fizik = 0;
        }
        System.out.print("turkce notunuz:");
        turkce = input.nextInt();
        if( turkce > 100 || turkce < 0){
            turkce = 0;
        }
        System.out.print("kimya notunuz:");
        kimya = input.nextInt();
        if( kimya > 100 || kimya < 0){
            kimya = 0;
        }
        System.out.print("muzik notunuz:");
        muzik = input.nextInt();
        if( muzik > 100 || muzik < 0){
            muzik = 0;
        }


        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        if(avarage < 55 ){
            System.out.println("Sınıfta kaldınız.");
        }
        else{
            System.out.println("Geçtiniz.");
        }
        System.out.println("Ortalamanız =" +avarage);
    }
}
