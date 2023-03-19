public class Main {
    public static void main(String[] args)
    {
        employee emp1= new employee();
        manager emp2= new manager();
        emp1.name="Santhosh";
        emp1.age=19;
        emp1.phone="0987654321";
        emp1.add="Salem";
        emp1.salary="50k";
        emp1.Specialization="Data Science";
        System.out.println(emp1.name+"\n"+emp1.age+"\n"+emp1.phone+"\n"+emp1.add+"\n"+emp1.Specialization);
        emp1.printSalary();
        System.out.println("\n");
        emp2.name="Saran";
        emp2.age=19;
        emp2.phone="1234567890";
        emp2.add="Kallakurichi";
        emp2.salary="50k";
        emp2.Department="AI-DS";
        System.out.println(emp2.name+"\n"+emp2.age+"\n"+emp2.phone+"\n"+emp2.add+"\n"+"\n"+emp2.Department);
        emp2.printSalary();

    }
}