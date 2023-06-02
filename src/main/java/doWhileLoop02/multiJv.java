package doWhileLoop02;

import java.util.Scanner;

public class multiJv {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("lütfen Multidimensional Array'in satır boyutunu giriniz: ");
        int satir=input.nextInt();
        System.out.print("lütfen Multidimensional Array'in sutun boyutunu giriniz: ");
        int sutun=input.nextInt();

        int matrix[][]=new int[satir][sutun];
        int sayac=0;
        int toplamSayiAdeti=satir*sutun;

        System.out.print("lütfen matrixin sayilarini  giriniz: ");
        System.out.println();

        for (int i=0; i<satir ;i++){
            for (int j=0; j<sutun; j++){
                System.out.print("Eleman [" + i + "][" + j + "]: ");
                matrix[i][j]=input.nextInt();
            }
        }

        for (int[] w:matrix){
            for (int k:w){
                if (k%2==0){
                    sayac++;
                }
            }
        }

        String hepsiCiftmi;
        if (sayac==toplamSayiAdeti){
            hepsiCiftmi="Matrixin her bir satırı çift sayılardan oluşuyor.";
        }else {
            hepsiCiftmi="Matrixin en az bir satırı tek sayı içeriyor.";
        }
        System.out.println(hepsiCiftmi);
    }
    }



