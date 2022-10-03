package UsedCases.Employee;
import Application.SelectOption;
import Exception.EmployeeComplainException;
import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

import java.util.Scanner;

public class EmployeeLoginCase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email");
        String Email=sc.next();
        System.out.println("Enter Password");
        String Pass= sc.next();

        EmployeeDao dao=new EmployeeDaoImpl();

        try {
            Employee emp=dao.EMPLOYEELogin(Email,Pass);
            System.out.println("Welcome "+emp.getEmpName());
            SelectOption.EmployeeSelectOption();
        } catch (EmployeeComplainException e) {
            System.out.println(e.getMessage());
            SelectOption.selectOption();
        }

    }
}
