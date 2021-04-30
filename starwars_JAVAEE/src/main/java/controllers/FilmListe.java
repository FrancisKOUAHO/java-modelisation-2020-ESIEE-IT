package controllers;

import models.DAOFilm;
import models.Film;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FilmListe", urlPatterns = {"/FilmListe"})
public class FilmListe extends HttpServlet {

    private int filmIdSelectionne = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String requetSQL = "SELECT * FROM films";
            DAOFilm daoFilm = new DAOFilm();
            ArrayList daoFilmList = new ArrayList();
            daoFilmList.addAll(daoFilm.listReadingArrayList(requetSQL));

            out.println("<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<title>Servlet FilmListe</title>"
                    + "</head>"
                    + "<body>"
                    + "<div class=\"container\">"
                    + "<div class=\"row\">"
                    + "<div class=\"col-12\">"
                    //-
                    + "<h1>Liste des films "
                    + "<small style=\"font-size:16px;\">"
                    + "<a href=\"/2020-java-modelisation-web/\">[accueil]</a>"
                    + "<a href=\"/2020-java-modelisation-web/FilmSaisi\">[saisir nouveau film]</a>"
                    + "</small>"
                    + "</h1>"
                    + "<hr>"
                    //-
                    + "<table class=\"table\">"
                    + "<thead>"
                    + "<tr>"
                    + "<th scope=\"col\">Id</th>"
                    + "<th scope=\"col\">Titre</th>"
                    + "<th scope=\"col\">Année</th>"
                    + "<th scope=\"col\">Nb épisode</th>"
                    + "<th scope=\"col\">Coût</th>"
                    + "<th scope=\"col\">Recette</th>"
                    + "<th scope=\"col\">Bénéfice</th>"
                    + "<th scope=\"col\">Modification</th>"
                    + "<th scope=\"col\">Suppression</th>"
                    + "</tr>"
                    + "</thead>"
                    + "<tbody>");

            for (Iterator it = daoFilmList.iterator(); it.hasNext(); ) {
                Film film = (Film) it.next();
                //-
                String benefice = "";
                boolean benef = (boolean) film.calculBenefice().get(0);
                if (benef == true) {
                    benefice += "En bénéfice";
                } else {
                    benefice += "En déficite";
                }
                benefice += " / " + film.calculBenefice().get(1) + "€";
                out.println(""
                        + "<tr>"
                        + "<th scope=\"row\">" + film.getId() + "</th>"
                        + "<td>" + film.getTitre() + "</td>"
                        + "<td>" + film.getAnneeDeSortie() + "</td>"
                        + "<td>" + film.getNumeroEpisode() + "</td>"
                        + "<td>" + film.getCout() + "</td>"
                        + "<td>" + film.getRecette() + "</td>"
                        + "<td>" + benefice + "</td>"
                        + "<td><form method=\"post\" action=\"FilmMiseAJour\"><input type=\"text\" name=\"filmIdSelectionne\" value=\"" + film.getId() + "\" hidden/><input type=\"submit\" class=\"btn btn-primary\" name=\"modifier\" value=\"modifier\"/></form></td>"
                        //+ "<td><a href=\"/2020-java-modelisation-web/FilmMiseAJour\" <img src=\"/2020-java-modelisation-web/img/crayon.png\" alt=\"Crayon\"/> Modifier</a></td>"
                        + "<td><form method=\"post\" action=\"FilmSuppression\"><input type=\"text\" name=\"filmIdSelectionne\" value=\"" + film.getId() + "\" hidden/><input type=\"submit\" class=\"btn btn-danger\" name=\"supprimer\" value=\"supprimer\"/></form></td>"
                        //+ "<td><a href=\"/2020-java-modelisation-web/FilmSuppression?id="+film.getId()+"\" <img src=\"/2020-java-modelisation-web/img/crayon.png\" alt=\"Crayon\"/> Supprimer</a></td>"
                        + "</tr>");
            }

            out.println(""
                    + "</tbody>"
                    + "</table>"
                    //-
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "</body>"
                    + "</html>"
                    + "");

            daoFilm.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FilmListe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FilmListe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
