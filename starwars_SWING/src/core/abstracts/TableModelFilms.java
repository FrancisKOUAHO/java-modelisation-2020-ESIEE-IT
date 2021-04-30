package core.abstracts;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import starwars.classes.Film;

public class TableModelFilms extends AbstractTableModel {

    private ArrayList<Film> filmsArrayList;
    private String[] columns;

    public TableModelFilms(ArrayList<Film> daoFilmList) {
        super();
        filmsArrayList = daoFilmList;
        columns = new String[]{"ID", "Titre", "Année", "Nb épisode", "Coût", "Recette", "Bénéfice"};
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Film film = filmsArrayList.get(row);
        switch (col) {
            case 0:
                return film.getId();
            case 1:
                return film.getTitre();
            case 2:
                return film.getAnneeDeSortie();
            case 3:
                return film.getNumeroEpisode();
            case 4:
                return film.getCout();
            case 5:
                return film.getRecette();
            case 6:
                double benefice = (double) film.calculBenefice().get(1);
                return benefice;
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
        return filmsArrayList.size();
    }


}