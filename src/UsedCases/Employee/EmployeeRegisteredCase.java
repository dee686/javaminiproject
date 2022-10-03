package UsedCases.Employee;

import Application.SelectOption;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

import java.util.Scanner;

public class EmployeeRegisteredCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter Employee Id");
        int id= sc.nextInt();

        System.out.println("Enter Employee Name");
        String name=sc.next();

        System.out.println("Enter Employee Email");
        String email=sc.next();

        System.out.println("Enter Employee Password");
        String pass=sc.next();

        EmployeeDao dao=new EmployeeDaoImpl();


        String m= dao.EmployeeRegister(id,name,email,pass);
        System.out.println(m);
        SelectOption.selectOption();
    }
}
