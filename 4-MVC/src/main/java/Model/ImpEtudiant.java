package Model;

import Database.DBconnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImpEtudiant implements Ietudiant{
    @Override
    public List<Etudiant> getByFname(String Fname) {
        List<Etudiant> result = new ArrayList<>();
        String req = "SELECT * FROM etudiant WHERE Fname = ? ";
        try {
            PreparedStatement ps = DBconnect.GetInstance().getCon().prepareStatement(req);
            ps.setString(1, Fname);
            ResultSet res = ps.executeQuery();
            if (res.next()){
                while (res.next()) {
                    Etudiant newEtu = new Etudiant();
                    newEtu.setFname(res.getString("Fname"));
                    newEtu.setLname(res.getString("Lname"));
                    newEtu.setPromo(res.getInt("promo"));
                    newEtu.setPoints(res.getDouble("Points"));
                    result.add(newEtu);
                }
            }
            else {
                result = null;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return result;
    }
}
