package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FilmSaisi", urlPatterns = {"/FilmSaisi"})
public class FilmSaisi extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<title>Servlet FilmSaisi</title>"
                    + "</head>"
                    + "<body>"
                    + "<div class=\"container\">"
                    + "<div class=\"row\">"
                    + "<div class=\"col-12\">"
                    + "<h1>Saisir un film <small style=\"font-size:16px;\"><a href=\"/2020-java-modelisation-web/\">[accueil]</a></small></h1>"
                    + "<hr>"
                    + "<form method=\"post\" action=\"FilmSaisiResultat\">"
                    + "<label for=\"basic-url\" class=\"form-label\">Nom du film</label>"
                    + "<input type=\"texte\" class=\"form-control\" name=\"FilmTitre\" placeholder=\"(String)\"/>"
                    + "<br>"
                    + "<label for=\"basic-url\" class=\"form-label\">Année de sortie du film</label>"
                    + "<input type=\"texte\" class=\"form-control\" name=\"FilmAnneeDeSortie\" placeholder=\"(String)\"/>"
                    + "<br>"
                    + "<label for=\"basic-url\" class=\"form-label\">Numéro du film</label>"
                    + "<input type=\"texte\" class=\"form-control\" name=\"FilmNumeroEpisode\" placeholder=\"(int)\"/>"
                    + "<br>"
                    + "<label for=\"basic-url\" class=\"form-label\">Coût du film</label>"
                    + "<input type=\"texte\" class=\"form-control\" name=\"FilmCout\" placeholder=\"(double)\"/>"
                    + "<br>"
                    + "<label for=\"basic-url\" class=\"form-label\">Recette du film</label>"
                    + "<input type=\"texte\" class=\"form-control\" name=\"FilmRecette\" placeholder=\"(double)\"/>"
                    + "<br>"
                    + "<input type=\"submit\" class=\"btn btn-success\" name=\"submit\" value=\"Valider\"/>"
                    + "</form>"
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
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
