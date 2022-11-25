# Programmation Orientée Objet (POO) 

Avant toute chose, développer en orienté-objet nécessite de réfléchir et d'abstraire de son problème des objets. Chaque objet correspond à un élément manipulable par le programme et auquel est assigné un certain type de traitement, des fonctions appelées méthodes.

Par la suite, le code sera executé dans une classe "éxécutable" contenant une méthode avec un "main".

## Classe d'objet

Les classes sont des moules / patrons qui permettent de créer des objets en série sur le même modèle.  Les classes contiennent différents niveaux de visibilité :
- Publique : La classe sera accessible de n’importe où dans le programme.
- Protégée : Une classe protégée ne s’utilise que dans la classe qui initialise ceci (”parents”), dans les classes qui dérive (”frères” et “soeurs”) et dans toutes les classes dans le même package.
- Privée : Uniquement disponible par les classes dans le même package.

Les classes permettent de créer ce que l’on appelle des instances d’objets.

```java
public class User {

}
```

## Objet

Les objets contiennent des attributs et des méthodes. En Java, une application est un objet. Un objet est une instance d'une classe. Pour chaque instance d'une classe, le code est le même, seules les données sont différentes à chaque objet.

```java
User Thomas = new User()
```

## Attributs et méthodes

Pour comprendre la notion d’attribut une rapide définition du **constructeur** est nécessaire : Le constructeur est ce qui est appelé lors de la création d’une instance. 

```java
public class User {
    
    String firstName;
    
    User(String firstName){
        this.firstName = firstName;
    }

}

```
Plus précisément, on remarque par sa syntaxe qu'un constructeur est une méthode permettant d'initier une nouvelle instance de la classe. 

Les attributs sont des caractéristiques d’une classe. Les attributs sont des variables ou des objets nécessaires au fonctionnement de l'instance d’objet. 

Les attributs peuvent être définis à la création avec le constructeur ou définis à l'aide de setters.

Par exemple ici, une instance humain aura comme propriété un prénom.

Une méthode est une action pré-définie à laquelle l'objet aura accès, par exemple dire bonjour : 


```java
public class User {
    
    String firstName;
    
    User(String firstName){
        this.firstName = firstName;
    }

    public static void main(String[] args) {
    System.out.println("Bonjour");
    }
}

```

## Encapsulation

l’encapsulation est un mécanisme qui empêche  de modifier ou d’accéder aux objets par un autre moyen que les méthodes proposées, et de ce fait, permet de garantir l’intégrité des objets.
L'encapsulation est donc directement liée à la visibilité des attributs et méthodes. 

## Associations

Des relations peuvent être définies entre des objets. Lorsque l'on programme en orienté objet, nous mettons en relation des briques. 
L'association est donc la mise en relation de deux classes afin que l'une profite des fonctionnalités de l'autre. 
Lorsque des classes sont associées, elles sont couplées entre elles. 
Il est possible de multiplier les associations. 

## Agrégations et composition

L'agrégation et la composition sont deux types de relation. 

Dans l'agrégation, il y a une notion d'appartenance. Un objet appartient à un autre, mais la suppression de l'un ou de l'autre n'entraîne pas la disparition de l'objet restant. Les deux peuvent "vivre" indifféremment. 

Dans la composition, un objet ne peut subsiter sans l'autre. Par exemple un objet de Salaire fait partie d'un objet d'employé. Si l'employé disaparaît, son salaire aussi. 

## Généralisation et spécialisation des classes

La généralisation, c'est créer une superclasse qui contiendra plusieurs classes aux caractéristiques similaires. 

Dans l'autre sens, la spécialisation c'est créer des classes spécifiques à partir d'une classe mère. 
Par exemple, d'une classe voiture on crée une classe pneu. 

## Héritage

L’héritage est une autre façon d’exprimer la généralisation et la spécialisation. L’héritage est la propriété qui permet à une sous-classe d’hériter des attributs et méthodes de sa classe mère.

## Classes abstraites et concrètes

Une classe abstraite est une classe qui ne sera pas utilisée comme telle. Elle possèdes des attributs et méthodes destinés à être accessibles aux classes tirées de celle-ci. 

Les classes concrètes sont justement celles tirées des classes abstraites (des superclasses), elles sont celles "réelles", utilisées et instanciées dans le programme. 

## Polymorphisme

Le polymorphisme est un état des méthodes. 
C'est la capacité d'une méthode à être executée différemment selon la classe d'objet dans lequel elle est utilisée

# Java et POO 

## Syntaxe de base 

- ';' en fin d'instruction
- Commentaires : // ou  /* */ 
- Caractères aceptés en noms de variables : A-Z, a-z, 0-9, $, _ 
- Types primitifs : boolean, byte, char, short, int, long, float, double
- Tableau : Il suffit de mettre des crochets suite à la déclaration de la variable
  Exemple: 
  ```java
  int[] mon_tableau = new int[20];
  ```
- Chaine de caractère : Classe spécifique String, la valeur des String ne peut être modifiée, la concaténation se fait avec "+"
  Exemple: 
  ```java
    String s2 = new String(”hello world”);
  ```
- Opérateurs : + - * / % ++ -- = == et beaucoup d'autres classiques
- Conditions : Structure similaire à JS : blocs if else ou écriture ternaire. 
- Boucles itératives : 
  - while
  - Do.. while
  - For

## Programmation en Java

- L'exécution se fait dans une méthode spécifique : public static void main(String[] args).
- Exécution : D'abord il faut compiler avec javac puix exécuter avec java (pas besoin lorsqu'on passe par Eclipse par exemple).
- Chaque classe publique doit être implémentée dans un fichier séparé. 
- Il est possible d'accéder à de nombreuses classes contenues dans des packages JAVA : java.io, java.awt, java.lang, java.util, ...
  Pour cela, il est indispensable d'importer le package et la classe : 
  Exemple : 
  ```java 
  import java.util.Date;
  ```
- Visibilité des champs : 
|                                                   | public | protected | Default | Private |
|---------------------------------------------------|--------|-----------|---------|---------|
| Dans la même classe                               | Oui    | Oui       | Oui     | Oui     |
| Dans une classe du même package                   | Oui    | Oui       | Oui     | Non     |
| Dans une sous-classe d'un autre package           | Oui    | Oui       | Non     | Non     |
| Dans une classe quelconque que d'un autre package | Oui    | Non       | Non     | Non     |
  
- Méthode et variable de classe : Mot clé static, correspond à une variable ou méthode associée à une classe. 

## Héritage 

- En Java, lorsqu'une classe hérite d'une autre on dit qu'elle l'étends. 
  ```java
  public class VoitureDeSport extends Voiture {}
  ```
- Une voiture de sport bénéficie des méthodes et attributs d'une voiture. 

- Pour faire appel au contrsucteur d'une classe supérieure, on utilise le mot clé super 
  ```java
    public class Carre extends Rectangle {
    public Carre(int cote) {
    super(cote, cote);
    }
  ```

## Polymorphisme

- instanceof peut être utilisé pour tester l'appartenance à une classe. 
- interface : c'est un type abstrait qui ne peut être instancié. Elle permet à différentes classes d'avoir des méthodes de cette nterface : 
  ```java
    public interface Forme {
    public int surface() ;
    public void affiche() ;
    }

    public class Rectangle implements Forme {
    ...
    }   
  ```

## Classe abstraite
- Entre la classe et l'interface, la classe abstraite est une classe qui ne peut pas être instanciée. Peut contenir des variables, mais surtout des proto-méthodes pas encore implémentées.
- La classe abstraite se définie avec le mot clé "abstract". 

## Gestion des exceptions

- Pour chaque méthode, une exception peut (doit) être définie. 
- L'exception peut être définie dans une méthode de la classe Exception ou directement dans la méthode qui la recquiert. 
- L'exception est à définir à l'aide du mot clé "throws".
  Exemple :
  ```java
    public static int parseInt(String s) throws NumberFormatException {
    ...
    }
  ```java
- Il existe également le try ... catch similaire à JS. 

## Gestion des entrées et sorties 

- Passe par le package java.io 
- La plupart des méthodes permettent de créer un objet qui reçoit les données de façon transitoire. Les données à traiter y sont stockées pour un temps limité. 
- Le Scanner est un objet itérable mot par mot. 
- java.io.File pour les lectures de fichiers. 
- Pour la sortie, une écriture sur console se fait par System.out.println()
- Il est possible d'écrire dans un fichier avec Write()
- Il existe également WriteObject()


## Applications graphiques

Disponibles dans le package swing

## Diagramme de classe UML
### Classes 

- Unified Modeling Language
- décrit l’ensemble des classes qui sont utilisées ainsi que leurs associations
- Classe représentée par un rectangle en trois parties : Nom, attributs, méthodes. 
  - Attribut : Nom + type
  - Méthode : Nom + arguments à invoquer + type de retour
    - argument : nom + type
- Niveau de visibilité à chaque élément de la classe : 
  - Public : +
  - Private : -
  - Protected : #
- Les classes abstraites contiennent ```{abstract}``` en dessous de leur nom. 
- Une interface contient ```<<interface>>``` au dessus de son nom. 
  
### Les relations

- L'héritage se représente par une flèche à tête creuse de la classe-fille vers la classe mère.
- La réalisation d’une interface par une classe se représente par une flèche pointillée à pointe creuse.

### Associations

- La plupart du temps une association ne relie que deux classes. 
- A chaque extrémité est défini le nb d'instance. 
  | Multiplicité | Interprétation |
  |--------------|----------------|
  | 1            | Un et un seul  |
  | 0..1         | zéro et un     |
  | N            | Exactement N   |
  | M..N         | de M à N       |
  | *            | zéro ou plus   |
  | o..*         | zéro ou plus   |
  | 1..*         | un ou plus     |

- Agrégation : représentée avec un losange creux.  Si A va vers B avec un losange sur le A, on peut dire que A utilise une instance de la classe B
- Composition : représentée avec un losange plein. Les objets de type 1 créent les objets de type B. 