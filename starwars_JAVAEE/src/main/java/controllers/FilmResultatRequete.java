package controllers;

import fr.starwars.Console;
import models.DAOFilm;
import models.Film;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FilmSaisiResultat", urlPatterns = {"/FilmSaisiResultat"})
public class FilmResultatRequete extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String result = "Aucun résultat.";

            int filmId = 0;
            String filmTitre = "";
            String filmAnneeDeSortie = "";
            int filmNumeroEpisode = 0;
            double filmCout = 0;
            double filmRecette = 0;
            Film filmAAjouter = null;

            try {
                if (!request.getParameter("submit").isEmpty() && "Valider".equals(request.getParameter("submit"))) {
                    Console.print("Ajout d'un film demandé.");
                    try {
                        filmTitre = request.getParameter("FilmTitre");
                        filmAnneeDeSortie = request.getParameter("FilmAnneeDeSortie");
                        filmNumeroEpisode = Integer.parseInt(request.getParameter("FilmNumeroEpisode"));
                        filmCout = Double.parseDouble(request.getParameter("FilmCout"));
                        filmRecette = Double.parseDouble(request.getParameter("FilmRecette"));
                    } catch (Exception e) {
                    }
                    filmAAjouter = new Film(0, filmTitre, filmAnneeDeSortie, filmNumeroEpisode, filmCout, filmRecette);
                    DAOFilm daoFilm = new DAOFilm();
                    result = daoFilm.addFilm(filmAAjouter);
                    Console.print(result);
                } else {
                    result = "Ajout non effectué.";
                }
            } catch (Exception e) {
            }

            try {
                if (!request.getParameter("update").isEmpty() && "Update".equals(request.getParameter("update"))) {
                    Console.print("Mise à jour d'un film demandé.");
                    try {
                        filmId = Integer.parseInt(request.getParameter("FilmId"));
                        filmTitre = request.getParameter("FilmTitre");
                        filmAnneeDeSortie = request.getParameter("FilmAnneeDeSortie");
                        filmNumeroEpisode = Integer.parseInt(request.getParameter("FilmNumeroEpisode"));
                        filmCout = Double.parseDouble(request.getParameter("FilmCout"));
                        filmRecette = Double.parseDouble(request.getParameter("FilmRecette"));
                    } catch (Exception e) {
                    }
                    filmAAjouter = new Film(filmId, filmTitre, filmAnneeDeSortie, filmNumeroEpisode, filmCout, filmRecette);
                    DAOFilm daoFilm = new DAOFilm();
                    result = daoFilm.updateFilm(filmAAjouter);
                    Console.print(result);
                } else {
                    result = "Mise à jour non effectué.";
                }
            } catch (Exception e) {
            }

            out.println("<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<title>Servlet FilmSaisiResultat</title>"
                    + "</head>"
                    + "<body>"
                    + "<div class=\"container\">"
                    + "<div class=\"row\">"
                    + "<div class=\"col-12\">"
                    + "<h1>Résultat de l'ajout d'un film <small style=\"font-size:16px;\"><a href=\"/2020-java-modelisation-web/\">[accueil]</a></small></h1>"
                    + "<hr>"
                    + "" + result + ""
                    + "<br>"
                    + "<a href=\"/2020-java-modelisation-web/FilmListe\">Retour à la liste des films</a>"
                    + "</div>"
                    + "</div>"
                    + "</div>"
                    + "</body>"
                    + "</html>"
                    + "");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FilmResultatRequete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FilmResultatRequete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
