public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        short clientDeviceYear = 2015;
        byte clientOS = 0;
        if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if(clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        short year = 2021;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        byte deliveryTime;
        if (deliveryDistance < 20){
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }else if(deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }else if(deliveryDistance >= 60 && deliveryDistance < 100){
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }else{
            System.out.println("Доставки нет.");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        byte monthNumber = 11;
        switch (monthNumber){
            case 1:
                System.out.println("1-й месяц (январь) принадлежит к сезону зимма");
                break;
            case 2:
                System.out.println("2-й месяц (февраль) принадлежит к сезону зимма");
                break;
            case 3:
                System.out.println("3-й месяц (март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("4-й месяц (апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("5-й месяц (май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("6-й месяц (июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7-й месяц (июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8-й месяц (август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9-й месяц (сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10-й месяц (октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11-й месяц (ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12-й месяц (декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("Номер месяца больше 13");
        }

    }
}