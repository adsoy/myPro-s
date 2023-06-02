package mda02;

public class C05_mda {
    public static void main(String[] args) {
        /*
        Soru 5) Asagidaki multi dimensional array'in
        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz {{1,2,3}, {4,5}, {6}}
        */
        int [][]arr={{1,2,3}, {4,5}, {6}};
        int carpim=1;
        for (int a[]:arr
        ) {
            carpim*=a[a.length-1];
        }
        System.out.println(carpim);
        carpim=1;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                if (j==arr[i].length-1){
                    carpim*=arr[i][j];
                }
            }
        }
        System.out.println(carpim);
    }
}