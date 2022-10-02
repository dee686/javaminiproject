package UsedCases.Engineer;
import Exception.HodException;
import Bean.Complain;
import Dao.HodDao;
import Dao.HodDaoImpl;

import java.util.List;

public class ComplainViewCase {

    public static void main(String[] args) {
        System.out.println("List Of Complains");

        HodDao dao=new HodDaoImpl();
        try {
            List<Complain> complains=dao.ViewComplain();

            complains.forEach(c -> System.out.println(c));
        } catch (HodException e) {
            System.out.println(e.getMessage());;
        }
    }
}
