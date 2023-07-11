public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee("Emre" , 1500 , 45 , 2000);
        obj.printScreen();
        obj.tax();
        obj.printScreen();
        obj.bonus();
        obj.printScreen();
        obj.raiseSalary();
        obj.printScreen();
    }

}