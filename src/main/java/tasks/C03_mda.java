package mda02;

public class C03_mda {
    public static void main(String[] args) {
        /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */
        int arr[][]={{3,9,11},{45,24,67},{13,46,78},{99,32,23,65}};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                if (i==j){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println(toplam);




    }
}