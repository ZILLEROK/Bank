import java.util.Scanner;

public class tank {
    private static Scanner sc = new Scanner(System.in);
    static int tanks;
    static int thickness;
    static int wheels;
    public static void main(String[] args) {
        caterpillars();
        body();
        head();
        gun();


    }

    public static void caterpillars(){
        System.out.println("Введите количество колёс");
        wheels = sc.nextInt();
        System.out.println("Количество колёс "+wheels);

    }
    public static void body(){

        System.out.println("Выберите тип техники 1 - ПТСАУ, 2 - Танк");
        tanks = sc.nextInt();
        switch (tanks){
            case 1:
                System.out.println("Корпус без башни");
                break;
            case 2:
                System.out.println("Корпус с башней");
                break;
        }
    }
    public static void head(){

        if(tanks==1){

        }
        if(tanks==2){
            System.out.println("Введите толщину");
            int thickness=sc.nextInt();
            System.out.println("Толщина = " + thickness);
        }
    }
    public static void gun(){
        switch (tanks){
            case 1:
                System.out.println("Большая пушка");
                break;
            case 2:
                System.out.println("Средняя пушка");
                break;
        }
    }
}
