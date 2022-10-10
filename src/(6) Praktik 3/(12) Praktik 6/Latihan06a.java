    // deklarasi parent class pekerja 
    class Employee {
        double salary = 40000;
    }

    // deklarasi turunan class programmer
    class Programmer extends Employee {
        int bonus = 10000;
    }

    // main program
    public class Latihan06a{
        public static void main(String[] args)
        {
            Programmer Ade = new Programmer();
            System.out.println("Programmer salary   is  : " +  (int)Ade.salary);
            System.out.println("Bonus of Programmer is  : " +  Ade.bonus);
        }
    }
