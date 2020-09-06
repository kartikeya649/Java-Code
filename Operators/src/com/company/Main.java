package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result=1+2;
        System.out.println("1+2:"+result);
        int previousResult=result;
        System.out.println("PreviousResult:"+ previousResult);

        result-=1;
        System.out.println("3-1:"+result);
        System.out.println("PreviousResult:"+previousResult);

        result*=10;
        System.out.println("2*10:"+result);

        result/=5;
        System.out.println("20/5:"+result);

        result%=3;
        System.out.println("4%3:"+result);

        result++;
        System.out.println("1+1:"+result);

        result--;
        System.out.println("2-1:"+result);

        result+=2;
        System.out.println("1+2:"+result);

        result*=10;
        System.out.println("3*10:"+result);

        result/=3;
        System.out.println("30/3:"+result);

        result-=2;
        System.out.println("10-2:"+result);

        boolean isAlien=false;
        if (isAlien==false) {
            System.out.println("This isn't Alien!");
            System.out.println("I am very Scared.");
        }

        int topScore=80;
        if (topScore<=100){
            System.out.println("You got High Score!");
        }

        int secondTopScore=90;
        if(topScore<secondTopScore && topScore<100){
            System.out.println("Greater than second top score & less than 100");
        }

        int thirdTopScore=70;
        if(thirdTopScore >60 || thirdTopScore<secondTopScore){
            System.out.println("Less than Second top score & greater than 60");
        }

        boolean isCar=false;
        if (!isCar){
            System.out.println("This isn't Happen");
        }

        boolean wasCar=isCar?false:true;
        if (wasCar){
            System.out.println("WasCar is True");
        }
        //Adding Challnge
        double newFirstDouble=20.00;
        double newSecondDouble=80.00;
        double newFinalDouble=(newFirstDouble+newSecondDouble)*100;
        System.out.println("My Total Value:"+newFinalDouble);

        double Remainder=newFinalDouble % 40.00;
        System.out.println("Remainder is:"+Remainder);

        boolean challange=Remainder==0?true:false;
        System.out.println(challange);
        if (!challange){
            System.out.println("Get Some Remainder");
        }


    }

}
