package Dao;
import Bean.Complain;
import Bean.Engineer;
import Bean.EngineerComplainDTO;
import Exception.EngineerException;
import Exception.EngineerComplainException;

import java.util.List;

public interface EngineerDao {

    public Engineer  EngineerLogin(String email, String Password)throws EngineerException;
    public List<EngineerComplainDTO> ViewProblem(int engId)throws EngineerComplainException;
    public String UpdateStatus(int complainId,String status);
    public String ChangePassword(String password,String email);

}
