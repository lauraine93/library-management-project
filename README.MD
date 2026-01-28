#  Library Management System

##  Description générale
Ce projet est un **système de gestion de bibliothèque** développé en **Java** et utilisable via la **ligne de commande (console)**.  
Il permet de gérer une collection de livres, d’effectuer des recherches, de trier les livres et de suivre les activités récentes, tout en mettant en pratique des **concepts fondamentaux de programmation et de structures de données**.

Ce projet a été réalisé dans un **cadre académique**, mais il reflète des problématiques réelles rencontrées dans les systèmes de gestion.

---

##  Objectif du projet
L’objectif principal est de montrer comment :
- organiser des données efficacement,
- utiliser des structures de données adaptées,
- implémenter des algorithmes classiques,
- construire une application Java fonctionnelle et bien structurée.

---

##  Fonctionnalités principales

###  Gestion des livres
Le système permet de :
- Ajouter un nouveau livre à la bibliothèque
- Supprimer un livre existant
- Modifier les informations d’un livre

Chaque livre est défini par :
- un **titre**
- un **auteur**
- un **ISBN** (identifiant unique)
- une **année de publication**
- un **genre**

---

###  Recherche de livres
L’utilisateur peut rechercher un livre en utilisant :
- le titre
- le nom de l’auteur
- l’ISBN

Deux méthodes de recherche sont implémentées :
- **Recherche linéaire** : parcourt les livres un par un
- **Recherche binaire** : méthode plus rapide, utilisée après avoir trié les livres

---

###  Tri des livres
Les livres peuvent être triés selon différents critères :
- par titre
- par auteur
- par année de publication

Pour cela, plusieurs algorithmes sont utilisés :
- **Tri à bulles (Bubble Sort)**
- **Tri par sélection (Selection Sort)**
- **Tri rapide (Quick Sort)**

Cela permet de comparer les performances et les usages de chaque algorithme.

---

### Historique des emprunts
Chaque livre possède un **historique des emprunts**, qui enregistre les personnes ayant emprunté le livre.  
Cet historique est implémenté à l’aide d’une **liste chaînée**, une structure de données adaptée aux ajouts successifs.

---

### Activités récentes
Les actions récentes de l’utilisateur (ajout de livre, recherche, emprunt, etc.) sont stockées dans une **pile (stack)**.  
Cela permet d’afficher les dernières actions effectuées, selon le principe **LIFO (Last In, First Out)**.

---

##  Concepts informatiques utilisés
Ce projet met en pratique les concepts suivants :
- Tableaux (Arrays)
- Listes chaînées (Linked Lists)
- Piles (Stacks)
- Algorithmes de recherche
- Algorithmes de tri
- Programmation orientée objet en Java

---

##  Organisation du projet

