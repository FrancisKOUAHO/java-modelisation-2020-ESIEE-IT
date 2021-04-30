package fr.skyplus.main;

import core.abstracts.TableModelFilms;
import fr.skyplus.others.Console;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import starwars.classes.Film;
import starwars.dao.DAOFilm;

public class ViewFilmsList extends JFrame implements ActionListener {

    //-
    private String closeViewString;
    private JButton closeViewButton;
    //-
    private ArrayList<Film> daoFilmList;

    public ViewFilmsList() throws SQLException {
        super("Star Wars");

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(800, 350));
        this.setLocationRelativeTo(null);

        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());

        DAOFilm daoFilm = new DAOFilm();
        this.daoFilmList = daoFilm.listReadingArrayList();
        daoFilm.close();

        TableModel filmsTableModel = new TableModelFilms(this.daoFilmList);
        JTable usersListTable = new JTable(filmsTableModel);
        usersListTable.setPreferredScrollableViewportSize(new Dimension(780, 250));
        usersListTable.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(usersListTable);
        contentPanel.add(scrollPane);

        closeViewString = "Fermer";
        closeViewButton = new JButton(closeViewString);
        closeViewButton.addActionListener(this);
        contentPanel.add(closeViewButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if ((JButton) event.getSource() == closeViewButton) {
            Console.print("[Fermeture fenêtre]");
            this.dispose();
        }
    }

}