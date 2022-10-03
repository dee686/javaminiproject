package Dao;

import Bean.Complain;
import Bean.Engineer;
import Bean.EngineerComplainDTO;
import Exception.EngineerComplainException;
import com.masai.util.Dbutill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Exception.EngineerException;
public class EngineerDaoImpl implements EngineerDao{
    @Override
    public Engineer EngineerLogin(String email, String Password)throws EngineerException {

      Engineer  engineer=null;

        try (Connection conn= Dbutill.provideConnection()){
           PreparedStatement ps= conn.prepareStatement("Select * from Engineer where ENEmail =? AND ENNPassword =?");
            ps.setString(1,email);
            ps.setString(2, Password);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                int id=rs.getInt("ENId");
                String n= rs.getString("ENName");
                String e= rs.getString("ENEmail");
                String p=rs.getString("ENNPassword");
                String c=rs.getString("ENCategory");

                engineer =new Engineer(id,n,e,p,c);
            }
            else {
                throw new EngineerException("Invalid Email or Password");
            }
        }

         catch (SQLException e) {
            throw new EngineerException(e.getMessage());
        }


        return engineer;
    }

    @Override
    public List<EngineerComplainDTO> ViewProblem( int engId)throws EngineerComplainException {

        List<EngineerComplainDTO> complains=new ArrayList<>();

        try (Connection conn= Dbutill.provideConnection()){

            PreparedStatement ps= conn.prepareStatement ("Select * from EngineerComplainDTO where ENid =?");
            ps.setInt(1,engId);
            ResultSet rs=ps.executeQuery();

            while (rs.next()){
                int id=rs.getInt("ENId");
                String n= rs.getString("ENName");
                String c= rs.getString("ENCategory");
                int   cId= rs.getInt("EComplainId");
                String s= rs.getString("ComplainStatus");

               EngineerComplainDTO complain =new EngineerComplainDTO(id,n,c,cId,s);
               complains.add(complain);
            }


        } catch (SQLException  e) {
            System.out.println(e.getMessage());
        }
        if(complains.size()==0){
            throw  new EngineerComplainException("No Complain Registered");
        }

        return complains;
    }

    @Override
    public String UpdateStatus(int complainId,String status) {

        String Message= "Not Updated";
        try (Connection conn= Dbutill.provideConnection()){

            PreparedStatement ps=conn.prepareStatement
                    ("UPDATE EngineerComplainDTO set ComplainStatus =? WHERE EComplainId=?");
            ps.setInt(1,complainId);
            ps.setString(2,status);
           int x=ps.executeUpdate();

           if (x>0){
               Message="Status updated Successfully";
           }

        } catch (SQLException e) {
         Message =e.getMessage();
        }


        return Message;
    }

    @Override
    public String ChangePassword(String password,String email) {
        String message="Email which you enter doest match with our data base";

        try (Connection conn= Dbutill.provideConnection()){

            PreparedStatement ps=conn.prepareStatement("UPDATE Engineer set ENNPassword =? WHERE ENEmail=?");

            ps.setString(1,password);
            ps.setString(2,email);

            int x=ps.executeUpdate();
            if(x>0){
                message="Your password Changed Successfully";
            }
        } catch (SQLException e) {
            message=e.getMessage();
        }
        return message;
    }
}
