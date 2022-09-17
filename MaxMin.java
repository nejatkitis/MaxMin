import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int n,num,max = 0,min =0;
        Scanner number = new Scanner(System.in);
        System.out.print("Kaç tane sayıyı karşılaştırmak istersiniz : ");
        n = number.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(i+ ". sayıyı giriniz : ");
            num = number.nextInt();
            if (i==1){
                max = num;
                min = num;
            } else {
                if (num>max){
                    max = num;
                }
                if (num<min){
                    min = num;
                }
            }
        }
        System.out.print("En küçük sayı : "+min+"\n");
        System.out.print("En büyük sayı : "+max);
    }
}
