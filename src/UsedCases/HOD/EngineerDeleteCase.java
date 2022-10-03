package UsedCases.HOD;

import Application.SelectOption;
import Dao.HodDao;
import Dao.HodDaoImpl;

import java.util.Scanner;

public class EngineerDeleteCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Engineer name");
        String name=sc.next();

        HodDao dao =new HodDaoImpl();

        String m=dao.EngDelete(name);
        System.out.println(m);
        SelectOption.hodSelectOption();
    }
}
