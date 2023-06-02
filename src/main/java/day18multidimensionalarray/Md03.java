package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //Ornek : Iki boyutlu bir array i tek boyutlu bir array e ceviriniz.

        int numbers[][] = {{5, 4}, {2, 3, 2}};

        //1.step : Iki boyutlu arrayde kac tane eleman oldugunu bulan kodu yazmaliyiz

        int toplamElemanSayisi = 0;
        for(int[] w:numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);


        //2.step : Tek boyutlu arrayi ikiboyutlu arrayin eleman sayisini kullanarak olusturmaliyiz

        int newArr [] = new int[toplamElemanSayisi];

        //3.step : Iki boyutlu arraydeki elemanlari tek boyutlu array e transfer etmeliyiz.

        int idx=0; //Loop icinde indexe ihtiyac duyduk hemen yukarida tanimladik. indexler 0'dan basladigi icin =0 dedik.

        for(int[] w:numbers){//outer loop ile multi dimensional int array elamanlarini tek tek aliriz

            for (int k:w){//loop ile w sepetine koymuş olduğumuz array in elemanlarini tek tek aliriz
                newArr[idx]=k;//yeni olusturdugumuz array e index kullanarak atama yapiyoruz
                idx++;//bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }
        System.out.println(Arrays.toString(newArr));



    }
}