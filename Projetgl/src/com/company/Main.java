package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public  class Main {

    public static void menuprincipale() {
        System.out.print("\n***************Actions possibles**************\n " +
                "1) Valider Livraison d'une commande\n " +
                "2) Envoyer demmande d'avis au client\n " +
                "3) Visualiser Les Statestiques\n " +
                "4) Gérer les Consomable\n " +
                "5) Gérer les employés\n" +
                "6) Recherche les  client\n " +
                "7) Ajouter Ingredient/Methode de préparation\n" +
                "8) valider l'affectation a une commande\n" +
                "9) afficher toutes les commandes:\n"+
                "10)LogOut\n*****************************\n " +
                "Votre choix est  :");
    }

    public static void menudemandeavis() {
        System.out.print("\n\t1) Envoyer par SMS\n\t" +
                "2) Envoyer par Email" +
                "0) return menu principale\n" +
                "\n\t Votre choix : ");
    }

    public static void staticmenu() {
        System.out.print("\n\t1) Chifre mensuel\n\t" +
                "2) les 5 Plats les plus comandé\n\t" +
                "3) Nombre de commande d'un client" +
                "0) return menu principale\n" +
                " \n\t Votre choix : ");
    }

    public static void consomable() {
        System.out.print("\n\t1) Ajouter un Consomable\n\t" +
                "2) Suprimer un Consomable\n\t" +
                "3) Rechercher un Consomable\n\t" +
                "0)return menu\n\t Votre choix : ");
    }

    public static void ajouterconsomable() {
        System.out.println("\n\n\tAjouter un(e) \n\t  " +
                "1) Plat\n\t  " +
                "2) Boisson\n\t" +
                "0)return \n" +
                " Votre choix : ");
    }

    public static void gereremployes() {
        System.out.print("\n\t1) Ajouter un Employé\n\t" +
                "2) Rechercher un Employé\n\t " +
                "0) return menu principale\n" +
                "Votre choix : ");
    }

    public static void ingremethode() {
        System.out.print("\n Ajouter :\n " +
                "1) Ingredient\n " +
                "2) Methode de préparation\n" +
                "0) return menu principale\n" +
                "  Votre choix : ");
    }

    public static void visiter() {
        System.out.print("\n******Actions possibles******\n " +
                "1) Affichier Fiche technique du plat du jour\n " +
                "2) Consulter la liste de marchandise\n " +
                "3) Simuler un montant de commande\n" +
                "4) Quitter\n" +
                "*****************************\n " +
                "Votre choix :");

    }

    public static void client() {
        System.out.print("\n******Actions possibles******\n " +
                "1) Affichier Fiche technique du plat du jour\n " +
                "2) Consulter la liste de marchandise\n " +
                "3) Simuler un montant de commande\n" +
                "4) Gérer mon panier\n" +
                "5) Passer Commande\n" +
                "6) Suivre progres d'un de mes commande\n" +
                "7) Noter un service\n" +
                "8) Confirmer la réception d'une livraison\n" +
                "9)Quitter\n" +
                "*****************************\n " +
                " Votre choix : ");
    }

    public static void livreur() {
        System.out.print("Valider l'affectation a une livraison ?\n  " +
                "1) Oui\n" +
                "2) Quitter\n " +
                "Votre choix : ");
    }

    public static void main(String[] args) throws IOException {

        int j, z, w, x, ii;
        String id = null;
        boolean exit = false, exite = false, ex = false;

        Scanner csint = new Scanner(System.in);
        Scanner cs = new Scanner(System.in);

        BDD bdd = new BDD();
        bdd.installationbdd();
        user u = new user();
        while (!ex) {
            menu1:
            {
                System.out.print(
                        "1) Visiter \n" +
                        "2) Se connecter\n" +
                        "3) Sign Up\n" +
                        "4) fermer logiciel\n" +
                        " Votre choix : ");
                j = csint.nextInt();
                switch (j) {
                    case 1:
                        while (!exite) {
                            visiter:
                            {
                                visiter();


                                z = csint.nextInt();
                                while (z < 1 || z > 4) {
                                    System.out.print("Donner un choix valide entre 1 et 4\n");
                                    z = csint.nextInt();
                                }


                                switch (z) {


                                    case 1:
                                        bdd.PlatDuJours.ToString();
                                        System.out.print("Entrer un charactere pour continuer : ");
                                        id = cs.next();
                                        break;
                                    case 2:
                                        System.out.print("  1) Rechercher boisson\n  2) Consulter liste des plats offerts \n 0) retour :");
                                        w = csint.nextInt();
                                        switch (w) {
                                            case 0:
                                                break visiter;
                                            case 1:
                                                System.out.print("Quel type de boisson voullez vous afficher : \n" +
                                                        "   Café\n" +
                                                        "   Thé\n" +
                                                        "   Lait\n" +
                                                        "   Tizane\n" +
                                                        "   Gazeuze\n" +
                                                        "   Milkshake\n" +
                                                        "   Jus\n" +
                                                        "   Chocolat Chaud\n" +
                                                        "   Eau\n" +
                                                        "   Créme\n" +
                                                        "   Votre choix :  ");
                                                String type = cs.next();
                                                bdd.affichertypeboisson(type);
                                                break;
                                            case 2:
                                                System.out.print("  1) Rechercher Par nom\n" +
                                                        "  2) Rechercher Par Spécialité culinaire\n" +
                                                        " 0) retour \n" +
                                                        " Votre choix : ");
                                                x = csint.nextInt();
                                                switch (x) {
                                                    case 0:
                                                        break visiter;
                                                    case 1:
                                                        System.out.print("\n\n\t\t  Donner le nom du plat : ");
                                                        id = cs.next();
                                                        System.out.print("\n\n\t\t  Les Plats Ayant ce nom ");

                                                        if (bdd.chercheplat(id) != null) ;
                                                    {
                                                        Plat p = bdd.chercheplat(id);
                                                        System.out.println(p.toString());
                                                    }
                                                    break;


                                                    case 2:
                                                        System.out.print("\n\n\t Choisissez la spécialité culinaire : \n\t  1) Oriental\n\t  2) Occitental\n\t  3) Traditionnelle\n\t  4) Asiatique\n\t  5) Kabyle\n\t  6) hindie\n\t  7) Autre\n\t   Votre choix : ");
                                                        String sp = csint.next();
                                                        bdd.afficherspécialitéculinaire(sp);
                                                        break;
                                                }
                                                break;
                                        }
                                        break;


                                    case 3:

                                        bdd.Simulermontantcommande();
                                        break;

                                }

                                if (z == 4) {
                                    exite = true;
                                    break;
                                }


                            }
                        }break;
                    case 2:

                        bdd.connexion(u);

                        System.out.print("Bienvenu " + u.getNom() + " " + u.getPrenom() + " < " + u.getTypeUser() + " >" + "\n");
                        switch (u.getTypeUser()) {
                            case Chef:


                                while (!exit) {

                                    menuprincipale:
                                    {
                                        menuprincipale();
                                        j = csint.nextInt();
                                        while (j < 1 || j > 10) {
                                            menuprincipale();
                                            System.out.print("Donner un choix valide\n");
                                            j = csint.nextInt();
                                        }


                                        switch (j) {
                                            case 1:
                                                System.out.print("Donner l'id de la commande a valider: ");
                                                id = cs.next();
                                                if (bdd.cherchecommande(id) != null)
                                                    bdd.cherchecommande(id).validercommande();

                                                break;
                                            case 2:
                                                menudemandeavis();
                                                z = csint.nextInt();
                                                switch (z) {
                                                    case 0:
                                                        break menuprincipale;

                                                    case 1:
                                                        System.out.print("\t SMS Envoyé!");
                                                        break;
                                                    case 2:
                                                        System.out.print("\t Email Envoyé!");
                                                        break;
                                                }
                                                break;
                                            case 3:
                                                staticmenu();
                                                z = csint.nextInt();
                                                switch (z) {
                                                    case 0:
                                                        break menuprincipale;

                                                    case 1:
                                                        System.out.print("\t Le Chifre mensuel : ");
                                                        break;
                                                    case 2:
                                                        bdd.platplusvendu();
                                                        break;
                                                    case 3:
                                                        System.out.print("\n\tDonner l'id du client au quel vous souhaitez consulter leur nombre de commandes : ");
                                                        id = cs.next();
                                                        ClientRégulier cl = bdd.chercherclient(id);
                                                        if (cl != null)
                                                            System.out.print("\n\t Le client " + cl.getNom() + " " +
                                                                    cl.getPrénom() + " a commander " + cl.getNbCommande() + " Plats\n");
                                                        break;

                                                }
                                                break;
                                            case 4:
                                                consomable:
                                                {
                                                    consomable();
                                                    z = csint.nextInt();
                                                    switch (z) {
                                                        case 0:
                                                            break menuprincipale;
                                                        case 1:
                                                            ajouterconsomable();
                                                            w = csint.nextInt();
                                                            switch (w) {
                                                                case 0:
                                                                    break consomable;
                                                                case 1:
                                                                    System.out.print("\n\t\tDonner un id au nouveau plat : ");
                                                                    id = cs.next();
                                                                    while (bdd.chercheidplat(id) == true) {
                                                                        System.out.print("\n\t\tid deja utilisé\n\t\t Réesseyer : ");
                                                                        id = cs.next();
                                                                    }
                                                                    System.out.print("\n\t\t Donner Respectivement le nom du plat puis son prix\n");
                                                                    bdd.ajouterplat(new Plat(id, cs.next(), natureC.valueOf(cs.next()), ConditionementC.valueOf(cs.next()),
                                                                            csint.nextInt(), null, SpCuliniére.valueOf(cs.next())));

                                                                    break;
                                                                case 2:
                                                                    System.out.print("\n\t\tDonner un id au nouveau boisson : ");
                                                                    id = cs.next();
                                                                    while (bdd.chercheidboisson(id) == true) {
                                                                        System.out.print("\n\t\tid deja utilisé\n\t\t Réesseyer : ");
                                                                        id = cs.next();
                                                                    }
                                                                    System.out.print("\n\t\t Donner Respectivement le nom du boisson puis nature puis conditionement son prix puis son type\n");
                                                                    bdd.ajouterboisson(new Boisson(id, cs.next(), natureC.valueOf(cs.next()), ConditionementC.valueOf(cs.next()),
                                                                            csint.nextInt(), null, typeBoisson.valueOf(cs.next())));

                                                                    break;
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("\n\n\tSuprimer un(e) \n\t  1) Plat\n\t  2) Boisson\n\t 0)return \n Votre choix : ");
                                                            w = csint.nextInt();
                                                            switch (w) {
                                                                case 0:
                                                                    break consomable;
                                                                case 1:
                                                                    System.out.print("\n\t\tDonner nom du plat a suprimer : ");
                                                                    String nom = cs.next();
                                                                    bdd.supplat(nom);
                                                                    break;
                                                                case 2:
                                                                    System.out.print("\n\t\tDonner nom de la boisson a suprimer : ");
                                                                    nom = cs.next();
                                                                    bdd.supboisson(nom);
                                                                    break;
                                                            }
                                                            break;
                                                        case 3:

                                                            System.out.print("\n\t\tRecherche plat par : \n\t\t 1) Nom du plat\n\t\t 2) id du plat\n\t\t 3) Spécialité culinaire \n 0)return \n\t\t Votre choix : ");
                                                            x = csint.nextInt();
                                                            switch (x) {
                                                                case 0:
                                                                    break consomable;
                                                                case 1:
                                                                    System.out.print("\n\n\t\t  Donner le nom du plat : ");
                                                                    id = cs.next();
                                                                    System.out.print("\n\n\t\t  Les Plats Ayant ce nom ");
                                                                    String nom = cs.next();
                                                                    if (bdd.chercheplat(nom) != null) ;
                                                                {
                                                                    Plat p = bdd.chercheplat(nom);
                                                                    System.out.println("- " + p.getDesignationCon() + " " + p.getIdCon() +
                                                                            " " + p.getPrixCon());
                                                                }
                                                                break;
                                                                case 2:
                                                                    System.out.print("\n\n\t\t  Donner l'id'du plat : ");
                                                                    id = cs.next();
                                                                    if (bdd.chercheplatparid(id) != null) ;
                                                                {
                                                                    Plat p = bdd.chercheplatparid(id);
                                                                    System.out.println("- " + p.getDesignationCon() + " " + p.getIdCon() +
                                                                            " " + p.getPrixCon());
                                                                }
                                                                break;

                                                                case 3:
                                                                    System.out.print("\n\n\t Choisissez la spécialité culinaire : \n\t  1) Oriental\n\t  2) Occitental\n\t  3) Traditionnelle\n\t  4) Asiatique\n\t  5) Kabyle\n\t  6) hindie\n\t  7) Autre\n\t   Votre choix : ");
                                                                    String sp = csint.next();
                                                                    bdd.afficherspécialitéculinaire(sp);
                                                                    break;
                                                            }
                                                            break;


                                                    }
                                                }
                                                    break;


                                            case 5:
                                                gereremployes:
                                                {
                                                    gereremployes();
                                                    z = csint.nextInt();
                                                    switch (z) {
                                                        case 0:
                                                            break menuprincipale;
                                                        case 1:
                                                            System.out.print("\n\t\tDonner un id au nouveau employes : ");
                                                            id = cs.next();
                                                            while (bdd.chercheidemployes(id)) {
                                                                System.out.print("\n\t\tid deja utilisé\n\t\t Réesseyer : ");
                                                                id = cs.next();
                                                            }
                                                            System.out.print("\n\t\t Donner Respectivement le nom prenom email mot depasse" +
                                                                    "type employes etat emplyes\n");
                                                            bdd.ajouteremployes(new Employé(id, cs.next(), cs.next(), cs.next(), cs.next(),
                                                                    TypeEmpolyé.valueOf(cs.next()), EtatEmployé.valueOf(cs.next())));

                                                            System.out.println("\n Employé ajouté avec succes");
                                                            break;
                                                        case 2:
                                                            System.out.print("\n\t Donner l'id de l'employé a rechercher : ");
                                                            id = cs.next();
                                                            if (bdd.chercheemplyes(id) != null) {
                                                               System.out.println( bdd.chercheemplyes(id).toString());
                                                            }

                                                    }
                                                    break;
                                                }
                                            case 6:
                                                System.out.print("\n\t Donner l'id du client a rechercher : ");
                                                id = cs.next();

                                                if (bdd.chercherclient(id) != null) {
                                                    System.out.print("\n\n\t\t  Le client Ayant cet id \n");
                                                    System.out.println(bdd.chercherclient(id).toString());
                                                }
                                                else{System.out.println("client nexiste pas");}
                                                break;
                                            case 7:
                                                ingremethode:
                                                {
                                                    ingremethode();
                                                    z = csint.nextInt();
                                                    switch (z) {
                                                        case 0:
                                                            break menuprincipale;
                                                        case 1:
                                                            System.out.print("\n\t\tDonner un id au nouveau ingerdient : ");
                                                            id = cs.next();
                                                            while (bdd.chercheidingredients(id) == true) {
                                                                System.out.print("\n\t\tid deja utilisé\n\t\t Réesseyer : ");
                                                                id = cs.next();
                                                            }
                                                            System.out.print("\n\t\t nom produit,  qte  prixUni  unitéMeusure\n");

                                                            Ingrédient I = new Ingrédient(id, cs.next(), csint.nextInt(), csint.nextInt(),
                                                                    unité.valueOf(cs.next()));
                                                            bdd.ajouteringredients(I);
                                                            System.out.println("\n Ingerdient ajouté avec succes\n");

                                                            System.out.print("\n\t  Combien de plat ont cet ingredient : ");
                                                            int p = csint.nextInt();
                                                            for (int i = 0; i < p; i++) {
                                                                System.out.print("\n\t\tDonner le nom du Plat N°" + (i + 1) + " : ");
                                                                id = cs.next();
                                                                for (int o = 0; o < bdd.getPlats().size(); o++) {
                                                                    if (bdd.getPlats().get(o).getDesignationCon().equals(id)) {
                                                                        bdd.getPlats().get(o).getFicheTechConsomable().ajouterIngredient(I);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 2:


                                                            System.out.print("\n\t\tDonner un id au nouvel Methode de préparation : ");
                                                            id = cs.next();
                                                            while (bdd.cherchemethode(id) == null) {
                                                                System.out.print("\n\t\tid deja utilisé\n\t\t Réesseyer : ");
                                                                id = cs.next();
                                                            }
                                                            System.out.print("\n\t\t description et temps nessicaire\n");

                                                            MethodePréparation m = new MethodePréparation(id, cs.next(), cs.next());
                                                            bdd.ajoutermethode(m);
                                                            System.out.println("\n methode ajouté avec succes\n");

                                                            System.out.print("\n\t  Combien de plat ont cet methode : ");
                                                            int h = csint.nextInt();
                                                            for (int i = 0; i < h; i++) {
                                                                System.out.print("\n\t\tDonner le nom du Plat N°" + (i + 1) + " : ");
                                                                id = cs.next();
                                                                for (int o = 0; o < bdd.getPlats().size(); o++) {
                                                                    if (bdd.getPlats().get(o).getDesignationCon().equals(id)) {
                                                                        bdd.getPlats().get(o).getFicheTechConsomable().setMethodePréparation(m);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;


                                                    }
                                                }
                                                break;
                                            case 8:
                                                bdd.affectercomparchef();break ;
                                            case 9:bdd.affichercommande();break ;

                                        }
                                        if(j==10)exit=true;
                                    }
                                }break ;


                            case Client:
                                exite = false;
                                while (!exite) {
                                    client:
                                    {
                                        client();


                                        z = csint.nextInt();
                                        while (z < 1 || z > 9) {
                                            System.out.print("Donner un choix valide entre 1 et 9\n");
                                            z = csint.nextInt();
                                        }
                                        switch (z) {
                                            case 1:
                                                bdd.PlatDuJours.ToString();
                                                System.out.print("Entrer un charactere pour continuer : ");
                                                id = cs.next();
                                                break;
                                            case 2:
                                                System.out.print("  1) Rechercher boisson\n  2) Consulter liste des plats offerts \n 0) retour :");
                                                w = csint.nextInt();
                                                switch (w) {
                                                    case 0:
                                                        break client;
                                                    case 1:
                                                        System.out.print("Quel type de boisson voullez vous afficher : \n" +
                                                                "   Café\n" +
                                                                "   Thé\n" +
                                                                "   Lait\n" +
                                                                "   Tizane\n" +
                                                                "   Gazeuze\n" +
                                                                "   Milkshake\n" +
                                                                "   Jus\n" +
                                                                "   Chocolat Chaud\n" +
                                                                "   Eau\n" +
                                                                "   Créme\n" +
                                                                "   Votre choix :  ");
                                                        String type = cs.next();
                                                        bdd.affichertypeboisson(type);
                                                        break;
                                                    case 2:
                                                        System.out.print("  1) Rechercher Par nom\n" +
                                                                "  2) Rechercher Par Spécialité culinaire\n" +
                                                                " 0) retour \n" +
                                                                " Votre choix : ");
                                                        x = csint.nextInt();
                                                        switch (x) {
                                                            case 0:
                                                                break client;
                                                            case 1:
                                                                System.out.print("\n\n\t\t  Donner le nom du plat : ");
                                                                id = cs.next();
                                                                System.out.print("\n\n\t\t  Les Plats Ayant ce nom ");
                                                                String nom = cs.next();
                                                                if (bdd.chercheplat(nom) != null) ;
                                                            {
                                                                Plat p = bdd.chercheplat(nom);
                                                                System.out.println("- " + p.getDesignationCon() + " " + p.getIdCon() +
                                                                        " " + p.getPrixCon());
                                                            }
                                                            break;


                                                            case 2:
                                                                System.out.print("\n\n\t Choisissez la spécialité culinaire : \n\t  1) Oriental\n\t  2) Occitental\n\t  3) Traditionnelle\n\t  4) Asiatique\n\t  5) Kabyle\n\t  6) hindie\n\t  7) Autre\n\t   Votre choix : ");
                                                                String sp = csint.next();
                                                                bdd.afficherspécialitéculinaire(sp);
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;


                                            case 3:

                                                bdd.Simulermontantcommande();
                                                break;
                                            case 4:
                                                bdd.afficherpanier(bdd.getClientRéguliers().get(u.getIndex()));
                                                System.out.print("\n\t" +
                                                        " 1) Retirer un consomable\n" +
                                                        " 2) Ajouter un consomable\n" +
                                                        " 0) retour" +
                                                        " Votre choix : ");
                                                w = csint.nextInt();
                                                switch (w) {
                                                    case 0:
                                                        break client;
                                                    case 1:
                                                        System.out.print("\n\t  Donner le nom du consomable a suprimer de votre panier : ");
                                                        id = cs.next();
                                                        bdd.supconsomablepanier(bdd.getClientRéguliers().get(u.getIndex()), id);
                                                        break;
                                                    case 2:
                                                        System.out.print("\n\t  Donner le nom du consomable a Ajouter de votre panier : ");
                                                        id = cs.next();
                                                        if (bdd.chercheplat(id) != null)
                                                            bdd.getClientRéguliers().get(u.getIndex()).panier.add(bdd.chercheplat(id));
                                                        else {
                                                            if (bdd.chercherboisson(id) != null)
                                                                bdd.getClientRéguliers().get(u.getIndex()).panier.add(bdd.chercherboisson(id));
                                                        }
                                                }
                                            case 5:
                                                bdd.passercommande(bdd.getClientRéguliers().get(u.getIndex()));
                                                break;
                                            case 6:
                                                System.out.print("\n Donner l'id de la commande que vous souhaitez consulter le progres : ");
                                                id = cs.next();
                                                bdd.progrescommande(bdd.getClientRéguliers().get(u.getIndex()), id);
                                                break;
                                            case 7:
                                                bdd.notercommande(bdd.getClientRéguliers().get(u.getIndex()));
                                                break;
                                            case 8:
                                                bdd.confirmécommande(bdd.getClientRéguliers().get(u.getIndex()));
                                                break;
                                            case 9:
                                                exite = true;


                                        }
                                    }
                                }
                                break;

                            case Livreur:
                                exite = false;
                                while (!exite) {
                                    livreur:
                                    {
                                        livreur();

                                        ii = csint.nextInt();
                                        while (ii < 1 || ii > 2) {
                                            System.out.print("Donner un choix valide entre 1 et 2\n");
                                            ii = csint.nextInt();
                                        }

                                        switch (ii) {
                                            case 1:
                                                System.out.print("Donner l'id de la commande a affecter : ");
                                                id = cs.next();
                                                Livraison L = new Livraison(id);
                                                bdd.affecterecommandelivreur(L, bdd.getEmployés().get(u.getIndex()), id);
                                            case 2:
                                                exite = true;

                                        }
                                    }

                                }
                                break;
                        }
                        break;

                    case 3:
                        String Nom, Prénom, Adress, NumTel, Email, MDPcompte;
                        System.out.println("donner votre nom");
                        Nom = cs.next();
                        System.out.println("donner votre prenom");
                        Prénom = cs.next();
                        System.out.println("donner votre Adresse ");
                        Adress = cs.next();
                        System.out.println("donner votre NumTel");
                        NumTel = cs.next();
                        System.out.println("donner votre Email");
                        Email = cs.next();
                        System.out.println("donner votre MOt de passe");
                        MDPcompte = cs.next();
                        bdd.ajouterclient(new ClientRégulier(Nom, Prénom, Adress, NumTel, Email, MDPcompte));
                        break ;
                    case 4:ex=true;break;


                }

            }
        }cs.close();
        csint.close();
    }
}
