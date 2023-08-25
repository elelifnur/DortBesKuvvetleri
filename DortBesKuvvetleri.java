import java.util.Scanner;
public class DortBesKuvvetleri {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        n= input.nextInt();
        System.out.print("4'ün kuvvetleri: ");
        for(int i=1; i <=n ;i*=4){

            System.out.print(i+" ");
        }
        System.out.print("\n5'in Kuvvetleri: ");
        for(int j=1; j<= n; j*=5){
            System.out.print(j+" ");
        }

    }
}
