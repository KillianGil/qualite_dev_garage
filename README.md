# Projet Qualité Développement :
## Le Garage de L'IUT

### Table des matières :
* [Présentation du projet](#Presentation)
* [Prérequis](#prerequis)
* [Démarrage / Compilation](#demarrage)
* [Fonctionnalités](#fonctionnalites)
* [Auteurs et Contacts](#auteurcontact) 

### Présentation du projet : <a id="Presentation"></a>

Qui n'a jamais rêvé d'être propriétaire d’**un garage** ? 

En effet, **le projet** consiste à gérer un garage et ses voitures. Pouvant être qualifié de jeu de gestion, notre application comprend plusieurs fonctionnalités (détaillées plus tard) afin de gérer au mieux son garage. Nous pouvons y retrouver l’**ajout de voiture** avec une configuration complètement **modifiable**, ou encore **la suppression** de celle-ci uniquement grâce aux plaques d’immatriculation. Tout cela est ensuite répertorié dans un catalogue. Nous prenons en compte plus de **15 modèles** de voitures différentes afin d'être plus réaliste. L’application se déroule uniquement dans **le terminal** fournissant une utilisation simple et clarifiée.   

### Prérequis : <a id="prerequis"></a>

```
1. Avoir Java 19 et le JDK 19 installé
2. Télécharger le jeu avec le .jar
```


### Démarrage / Compilation : <a id="demarrage"></a>

Afin de pouvoir lancer le jeu, il faut d'abord remplir les pré-requis. Par la suite il faut ouvrir un terminal et se placer dans l'endroit ou se trouve le fichier.jar (par exemple avec la commande cd puis l'emplacement du fichier sur linux). Après s'être placé correctement, il suffit de rentrer la commande suivante : 
```
java -jar nomDuFichier.jar 
(pour notre jeu le fichier a pour nom de base : ProjetQualiteDev.jar)
```
Après avoir effectuer cela, vous pourrez jouer à notre jeu sur votre propre PC et votre propre terminal ! Une vidéo est disponible juste en dessous pour un tutoriel visuel. 

<p align="center"> <img src="https://media.giphy.com/media/SLKwLtyFqMeEDjS00B/giphy.gif" alt="Video_tuto_jar" /> 





### Fonctionnalités : <a id="fonctionnalites"></a>

Nous pouvons retrouver plusieurs fonctionnalités au seins de notre application, de base quelques voitures neuves sont ajoutées au garage afin de bien démarrer le jeu. Nous pouvons séparer les fonctionnalités en 4 parties distinctes : 

1. La consultation du catalogue : 

Concernant la consultation du catalogue, nous laissons plusieurs choix à l'utilisateur. Nous lui proposons d’afficher **le catalogue** tel qu’il est de base avec toutes les voitures présentes dans le garage ainsi que **leurs caractéristiques** détaillées (exemple ci-dessous). 
<p align="center">
  <img src="https://media.giphy.com/media/Rxt4iojdW7tEJPXMZn/giphy.gif" alt="Exemple Voiture Catalogue"/>
</p>

Ou alors, dans un second choix, nous lui proposons d’appliquer différents filtres  : 
```
- Par marque 
- Par prix
- Par nombre de main
- Par note 
```

Après la sélection voulue, nous appliquons donc directement le filtre voulu sur le catalogue, qui s’affiche **trier** correctement. 

2. L'ajout d'une voiture : 

La deuxième fonctionnalités implémentées dans notre application est l’ajout de voiture au garage. Pour ce faire, il suffit que l’utilisateur choisi l’option “Ajout de voiture”. Ensuite s’affiche automatiquement **la liste des modèles** disponibles à la création, il pourra donc ensuite rentrer chacun des paramètres de la voiture comme il le souhaite afin de créer la voiture. Toutes les caractéristiques de la voiture sont **personnalisables**. Enfin , la voiture sera ajoutée au catalogue du garage (exemple fourni ci-dessous). 
<p align="center">
  <img src="https://media.giphy.com/media/cF7LnGHTEce2aCNMtl/giphy.gif" alt="Exemple Création Voiture"/>
</p>

3. La suppression d'une voiture : 

La troisième fonctionnalité présentée est la suppression d’une voiture. Cette fonctionnalité est nécessaire afin de pouvoir gérer correctement un garage. De ce fait, lorsque l’utilisateur sélectionne l’option voulue, la liste de toutes les voitures présentes dans le garage est affichée. Cette liste comprend **le modèle** de la voiture ainsi que **sa plaque d’immatriculation**. Afin de pouvoir supprimer une voiture, l'utilisateur doit entrer la plaque immatriculation de la voiture à supprimer et cela s'effectue automatiquement. La voiture est alors supprimée du catalogue (exemple fourni ci-dessous). 
<p align="center">
  <img src="https://media.giphy.com/media/MXtXoUIlEBS0hCunRR/giphy.gif" alt="Exemple Suppression Voiture"/>
</p>

4. La modification d'une voiture : 

La derniere fonctionnalité présente dans notre jeu est **la modification d'une voiture**. En effet, en étant garagiste on est amené à effectuer plusieurs modifications sur les voitures de notre garage afin de les améliorer ou les réparer. Ici, nous donnons la possibilité au joueur de modifier 4 aspects sur ses voiture : 

* L'entretien
* Le prix 
* Le nombre de mains 
* Les roues 

De ce fait, le joueur peut vraiment gérer son garage entièrement jusqu'à modifier ses voitures. Pour effectuer cela, un menu apparaîtra proposant la modification de voiture, puis il devra choisir la voiture à modifier en entrant sa plaque d'immatriculation. Ensuite, un nouveau menu avec les différentes options de modifications apparaîtra et le joueur devra sélectionner l'option voulue afin de la modifier. La voiture sera automatiquement modifiée dans le catalogue après la validation de celle-ci (exemple ci-dessous). 
<p align="center">
  <img src="https://media.giphy.com/media/OF1pYKFpcpWeCbNHcX/giphy.gif" alt="Exemple Suppression Voiture"/>
</p>

### Auteurs et Contacts : <a id="auteurcontact"></a>

Nous sommes **3 personnes** à avoir participé à la conception de ce projet : 

* Clément DUGOURD : <a href="https://www.linkedin.com/in/cl%C3%A9ment-dugourd-157374223"> Linkedin </a>
 
* Noémie DJERIAN : <a href="https://www.linkedin.com/in/no%C3%A9mie-djerian-916211230"> Linkedin </a>
 
* Killian GIL : <a href="https://www.linkedin.com/in/killian-gil-169b45183"> Linkedin </a>
