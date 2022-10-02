package UsedCases.HOD;

import Dao.HodDao;
import Dao.HodDaoImpl;

import java.util.Scanner;

public class AssignProblemCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Complain Id Which You Want to Assign");
        int cid= sc.nextInt();

        System.out.println("Enter the Engineer Id");
        int enid=sc.nextInt();

        HodDao dao=new HodDaoImpl();

        String m=dao.AssignProblem(cid,enid);
        System.out.println(m);

    }
}
