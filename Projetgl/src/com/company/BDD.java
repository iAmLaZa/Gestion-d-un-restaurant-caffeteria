package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class BDD {
    Scanner cs = new Scanner(System.in);
    Scanner csint = new Scanner(System.in);
    private ArrayList<Commande> commandes = new ArrayList<>();
    private ArrayList<Livraison> livraisons = new ArrayList<>();
    private ArrayList<Plat> plats = new ArrayList<>();
    private ArrayList<Boisson> boissons = new ArrayList<>();
    private ArrayList<Ingrédient> Ingredients = new ArrayList<>();
    private ArrayList<MethodePréparation> methodePréparations = new ArrayList<>();
    private ArrayList<Employé> Employés = new ArrayList<>();
    private ArrayList<ClientRégulier> clientRéguliers = new ArrayList<>();
    private ChefRéstaurant chef;
    private int x;
    Plat PlatDuJours = new Plat();


    public BDD() {
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    public ArrayList<Livraison> getLivraisons() {
        return livraisons;
    }

    public void setLivraisons(ArrayList<Livraison> livraisons) {
        this.livraisons = livraisons;
    }

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    public void setPlats(ArrayList<Plat> plats) {
        this.plats = plats;
    }

    public ArrayList<Boisson> getBoissons() {
        return boissons;
    }

    public void setBoissons(ArrayList<Boisson> boissons) {
        this.boissons = boissons;
    }

    public ArrayList<Ingrédient> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(ArrayList<Ingrédient> ingredients) {
        Ingredients = ingredients;
    }

    public ArrayList<MethodePréparation> getMethodePréparations() {
        return methodePréparations;
    }

    public void setMethodePréparations(ArrayList<MethodePréparation> methodePréparations) {
        this.methodePréparations = methodePréparations;
    }

    public ArrayList<Employé> getEmployés() {
        return Employés;
    }

    public void setEmployés(ArrayList<Employé> employés) {
        Employés = employés;
    }

    public ChefRéstaurant getChef() {
        return chef;
    }

    public void setChef(ChefRéstaurant chef) {
        this.chef = chef;
    }

    public ArrayList<ClientRégulier> getClientRéguliers() {
        return clientRéguliers;
    }

    public void setClientRéguliers(ArrayList<ClientRégulier> clientRéguliers) {
        this.clientRéguliers = clientRéguliers;
    }

    public void installationbdd() {
        //ajouter 3 plats:
        plats.add(new Plat("01", "Frites", natureC.Chaude, ConditionementC.Assiete, 100, new Consomable.FicheTechConsomable(), SpCuliniére.Autre));
        plats.add(new Plat("02", "Omlette", natureC.Chaude, ConditionementC.Assiete, 50, new Consomable.FicheTechConsomable(), SpCuliniére.Autre));
        plats.add(new Plat("03", "Frites-Omlette", natureC.Chaude, ConditionementC.Assiete, 120, new Consomable.FicheTechConsomable(), SpCuliniére.Autre));

        //ajouter 2 boissons:
        boissons.add(new Boisson("04", "Coca-Cola", natureC.Froide, ConditionementC.Boutielle, 80, new Consomable.FicheTechConsomable(), typeBoisson.Gazeuze));
        boissons.add(new Boisson("05", "Jus-Dorange", natureC.Froide, ConditionementC.Goblet, 100, new Consomable.FicheTechConsomable(), typeBoisson.Jus));

        //ajouter Ingredients:
        Ingredients.add(new Ingrédient("01", "Ouef", 300, 10, unité.g));
        Ingredients.add(new Ingrédient("02", "Pomme de terre", 200, 45, unité.kg));
        Ingredients.add(new Ingrédient("03", "sel", 2, 25, unité.kg));
        Ingredients.add(new Ingrédient("04", "Orange", 20, 150, unité.kg));

        //ajouter MethodePréparations:
        methodePréparations.add(new MethodePréparation("01", "Frites", "00:15:00"));
        methodePréparations.add(new MethodePréparation("02", "Omlette", "00:07:00"));
        methodePréparations.add(new MethodePréparation("03", "Frite-Omlette", "00:20:00"));
        methodePréparations.add(new MethodePréparation("04", "Jus-Dorange", "00:10:00"));


        plats.get(2).ficheTechConsomable.setMethodePréparation(methodePréparations.get(2));
        plats.get(2).ficheTechConsomable.ajouterIngredient(Ingredients.get(0));
        plats.get(2).ficheTechConsomable.ajouterIngredient(Ingredients.get(1));
        plats.get(2).ficheTechConsomable.ajouterIngredient(Ingredients.get(2));
        PlatDuJours = plats.get(2);

        //ajouter les employes (livreurs):

        Employés.add(new Employé("01", "Zitouni", "Lokmane", "LazaLokmane@gmail.com", "0000", TypeEmpolyé.Livreur, EtatEmployé.EnService));
        Employés.add(new Employé("02", "Hammani", "Aimene", "aimen.11@outlook.fr", "0000", TypeEmpolyé.Livreur, EtatEmployé.EnService));

        //lechef de restaurant:
        chef = new ChefRéstaurant("01", "Da7man", "L'7adj", "Da7man.7@Da7mimen.com", "0010", TypeEmpolyé.Chef, EtatEmployé.EnService);

        //cliantreguliers:
        ClientRégulier c1=new ClientRégulier( "Alouane Zine Edine", "Wail", "Borjmnayel",
                "0541913941", "Wailalouane@gmail.com", "0000");
        clientRéguliers.add(c1);
        //ajouter commande
        commandes.add(new Commande(TypeCom.aDomicile,c1,EtatCom.EnCours));
        //creer un panier :

        ArrayList<Consomable> panier = new ArrayList<>();
        panier.addAll(plats);
        panier.add(boissons.get(0));
        clientRéguliers.get(0).setPanier(panier);
    }

    public void connexion(user U) {

        System.out.print("Donner L'adress email :\n");

        boolean found = false;
        while (!found) {
            U.setEmail(cs.next());
            if (U.getEmail().equals(chef.getEmail())) {
                U.setTypeUser(TypeEmpolyé.Chef);
                found = true;
                U.setMdp(chef.getMDPcompte());
                U.setNom(chef.getNomEmployé());
                U.setPrenom(chef.getPrénomEmployé());
            } else {
                if (!found) {
                    for (int i = 0; i < Employés.size(); i++) {
                        if (Employés.get(i).getEmail().equals(U.getEmail())) {
                            U.setTypeUser(TypeEmpolyé.Livreur);
                            found = true;
                            U.setMdp(Employés.get(i).getMDPcompte());
                            U.setNom(Employés.get(i).getNomEmployé());
                            U.setPrenom(Employés.get(i).getPrénomEmployé());
                            U.setIndex(i);
                            break;
                        }
                    }
                }
                if (!found) {
                    for (int i = 0; i < clientRéguliers.size(); i++) {
                        if (clientRéguliers.get(i).getEmail().equals(U.getEmail())) {
                            U.setTypeUser(TypeEmpolyé.Client);
                            found = true;
                            U.setMdp(clientRéguliers.get(i).getMDPcompte());
                            U.setNom(clientRéguliers.get(i).getNom());
                            U.setPrenom(clientRéguliers.get(i).getPrénom());
                            U.setIndex(i);
                            break;
                        }
                    }
                }
            }
            if (!found) System.out.print("Cet Email ne correspond à aucun utilisateur\n Réesseyer : ");
        }


        System.out.print("Donner le mot de passe : ");
        while (!cs.next().equals(U.getMdp())) {
            System.out.print("Mot de passe érroné\n Réesseyer : ");
        }
    }

    public void platplusvendu() {
        Collections.sort(plats, new Comparator<Plat>() {
            public int compare(Plat p1, Plat p2) {

                return Integer.valueOf(p2.getCommandé()).compareTo(Integer.valueOf(p1.getCommandé()));
            }

        });
        System.out.println("\tles plats les plus commandé sont :\n\t ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ") " + plats.get(i).getDesignationCon() + "\n\t ");

        }
    }




    public ClientRégulier chercherclient(String id) {
        for (int i = 0; i < clientRéguliers.size(); i++) {
            if (clientRéguliers.get(i).getIdClient().equals(id)) {
                return clientRéguliers.get(i);

            }
        }

        return null;
    }




    public void ajouterclient(ClientRégulier c) {
        if (chercherclient(c.getIdClient()) == null){
            clientRéguliers.add(c);
        System.out.println("client ajouté");}
        else {
            System.out.println("client existe deja");
        }
    }





    public Commande cherchecommande(String id) {
        for (int i = 0; i < commandes.size(); i++) {
            if (commandes.get(i).getIdCommande().equals(id)) {
                return commandes.get(i);
            }
            return null;
        }
        System.out.print("Commande inéxistante\n");
        return null;

    }



    public Plat chercheplat(String nom) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).getDesignationCon().equals(nom)) {
                return plats.get(i);
            }
        }

        return null;
    }




    public Plat chercheplatparid(String id) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).getIdCon().equals(id)) {
                return plats.get(i);
            }
        }

        return null;
    }




    public boolean chercheidplat(String id) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).getIdCon().equals(id)) {
                return true;
            }
        }

        return false;
    }



    public void ajouterplat(Plat p) {
        if (chercheplat(p.getDesignationCon()) == null) {
            plats.add(p);
            System.out.println("\n Plat ajouté avec succes");
        } else {
            System.out.println("plat existe deja");
        }
    }



    public void supplat(String nom) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).getDesignationCon().equals(nom)) {
                plats.remove(i);
                break;
            }
        }
    }




    public Boisson chercherboisson(String nom) {
        for (int i = 0; i < boissons.size(); i++) {
            if (boissons.get(i).getDesignationCon().equals(nom)) {
                return boissons.get(i);
            }
        }

        return null;
    }



    public Boisson chercherboissonparid(String id) {
        for (int i = 0; i < boissons.size(); i++) {
            if (boissons.get(i).getIdCon().equals(id)) {
                return boissons.get(i);
            }
        }

        return null;
    }




    public boolean chercheidboisson(String id) {
        for (int i = 0; i < boissons.size(); i++) {
            if (boissons.get(i).getIdCon().equals(id)) {
                return true;
            }
        }

        return false;
    }




    public void ajouterboisson(Boisson p) {
        if (chercherboisson(p.getDesignationCon()) == null) {
            boissons.add(p);
            System.out.println("\n boissont ajouté avec succes");
        } else {
            System.out.println("boisson existe deja");
        }
    }



    public void supboisson(String nom) {
        for (int i = 0; i < boissons.size(); i++) {
            if (boissons.get(i).getDesignationCon().equals(nom)) {
                boissons.remove(i);
                break;
            }
        }
    }




    public Ingrédient chercheingrédient(String nom) {
        for (int i = 0; i < Ingredients.size(); i++) {
            if (Ingredients.get(i).getProduit().equals(nom)) {
                return Ingredients.get(i);
            }
        }

        return null;
    }



    public boolean chercheidingredients(String id) {
        for (int i = 0; i < Ingredients.size(); i++) {
            if (Ingredients.get(i).getIdIngredient().equals(id)) {
                return true;
            }
        }

        return false;
    }




    public void ajouteringredients(Ingrédient p) {
        if (!Ingredients.contains(p)) {
            Ingredients.add(p);
            System.out.println("\n ingredient ajouté avec succes");
        } else {
            System.out.println("ingredient existe deja");
        }
    }




    public Ingrédient cherchemethode(String id) {
        for (int i = 0; i < methodePréparations.size(); i++) {
            if (methodePréparations.get(i).getIdMethode().equals(id)) {
                return Ingredients.get(i);
            }
        }

        return null;
    }




    public void ajoutermethode(MethodePréparation p) {
        if (!methodePréparations.contains(p)) {
            methodePréparations.add(p);
            System.out.println("\n methode ajouté avec succes");
        } else {
            System.out.println("methode existe deja");
        }
    }




    public void afficherspécialitéculinaire(String s) {

        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).getSpCuliniére() == SpCuliniére.valueOf(s)) {
                System.out.println("- " + plats.get(i).getDesignationCon() + " " + plats.get(i).getIdCon() +
                        " " + plats.get(i).getPrixCon());
            }
        }
    }



    public boolean chercheidemployes(String id) {
        for (int i = 0; i < Employés.size(); i++) {
            if (Employés.get(i).getIdEmployé().equals(id)) {
                return true;
            }
        }

        return false;
    }



    public Employé chercheemplyes(String id) {
        for (int i = 0; i < Employés.size(); i++) {
            if (Employés.get(i).getIdEmployé().equals(id)) {
                return Employés.get(i);
            }
        }

        return null;
    }



    public void ajouteremployes(Employé p) {
        if (!Employés.contains(p)) {
            Employés.add(p);
            System.out.println("\n boissont ajouté avec succes");
        } else {
            System.out.println("boisson existe deja");
        }
    }




    public void affichertypeboisson(String type) {
        int cpt = 0;
        for (int i = 0; i < boissons.size(); i++) {
            if (boissons.get(i).getTypeB().equals(typeBoisson.valueOf(type))) {
                boissons.get(i).ToString();
                cpt++;
            }
        }
        if (cpt == 0) System.out.println("aucun boisson de ce type :" + type);
    }




    public void Simulermontantcommande() {
        Commande C = new Commande();
        System.out.print("\n Donner le nombre de plats a commander : ");
        int nbplat = csint.nextInt();
        for (int i = 0; i < nbplat; i++) {
            System.out.print("\n   Donner le nom du plat N" + (i + 1) + " a commander : ");
            String id = cs.nextLine();
            for (int iii = 0; iii < plats.size(); iii++) {
                if (plats.get(iii).getDesignationCon().equals(id)) {
                    C.getDetailComs().add(new Commande.DetailCom());
                    System.out.print("\n   Donner le nombre de portions du plat N" + (i + 1) + " a commander : ");
                    int io = csint.nextInt();
                    C.getDetailComs().get(i).AjouterCon(plats.get(iii), io);
                    x = i;
                }
            }
        }
        System.out.print("\n Donner le nombre de boissons a commander : ");
        nbplat = csint.nextInt();
        for (int i = 0; i < nbplat; i++) {
            System.out.print("\n   Donner le nom du boisson N" + (i + 1) + " a commander : ");
            String id = cs.nextLine();
            for (int iii = 0; iii < boissons.size(); iii++) {
                if (boissons.get(iii).getDesignationCon().equals(id)) {
                    C.getDetailComs().add(new Commande.DetailCom());
                    System.out.print("\n   Donner le nombre de portions du boisson N" + (i + 1) + " a commander : ");
                    int io = csint.nextInt();
                    C.getDetailComs().get(i + nbplat + 1).AjouterCon(boissons.get(iii), io);
                }
            }
        }
        System.out.print("\n Prix de commande : " + C.prix());
    }







    public void afficherpanier(ClientRégulier c) {
        System.out.println("votre panier est :");
        for (int i = 0; i < c.getPanier().size(); i++) {
            System.out.println(c.panier.get(i).toString());
        }
    }





    public void supconsomablepanier(ClientRégulier c, String nom) {
        for (int i = 0; i < c.getPanier().size(); i++) {
            if (c.getPanier().get(i).getDesignationCon().equals(nom))
                c.getPanier().remove(i);

        }

    }




    public void passercommande(ClientRégulier c) {
        Commande C3 = new Commande();
        System.out.println("id de commande est:" + C3.getIdCommande());
        System.out.print("\n  Donner le nombre de plats a commander : ");
        int pc = csint.nextInt();
        System.out.print("\n  Donner le nombre de boissons a commander : ");
        int bc = csint.nextInt();
        for (int i = 0; i < pc; i++) {
            System.out.print("\n   Donner le nom du plat N" + (i + 1) + " a commander : ");
            String id = cs.next();
            for (int iii = 0; iii < plats.size(); iii++) {
                if (plats.get(iii).getDesignationCon().equals(id)) {
                    C3.getDetailComs().add(new Commande.DetailCom());
                    System.out.print("\n   Donner le nombre de portions du plat N" + (i + 1) + " a commander : ");
                    int io = csint.nextInt();
                    C3.getDetailComs().get(i).AjouterCon(plats.get(iii), io);
                }
            }
        }
        for (int i = 0; i < bc; i++) {
            System.out.print("\n   Donner le nom du boisson N" + (i + 1) + " a commander : ");
            String id = cs.next();
            for (int iii = 0; iii < boissons.size(); iii++) {
                if (boissons.get(iii).getDesignationCon().equals(id)) {
                    C3.getDetailComs().add(new Commande.DetailCom());
                    System.out.print("\n   Donner le nombre de portions du boisson N" + (i + 1) + " a commander : ");
                    int io = csint.nextInt();
                    C3.getDetailComs().get(i + pc).AjouterCon(boissons.get(iii), io);
                }
            }
        }
        if (pc == 0 && bc == 0) {
            C3.setEtatCom(EtatCom.Annulé);
            c.ajouterCommande(C3);
        }
        if (pc != 0 || bc != 0) {
            System.out.print("\n" + C3.prix() + "\n" +
                    " Service : \n" +
                    " 1) A domicile\n" +
                    " 2) Sur place\n" +
                    " Votre choix : ");
            int ii = csint.nextInt();
            switch (ii) {
                case 1:
                    C3.setTypeCom(TypeCom.aDomicile);
                    break;
                case 2:
                    C3.setTypeCom(TypeCom.SurPlace);
            }
            if (C3.getTypeCom() == TypeCom.aDomicile) {
                System.out.print("\n Donner l'adress de livraison : ");
                String id = cs.next();
            }
            System.out.println("Spécifier Methode de payment : ");
            System.out.println(" 1) Surplace\n" +
                    " 2) Online\n" +
                    " 3) Utiliser Bon\n" +
                    "4) Annuler commande\n" +
                    "Votre choix : ");
            ii = csint.nextInt();
            switch (ii) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("fonctionalité en cours de developement\n");
                    break;
                case 4:
                    C3 = null;
                    break;
            }
            if (C3 != null) {
                C3.setEtatCom(EtatCom.EnCours);
                c.ajouterCommande(C3);
                C3.toString();
            }

        }
    }






    public void progrescommande(ClientRégulier c, String id) {
        for (int i = 0; i < c.getCommandes().size(); i++) {
            if (c.getCommandes().get(i).getIdCommande().equals(id)) {
                System.out.println(c.getCommandes().get(i).getEtatCom().toString());
            }
        }
    }






    public void notercommande(ClientRégulier c) {
        System.out.print("\n Donner l'id de la commande que vous souhaitez noter : ");
        String id = cs.next();
        for (int i = 0; i < c.getCommandes().size(); i++) {
            if (c.getCommandes().get(i).getIdCommande().equals(id)) {
                System.out.print("Donner une note a la commande : ");
                c.getCommandes().get(i).getAvis().setNotation(csint.nextInt());
                System.out.print("Donner un commentaire : ");
                c.getCommandes().get(i).getAvis().setCommentaire(cs.nextLine());break;
            }

        }

    }




    public void confirmécommande(ClientRégulier c) {
        System.out.print("\n Donner l'id de la commande que vous souhaitez confirmé : ");
        String id = cs.next();
        for (int i = 0; i < c.getCommandes().size(); i++) {
            if (c.getCommandes().get(i).getIdCommande().equals(id)) {
                c.getCommandes().get(i).setEtatCom(EtatCom.Validé);
            }

        }

    }





    public void affecterecommandelivreur(Livraison L,Employé U,String id){
        livraisons.add(L);
        for (int i = 0; i < Employés.size(); i++) {
            if (Employés.get(i).getEmail().equals(U.getEmail())) {
                livraisons.get(livraisons.indexOf(L)).ajouterLivreur(Employés.get(i));
            }
        }
        for (int i = 0; i < commandes.size(); i++) {
            if (commandes.get(i).getIdCommande().equals(id)) {
                livraisons.get(livraisons.indexOf(L)).ajouterCommande(commandes.get(i));
            }
        }
        System.out.println("Le livreur " + U.getNomEmployé() + " " + U.getPrénomEmployé() + " a été affecter la commande : "
                + livraisons.get(livraisons.indexOf(L)).getCommande().getIdCommande()
                + " // Livraison : " + livraisons.get(livraisons.indexOf(L)).getIdLaivraison());
    }




    public void affectercomparchef(){
        System.out.print("Valider l'affectation a une livraison ?\n  1) Oui\n2) Quitter\n Votre choix : ");
        int ii=cs.nextInt();
        if(ii==1){
            System.out.print("Donner l'id de la commande a affecter : ");
             String id=cs.next();
            Livraison L=new Livraison(id);
            livraisons.add(L);
            livraisons.get(livraisons.indexOf(L)).ajouterLivreur(chef);
            for (int i=0;i<commandes.size();i++){
                if(commandes.get(i).getIdCommande().equals(id)){
                    livraisons.get(livraisons.indexOf(L)).ajouterCommande(commandes.get(i));
                    commandes.get(i).setEtatCom(EtatCom.Affecté);
                }
            }
            System.out.print("Le Chef "+chef.getNomEmployé()+" "+chef.getPrénomEmployé()+" a été affecter la commande : "
                    +livraisons.get(livraisons.indexOf(L)).getCommande().getIdCommande()
                    +" // Livraison : "+livraisons.get(livraisons.indexOf(L)).getIdLaivraison());
        }
    }




    public void affichercommande(){
        for(int i=0;i<commandes.size();i++){
            System.out.println(commandes.get(i).Tostring());
        }
    }
}








