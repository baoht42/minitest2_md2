
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Employee employees[] = new Employee[100];
        employees[0] = new FulltimeEmployee(1, "Bao", 30, "032131234", "Bao@gmail.com", 500, 100, 500000);
        employees[1] = new ParttimeEmployee(2, "Nhat", 22, "0338192413", "Nhat@gmail.com", 5);
        employees[2] = new FulltimeEmployee(3, "Dat", 24, "4148315105", "Dat@gmail.com", 500, 100, 500000);
        employees[3] = new ParttimeEmployee(4, "Toan", 20, "0141851541", "Toan@gmail.com", 6);

//        getAvgSumSalary(employees);
//        getAvgSalaryFulltime(employees);
//        getAvgSalaryParttime(employees);
//        getSumSalaryParttime(employees);
//        getCountOfBigger(employees);
//        getCountOfName(employees);
        Scanner sc = new Scanner(System.in);
        String choice;
            do {
                System.out.println("MENU: ");
                System.out.println("1. Avg Salary of all employee ");
                System.out.println("2. Avg Salary of all fulltime employee ");
                System.out.println("3. Avg Salary of all parttime employee ");
                System.out.println("4. Sum Salary of all parttime employee ");
                System.out.println("5. Count employee have salary bigger than avg of sum salary ");
                System.out.println("6. Count same name input ");
                System.out.println("7. Exit ");
                System.out.println("--Your choice: ");
                choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        getAvgSumSalary(employees);
                        break;
                    case "2":
                        getAvgSalaryFulltime(employees);
                        break;
                    case "3":
                        getAvgSalaryParttime(employees);
                        break;
                    case "4":
                        getSumSalaryParttime(employees);
                        break;
                    case "5":
                        getCountOfBigger(employees);
                        break;
                    case "6":
                        getCountOfName(employees);
                        break;
                    case "7":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            }while (!choice.equals("7"));




    }

    private static int getCountOfName(Employee[] employees) {
        int count = 0;
        System.out.println("Enter your name to count: ");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        for (Employee em1: employees
             ) {
            if (em1!= null){
                if(em1.getName().equals(inputName)){
                    count++;
                }
            }
        }
        System.out.println("Quality person have same name enter is: " + count);
        return count;
    }

    private static int getCountOfBigger(Employee[] employees) {
        int count = 0;
        double avgSumSalary = getAvgSumSalary(employees);
        for (Employee employee1:
                employees) {
            if (employee1!= null&& employee1.getPayment()>avgSumSalary){
                count++;
            }
        }
        System.out.println("Number of person have salary bigger than avg of Sum Salary: "+count);
        return count;
    }

    private static double getSumSalaryParttime(Employee[] employees) {
        double sum =0;
        for (Employee employee1 :
                employees) {
            if (employee1!= null){
                if (employee1 instanceof ParttimeEmployee){
//
                    sum +=employee1.getPayment();
                }
            }
        }
        System.out.println("Total Salary of partime employee is: " +sum);
        return sum;
    }

    private static double getAvgSalaryParttime(Employee[] employees) {
        double sum = 0;
        int count = 0;
        for (Employee employee1 :
                employees) {
            if(employee1!= null){
                if (employee1 instanceof ParttimeEmployee) {
                    sum+= employee1.getPayment();
                    count++;
                }
            }
        }
        double avgSalary = sum/count;
        System.out.println("Average Salary of Parttime employee is: "+avgSalary);
        return avgSalary;
    }

    private static double getAvgSalaryFulltime(Employee[] employees) {
        double sum = 0;
        int count = 0;
        for (Employee employee1 :
                employees) {
            if(employee1!= null){
                if (employee1 instanceof FulltimeEmployee) {
                    sum+= employee1.getPayment();
                    count++;
                }
            }
        }
        double avgSalary = sum/count;
        System.out.println("Average Salary of Fulltime Employee: "+ avgSalary);
        return avgSalary;
    }


    private static double getAvgSumSalary(Employee[] employee) {
        double sum = 0;
        int count =0;
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                count++;
                sum += employee1.getPayment();
            }
        }
        double avgSumSalary = sum/count;
        System.out.println("Total avg of Salary: " + avgSumSalary);
        return avgSumSalary;

    }
}