    // deklarasi parent class orang
    class Person {
        String name = "Suryania";
        int age     = 22;
    }

    // deklarasi turunan class pekerja
    class Employee extends Person {
        float salary = 4000;
        String name  = "Diana";
        int age      = 23;

        int sal = (int)salary;
        public void showInfo(){
            System.out.println("Name    : " + super.name); //memanggil variabel pada parent class
            System.out.println("Age     : " + super.age);
            System.out.println("Salary  : " + sal);
        }
    }

    // main program
    public class Latihan06b{
        public static void main(String[] args)
        {
            Employee Suryania = new Employee();

            Suryania.showInfo();
        }
    }
