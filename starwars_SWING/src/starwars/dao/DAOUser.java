package starwars.dao;

import fr.skyplus.others.Console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import starwars.classes.Acces;

public class DAOUser {

    private String bddName = "univcergy22";
    private String bddLogin = "root";
    private String bddPassword = "root";
    private String bddIP = "localhost";
    private String bddPort = "3306";
    private String bddUrl = "jdbc:mysql://" + this.bddIP + ":" + this.bddPort + "/" + this.bddName;

    private final String strClassName = "com.mysql.jdbc.Driver";
    private Statement statement;
    private Connection conn;

    public DAOUser() {
        try {
            Class.forName(this.strClassName);
            this.conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            this.statement = (Statement) conn.createStatement();
            Console.print("=> DAOFilm ready");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }


    public ArrayList listReading() throws SQLException {
        try {
            ResultSet datas = this.statement.executeQuery("SELECT * FROM acces");
            ArrayList resultDatas = new ArrayList();
            while (datas.next()) {
                Acces newAcces = new Acces(datas.getInt(1), datas.getString(2), datas.getString(3),
                        datas.getString(4), datas.getString(5), datas.getInt(6));
                resultDatas.add(newAcces);
                Console.print("->Liste OK");
            }
            conn.close();
            return resultDatas;
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
            return null;
        }
    }


    public void close() throws SQLException {
        this.conn.close();
        Console.print("[La connexion à été fermée]");
    }

    public String getBddName() {
        return bddName;
    }

    public String getBddLogin() {
        return bddLogin;
    }

    public String getBddPassword() {
        return bddPassword;
    }

    public String getBddIP() {
        return bddIP;
    }

    public String getBddPort() {
        return bddPort;
    }

    public String getBddUrl() {
        return bddUrl;
    }

    public void setBddName(String bddName) {
        this.bddName = bddName;
    }

    public void setBddLogin(String bddLogin) {
        this.bddLogin = bddLogin;
    }

    public void setBddPassword(String bddPassword) {
        this.bddPassword = bddPassword;
    }

    public void setBddIP(String bddIP) {
        this.bddIP = bddIP;
    }

    public void setBddPort(String bddPort) {
        this.bddPort = bddPort;
    }

    public void setBddUrl(String bddUrl) {
        this.bddUrl = bddUrl;
    }

}