package machine;

import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Status = {400, 540 , 120 ,9 , 550};
        boolean Aval;
        boolean exit = false;


       while (!exit) {
           System.out.println("Write action (buy, fill, take, remaining, exit)");
           String action = scanner.next();
           switch (action) {
               case "buy":
                   System.out.println("What do you want to buy?" +
                           " 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back :");
                   String coffeeType = scanner.next();
                   Aval = machineCheck(coffeeType, Status);
                   if (Aval)
                       System.out.println("I have enough resources, making your coffee!");
                   else {
                       System.out.println("Sorry can't make it!");
                       break;
                   }
                   Status = buyCoffee(coffeeType, Status);
               //    machineStatus(Status);
                   break;
               case "fill":
                   int[] fill = new int[4];
                   System.out.println("Write how many ml of water do you want to add:");
                   fill[0] = scanner.nextInt();
                   System.out.println("Write how many ml of milk do you want to add:");
                   fill[1] = scanner.nextInt();
                   System.out.println("Write how many grams of coffee do you want to add:");
                   fill[2] = scanner.nextInt();
                   System.out.println("Write how many disposable cups of coffee do you want to add:");
                   fill[3] = scanner.nextInt();
                   Status = fillMachine(Status, fill);
                //   machineStatus(Status);
                   break;
               case "take":
                   System.out.println("I gave you " + Status[4]);
                   Status[4] -= Status[4];
                   break;
               case "remaining":
                   machineStatus(Status);
                   break;
               case "exit":
                   exit = true;
                   break;
           }
       }
    }

    public static void  machineStatus(int[] Status) {
        System.out.println("The coffee machine has:");
        System.out.println(Status[0] + " of water");
        System.out.println(Status[1] + " of milk");
        System.out.println(Status[2] + " of coffee beans");
        System.out.println(Status[3] + " of disposable cups");
        System.out.println(Status[4] + " of money");
    }
    public static int[] buyCoffee(String coffeeType, int[] Status ){
        switch (coffeeType) {
            case "1":
                Status[0]-=250;
                Status[2]-=16;
                Status[3]-=1;
                Status[4]+=4;
                break;
            case "2":
                Status[0]-=350;
                Status[1]-=75;
                Status[2]-=20;
                Status[3]-=1;
                Status[4]+=7;
                break;
            case "3":
                Status[0]-=200;
                Status[1]-=100;
                Status[2]-=12;
                Status[3]-=1;
                Status[4]+=6;
                break;
            case "back":
                break;

        }
        return Status;
    }
    public static int[] fillMachine(int[] Status, int[] Fill) {
        Status[0]+=Fill[0];
        Status[1]+=Fill[1];
        Status[2]+=Fill[2];
        Status[3]+=Fill[3];

    return Status;
    }
    public static boolean machineCheck(String coffeeType, int[] Status) {
        boolean Aval;
        switch (coffeeType){
            case "1":
                if ((Status[0]>=250)&&(Status[2]>=16)&&(Status[3]>=1))
                    Aval=true;
                else Aval = false;
                break;
            case "2":
                if ((Status[0]>=350)&&(Status[1]>=75)&&(Status[2]>=20)&&(Status[3]>=1))
                Aval=true;
            else Aval = false;
                break;
            case "3":
                if ((Status[0]>=200)&&(Status[1]>=100)&&(Status[2]>=12)&&(Status[3]>=1))
                    Aval=true;
                else Aval = false;
                break;
            default: Aval=false;

        }

        return Aval;
    }
}

