package UsedCases.HOD;

import Bean.Hod;
import Dao.HodDao;
import Dao.HodDaoImpl;

import java.util.Scanner;

public class HodLoginCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Email Id");
        String email=sc.next();

        System.out.println("Enter Password");

        String pass=sc.next();

        HodDao dao=new HodDaoImpl();
        Hod hod=dao.HodLogin(email,pass);
        if(hod!=null){
            System.out.println("Welcome Deepak");
        }else {
            System.out.println("Email or Password is not correct");
        }
    }
}
