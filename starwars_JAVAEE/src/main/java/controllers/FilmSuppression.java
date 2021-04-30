package controllers;

import fr.starwars.Console;
import models.DAOFilm;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FilmSuppression", urlPatterns = {"/FilmSuppression"})
public class FilmSuppression extends HttpServlet {

    private int filmIdSelectionne = 0;
    private String suppressionStatut = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Console.print("[Suppression d'un film]");
        if (!request.getParameter("supprimer").isEmpty() && "supprimer".equals(request.getParameter("supprimer"))) {
            try {
                Console.print(request.getParameter("filmIdSelectionne"));
                this.filmIdSelectionne = Integer.parseInt(request.getParameter("filmIdSelectionne"));
                Console.print("id : " + this.filmIdSelectionne);
                DAOFilm daoFilm = new DAOFilm();
                suppressionStatut = daoFilm.deleteFilm(filmIdSelectionne);
            } catch (Exception e) {
            }
        }

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
                    + "[id] = " + this.filmIdSelectionne
                    + "<br>"
                    + "[Statut suppresions] = " + this.suppressionStatut
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
    }// </editor-fold>

}
