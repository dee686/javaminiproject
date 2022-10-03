package Dao;

import Bean.Complain;
import Bean.Engineer;
import Bean.Hod;
import Exception.HodException;
import com.masai.util.Dbutill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HodDaoImpl implements HodDao {
    @Override
    public Hod HodLogin(String Email, String pass) {

        Hod hod=null;
        try (Connection conn= Dbutill.provideConnection()){
            PreparedStatement ps= conn.prepareStatement("Select * from HOD where HODEmail =? AND HODPassword =?");
            ps.setString(1,Email);
            ps.setString(2,pass);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                String n= rs.getString("HODName");
                String e= rs.getString("HODEmail");
                String p=rs.getString("HODPassword");
                String a=rs.getString("Address");

                hod=new Hod(n,e,p,a);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String EngineerRegister(int id, String name, String email, String pass, String cat) throws HodException {
        String message="Not Inserted";

        try (Connection conn=Dbutill.provideConnection()){

            PreparedStatement ps= conn.prepareStatement("insert into Engineer values(?,?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,email);
            ps.setString(4,pass);
            ps.setString(5,cat);

            int x= ps.executeUpdate();

            if(x>0){
                message="Engineer Registered  Successfully";
            }else {
                throw new HodException("Some of the Information is not inserted Correct");
            }

        } catch (SQLException e) {
            throw new HodException(e.getMessage());
        }

        return message;
    }

    @Override
    public List<Engineer> EngineerList() throws HodException{

        List <Engineer> engineers=new ArrayList<>();

        try (Connection conn=Dbutill.provideConnection()){

            PreparedStatement ps= conn.prepareStatement("Select * from Engineer");
            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                int id=rs.getInt("ENId");
                String n= rs.getString("ENName");
                String c= rs.getString("ENCategory");
                String e= rs.getString("ENEmail");
                String p= rs.getString("ENNPassword");

                Engineer engineer=new Engineer(id,n,e,p,c);
                engineers.add(engineer);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
            if (engineers.size()==0){
                throw new HodException("No Engineers Registered");
            }
        return engineers;
    }



    @Override
    public String EngDelete(String name) {

        String message="Not Deleted";

        try (Connection conn=Dbutill.provideConnection()){
            PreparedStatement ps=conn.prepareStatement("DELETE FROM Engineer WHERE ENName=?");

            ps.setString(1,name);
            int x= ps.executeUpdate();

            if(x>0){
                message="Engineer Deleted Successfully ";
            }else{
                message ="Some of the information not correct";
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return message;
    }



    @Override
    public List<Complain> ViewComplain() throws HodException {

        List <Complain> complains=new ArrayList<>();
        try (Connection conn=Dbutill.provideConnection()){

            PreparedStatement ps=conn.prepareStatement("Select * from Complain");

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                int id=rs.getInt("ComplainId");
                String n=rs.getString("CName");
                String c=rs.getString("Category");

                Complain complain=new Complain(id,n,c);
                complains.add(complain);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        if(complains.size()==0){

                throw new HodException("No Complain Found");

        }


        return complains;
    }

    @Override
    public String AssignProblem(int cId, int engId) {

        String message="Not assigned";

        try (Connection conn=Dbutill.provideConnection()){

            PreparedStatement ps=conn.prepareStatement("Update EngineerComplainDTO set EComplainId=? Where ENId=?");
            ps.setInt(1,engId);
            ps.setInt(2,cId);

            int x= ps.executeUpdate();

            if(x>0){
                message="Complain Is successfully assigned";
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return message;
    }
}
