package day03methodobjectcreationscanner;

import day03methodObjectCreationScanner.Teacher;

public class Runner {

    public static void main(String[] args) {
//Object nasil olusturulur
//new keywordu sifirdan yeni bir object olusturmak icin kullanilir
//Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur
//Class ismi  +  Object ismi  +  Assignment Operator +  "new" keywordu  +  Constructor
        Car             myCar               =               new            Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();


        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();

        Teacher aliHan = new Teacher();
        System.out.println("aliHan.isim = " + aliHan.isim);
        System.out.println("aliHan.yas = " + aliHan.yas);
        aliHan.teach();



    }


    //homework
    ////Homework
    //icinde isim ve yas variablelari ile teach methoduda bulunan bir teacher
    //objesi olusturun ve ve obje uzerinde bu ozellikleri kullanin

}