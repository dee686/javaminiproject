package UsedCases.Engineer;

import Application.SelectOption;
import Bean.Engineer;
import Dao.EngineerDao;
import Dao.EngineerDaoImpl;
import Exception.EngineerException;

import java.util.Scanner;

public class EngLoginCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Email");

        String email=sc.next();

        System.out.println("Enter Password");
        String password= sc.next();

        EngineerDao dao=new EngineerDaoImpl();

        try {
           Engineer engineer= dao.EngineerLogin(email,password);

            System.out.println("Welcome : "+engineer.getEngName());
            SelectOption.EngSelectOption();
        } catch (EngineerException e) {
            System.out.println(e.getMessage());
            SelectOption.selectOption();
        }

    }


}
