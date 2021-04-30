package core.abstracts;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import starwars.classes.Acces;


public class TableModelAcces extends AbstractTableModel {

    private ArrayList<Acces> usersList;
    private String[] columns;


    public TableModelAcces(ArrayList<Acces> daoUsersList) {
        super();
        usersList = daoUsersList;
        columns = new String[]{"ID", "Prénom", "Login", "Password", "Statut", "Age"};
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Acces user = usersList.get(row);
        switch (col) {
            case 0:
                return user.getId();
            case 1:
                return user.getPrenom();
            case 2:
                return user.getLogin();
            case 3:
                return user.getPassword();
            case 4:
                return user.getStatut();
            case 5:
                return user.getAge();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        return columns[col];
    }

    @Override
    public int getRowCount() {
        return usersList.size();
    }


}