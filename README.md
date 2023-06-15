# POO

## Description du travail

L'entièreté de ce dépôt a été créer pour le cours de programmation orientée objet ici en JAVA.
Tout ce qui est présent se trouve être mes TP et mes TD de ce cours que j'ai suivis au cours de ma formation du BUT 
informatique à l'IUT d'Orléans.

## Auteur

### Yannis BARACHE
Actuellement en étude pour le BUT informatique à l'IUT d'Orléans.

## Organisation du dépôt

Le dépôt est organisé de la manière suivante :

- `src` : contient les sources des différents TP et TD
- `README.md` : ce fichier
- `commandes_importantes.md` : contient les commandes importantes pour la compilation et l'exécution des fichiers JAVA
- `doc et out` : ne sont pas présent dans le dépôt mais sont générés par les commandes ci-dessous

## Commandes importantes

### Compilation

```bash
javac -d ./out  ./src/*.java
```

### Exécution

```bash
java -ea -cp ./out Executable
```

### Génération de la documentation

```bash
javadoc -d ./doc/  ./src/*.java
```


