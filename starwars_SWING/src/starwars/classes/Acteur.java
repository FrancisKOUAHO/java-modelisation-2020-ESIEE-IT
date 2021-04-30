package starwars.classes;

import java.util.ArrayList;

public class Acteur {

    private int id;
    private String nom;
    private String prenom;
    private ArrayList<Personnage> duetPersonnages = new ArrayList(1);

    public Acteur() {
    }

    public Acteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getNombrePersonnages() {
        return this.duetPersonnages.size();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public ArrayList getDuetPersonnages() {
        return duetPersonnages;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDuetPersonnages(ArrayList duetPersonnages) {
        this.duetPersonnages = duetPersonnages;
    }

    @Override
    public String toString() {
        return "\n[Acteur]"
                + "\n- id : " + this.getId()
                + "\n- nom de l'acteur : " + this.getNom()
                + "\n- prénom de l'acteur : " + this.getPrenom()
                + "\n- nombre de personnages : " + this.getNombrePersonnages();
    }
}