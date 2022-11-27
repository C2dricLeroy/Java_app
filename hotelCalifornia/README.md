# java-app

## Description

### Story

Vous êtes sur le point de commencer le développement d'une application de gestion de réservation de chambres d'hotel.
Pour cela vous aller effectuer des recherche sur les notions de base de l'orienté objet
Une fois les notions assimilé vous aller les appliquer  dans la future application.

### Problem 

Vous allez créer votre première application Java qui va vous permettre de visualiser et de créer facilement des reservation de chambre.
L'hôtel gère des chambres permettant de recevoir de une à quatre personnes et classifiées selon 6 catégories.
L'hôtel est constitué de  ??? chambres? 
Le prix de la chambre varie selon la capacité de la chambre et sa catégorie, ces informations sont regroupées dans ce tableau : 

[table des Prix](tabPrix.jpg)

Le programme doit afficher la liste de ce que possède la chambre : 

[table des features](tabFeatures.jpg)


Stack : 
- Java 13
- Maven

### Bonus : 

1) Consiste à persister les données en base de données.
2) Exporter les données sur un fichier Csv.

## Architecture 

### Fonctionnalités souhaitées

- Lancement de l'application
- Message de bienvenue
- Demande du nombre de personne pour la réservation
- Affichage des catégories disponibles selon le nb de personnes
- Choix de la catégorie souhaitée
- Check si la chambre est disponible
- Affiche le prix
- Confirmation de réservation
- La chambre n'est plus libre. 

### Conception en POO

Il est tout d'abord nécessaire de réfléchir aux objets qui seront à manipuler dans notre programme. 

En premier lieu, un objet chambre sera à manipuler. Il est nécessaire de connaître plusieurs informations concernant la chambre :
- Un numéro de chambre
- Un prix
- Une catégorie
- Une capacité maximum
- Est-elle libre ? 

Il serait possible de complexifier notre application en construisant un objet prix. Dans un soucis de simplification du processus de développement, nous décidons de garder une architecture simple. 

Aucune banque de donnée contenant les commodités associées à la catégorie n'est présent. Nous décidons de construire une classe RoomCategory, contenant les commodités, et le numéro de catégorie.



### L'application

Au lancement de l'application, un message de bienvenue est affiché. 

[screenshot]

Suite à ce message, l'utilisateur est invité à rentrer le nombre de personnes pour lesquelles il souhaite réserver.

[screenshot]

Les listes des catégories et de leurs commodités sont affichées à l'utilisateur pour un choix. 

[screenshot]

En fonction de la catégorie choisie, le prix pour une nuit est affiché et l'utilisateur est invité à confirmer son choix. 

[screenshot]



### Pistes d'amélioration

- Options d'annulation ou de retour en arrière en cours de réservation.
- La possibilité d'arrêter le programme, revenir au début.
- Construction d'une méthode acceptant un code de promotion.
- Amélioration de l'expérience utilisateur par un affichage des catégories uniquement disponibles. 
- Meilleure gestion des erreurs lorsque l'utilisateur demande une chambre et une catégorie qui n'existe pas. 
- Meilleur affichage des commodités. 