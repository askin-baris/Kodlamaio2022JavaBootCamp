public class Main {

    public static void main(String[] args) {
	 // For
        for (int i=1;i<10;i++)
        {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int i=1;
        //While
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=100;
        do {
            System.out.println("Loglandı");
                System.out.println(j);
                j+=2;

        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
//Do-While döngüsünün While döngüsünden farkı şart şağlanmasa bile bir kere çalıştırılır, şart sağlandığı sürece  normal While'dan farkı yok.
}
