package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(4,5,6);
	    Case newCase = new Case("220","Dell","240",dimensions);

        Monitor theMonitor =new Monitor("27inch Beast","Acer",27,new Resolution(2540,
                1440));
        MotherBoard themotherBoard = new MotherBoard("BJ-200","ASUS",4,5,"v2.44");
        PC thePC = new PC(newCase,theMonitor,themotherBoard);
        thePC.powerUp();


    }
}
