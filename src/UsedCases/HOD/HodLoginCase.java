package UsedCases.HOD;

import Application.SelectOption;
import Bean.Hod;
import Dao.HodDao;
import Dao.HodDaoImpl;
import Exception.HodException;
import java.util.Scanner;

public class HodLoginCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Email Id");
        String email=sc.next();

        System.out.println("Enter Password");

        String pass=sc.next();

        HodDao dao=new HodDaoImpl();

        try {
         Hod   hod = dao.HodLogin(email,pass);
            System.out.println("Welcome Deepak");
            SelectOption.hodSelectOption();
        } catch (HodException e) {
            System.out.println(e.getMessage());
            SelectOption.selectOption();
        }


    }
}
