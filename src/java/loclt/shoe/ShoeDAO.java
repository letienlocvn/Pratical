/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loclt.shoe;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import loclt.helper.DBHelper;

/**
 *
 * @author WIN
 */
public class ShoeDAO implements Serializable{
    List<ShoeDTO> listShoe;

    public List<ShoeDTO> getListShoe() {
        return listShoe;
    }
    public void searchShoe(String searchValue) throws SQLException, NamingException{
         
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null){
                String sql = "Select * from tbl_Shoe "
                        + "where name like ?";                
                stm = con.prepareStatement(sql);
                stm.setString(1, "%"+searchValue+"%");
                
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String description = rs.getString("descreption");
                    float price = rs.getFloat("price");
                    int size = rs.getInt("size"); 
                    int quanity = rs.getInt("quanity");
                    ShoeDTO dto = new ShoeDTO(id, name, description, price, size, quanity);
                    if (this.listShoe == null){
                        this.listShoe = new ArrayList<>();
                    }
                    listShoe.add(dto);
                }
            }
        } finally {
            if (rs != null){
                rs.close();
            }
            if (stm != null){
                stm.close();
            }
            if(con != null){
                con.close();
            }
        }
    }
}
