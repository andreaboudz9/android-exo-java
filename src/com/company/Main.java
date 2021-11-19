package com.company;

public class Main {

    public static void main(String[] args) {
        Profil profils[] = new Profil[3];
        profils[0] = new Profil("MN", "Manager");
        profils[1] = new Profil("DG", "Directeur");
        profils[2] = new Profil("EE", "Employe");

        Utilisateur users[] = new Utilisateur[3];

        users[0] = new Utilisateur("SAFI", "Samir", "safi [AT] gmail [DOT] com", "benin",
                "05475434", 10000, "login", "password", "service", profils[0]);
        users[1] = new Utilisateur("BOUDZOUMOU", "Andrea", "andrea [AT] gmail [DOT] com", "benin",
                "02469435", 20000, "login", "password", "service", profils[1]);
        users[2] = new Utilisateur("TOTO", "amal", "toto [AT] gmail [DOT] com", "benin",
                "064853439", 5000, "login", "password", "service", profils[2]);

        System.out.println("La liste des utilisateurs : ");
        for (Utilisateur u : users) {
            u.affiche();
        }
        System.out.println();
        System.out.println("Liste des managers  : ");

        for (Utilisateur u : users) {
            if (u.getProfil().getLibelle().equalsIgnoreCase("manager"))
                u.affiche();
        }
    }
}
