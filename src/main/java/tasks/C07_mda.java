package mda02;

public class C07_mda {
    public static void main(String[] args) {
        /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */
        int [][]sayilar={{1,6,3,2,0},{4,5},{6, 7},{11,55,12,10},{77,11,55,65,23,32}};
        double ort=0;
        double toplam=0;
        for (int []a:sayilar
        ) {
            for (int w:a
            ) {
                toplam+=w;
            }ort=toplam/a.length;
            for (int e:a
            ) {
                if (e>ort){
                    System.out.print(e+" ");
                }
            }

            System.out.println("\n"+ort);
            System.out.println("-----------------------");
            ort=0;
            toplam=0;


        }


    }
}