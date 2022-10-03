package UsedCases.Employee;

import Application.SelectOption;
import Bean.EngineerComplainDTO;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

import java.util.Scanner;
import Exception.EmployeeComplainException;
public class ViewComplainCase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Complain ID");
        int C= sc.nextInt();

        EmployeeDao dao=new EmployeeDaoImpl();

        try {
            EngineerComplainDTO Ecomp=dao.viewComplain(C);
        } catch (EmployeeComplainException e) {
            System.out.println(e.getMessage());;
        }finally {
            SelectOption.EmployeeSelectOption();
        }
    }
}
