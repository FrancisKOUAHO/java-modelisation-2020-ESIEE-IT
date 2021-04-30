package controllers;

import fr.starwars.Console;
import models.DAOFilm;
import models.Film;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FilmMiseAJour", urlPatterns = {"/FilmMiseAJour"})
public class FilmMiseAJour extends HttpServlet {

    private int filmIdSelectionne = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Console.print("[Suppression d'un film]");
        if (!request.getParameter("modifier").isEmpty() && "modifier".equals(request.getParameter("modifier"))) {
            try {
                Console.print(request.getParameter("filmIdSelectionne"));
                this.filmIdSelectionne = Integer.parseInt(request.getParameter("filmIdSelectionne"));
                Console.print("id : " + this.filmIdSelectionne);

                String requetSQL = "SELECT * FROM films WHERE id=" + filmIdSelectionne + "";
                DAOFilm daoFilm = new DAOFilm();
                ArrayList daoFilmList = new ArrayList();
                daoFilmList.addAll(daoFilm.listReadingArrayList(requetSQL));

                Film film = (Film) daoFilmList.get(0);
                int filmId = film.getId();
                String filmTitre = film.getTitre();
                String filmAnneeDeSortie = film.getAnneeDeSortie();
                int filmNumeroEpisode = film.getNumeroEpisode();
                double filmCout = film.getCout();
                double filmRecette = film.getRecette();

                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                    out.println("<!DOCTYPE html>"
                            + "<html>"
                            + "<head>"
                            + "<title>Servlet FilmMiseAJour</title>"
                            + "</head>"
                            + "<body>"
                            + "<div class=\"container\">"
                            + "<div class=\"row\">"
                            + "<div class=\"col-12\">"
                            + "<h1>Mettre à jour un film <small style=\"font-size:16px;\"><a href=\"/2020-java-modelisation-web/\">[accueil]</a></small></h1>"
                            + "<hr>"
                            + "<form method=\"post\" action=\"FilmSaisiResultat\">"
                            + "<input type=\"text\" name=\"FilmId\" value=\"" + filmId + "\" hidden />"
                            + "<label for=\"basic-url\" class=\"form-label\">Nom du film</label>"
                            + "<input type=\"texte\" class=\"form-control\" name=\"FilmTitre\" placeholder=\"(String)\" value=\"" + filmTitre + "\"/>"
                            + "<br>"
                            + "<label for=\"basic-url\" class=\"form-label\">Année de sortie du film</label>"
                            + "<input type=\"texte\" class=\"form-control\" name=\"FilmAnneeDeSortie\" placeholder=\"(String)\" value=\"" + filmAnneeDeSortie + "\"/>"
                            + "<br>"
                            + "<label for=\"basic-url\" class=\"form-label\">Numéro du film</label>"
                            + "<input type=\"texte\" class=\"form-control\" name=\"FilmNumeroEpisode\" placeholder=\"(int)\" value=\"" + filmNumeroEpisode + "\"/>"
                            + "<br>"
                            + "<label for=\"basic-url\" class=\"form-label\">Coût du film</label>"
                            + "<input type=\"texte\" class=\"form-control\" name=\"FilmCout\" placeholder=\"(double)\" value=\"" + filmCout + "\"/>"
                            + "<br>"
                            + "<label for=\"basic-url\" class=\"form-label\">Recette du film</label>"
                            + "<input type=\"texte\" class=\"form-control\" name=\"FilmRecette\" placeholder=\"(double)\" value=\"" + filmRecette + "\"/>"
                            + "<br>"
                            + "<input type=\"submit\" class=\"btn btn-success\" name=\"update\" value=\"Update\"/>"
                            + "</form>"
                            + "</div>"
                            + "</div>"
                            + "</div>"
                            + "</body>"
                            + "</html>"
                            + "");
                }
            } catch (Exception e) {
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
