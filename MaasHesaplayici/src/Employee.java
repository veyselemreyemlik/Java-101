public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary , int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours =workHours;

    }
    int tax(){
        int tax = 0;
        if(salary < 1000){
            System.out.println("Vergi Uygulanmıyor.");
        }else if(salary >= 1000) {
            tax = (salary * 3) / 100;
            System.out.println("Tax : " + tax);
            return this.salary = this.salary - (this.salary * 3)/100 ;
        }
        return  0;
    }
    int bonus(){
        if(workHours > 40){
            // Fazladan çalıştığı saati bulduk.
           int fazlalik;
           fazlalik = workHours - 40 ;
            System.out.println("Bonus : " + fazlalik);
           return this.salary = this.salary + (fazlalik * 30);
        }
        return this.salary;
    }
    int raiseSalary(){
        int duration = 2021 - this.hireYear ;

        if (duration < 10){
            return this.salary = (this.salary * 5)/100 + this.salary;
        }
        else if(duration > 9 && duration< 20){
            return this.salary = this.salary + (this.salary * 10) / 100;
        }
        else if(duration > 19){
            this.salary = this.salary + (this.salary * 15) / 100;
        }
        return 0;
    }

    void printScreen (){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
    }
}
