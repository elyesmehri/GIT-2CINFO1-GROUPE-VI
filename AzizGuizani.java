// Méthode 1 : Calculer la somme d’un tableau d’entiers.
function sommeTableau(tableau) {
    return tableau.reduce((acc, val) => acc + val, 0);
}

// Méthode 2 : Calculer la moyenne d’un tableau d’entiers.
function moyenneTableau(tableau) {
    return tableau.length === 0 ? 0 : sommeTableau(tableau) / tableau.length;
}


// Méthode 5 : Vérifier si un nombre est premier.
function estPremier(n) {
    if (n <= 1) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

// Méthode 6 : Inverser une chaine de caractères.
function inverserChaine(chaine) {
    return chaine.split('').reverse().join('');
}

// Méthode 7 : Calculer la puissance d’un nombre.
function puissance(base, exposant) {
    return Math.pow(base, exposant);
}

// Méthode 8 : Calculer le PGCD de deux nombres.
function pgcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Méthode 9 : Trier un tableau d’entiers en ordre croissant.
function trierTableau(tableau) {
    return tableau.slice().sort((a, b) => a - b);
}

// Méthode 10 : Vérifier si une chaine est palindrome.
function estPalindrome(chaine) {
    const chaineNettoyee = chaine.replace(/[^A-Za-z0-9]/g, '').toLowerCase();
    return chaineNettoyee === chaineNettoyee.split('').reverse().join('');
}

// Méthode 11 : Rechercher l’élément maximal dans un tableau.
function elementMaximal(tableau) {
    return Math.max(...tableau);
}

// Méthode 12 : Concaténer deux tableaux.
function concatenerTableaux(tab1, tab2) {
    return tab1.concat(tab2);
}

// Méthode 13 : Calculer la racine carrée d’un nombre.
function racineCarree(n) {
    return Math.sqrt(n);
}

// Méthode 14 : Convertir une chaine en majuscule.
function convertirEnMajuscule(chaine) {
    return chaine.toUpperCase();
}

// Méthode 15 : Calculer la longueur d’une chaine.
function longueurChaine(chaine) {
    return chaine.length;
}

// Fonction main pour démontrer l'utilisation des méthodes
function main() {
    console.log("Somme du tableau [1, 2, 3, 4, 5] :", sommeTableau([1, 2, 3, 4, 5]));
    console.log("Moyenne du tableau [1, 2, 3, 4, 5] :", moyenneTableau([1, 2, 3, 4, 5]));
    console.log("Factorielle de 5 :", factorielle(5));
    console.log("Est-ce que 4 est pair ?", estPair(4));
    console.log("Est-ce que 7 est premier ?", estPremier(7));
    console.log("Inverser la chaîne 'hello' :", inverserChaine('hello'));
    console.log("3 puissance 4 :", puissance(3, 4));
    console.log("PGCD de 56 et 98 :", pgcd(56, 98));
    console.log("Tableau [5, 3, 8, 1, 2] trié :", trierTableau([5, 3, 8, 1, 2]));
    console.log("Est-ce que 'radar' est un palindrome ?", estPalindrome('radar'));
    console.log("Élément maximal dans [10, 5, 20, 15] :", elementMaximal([10, 5, 20, 15]));
    console.log("Concaténer [1, 2] et [3, 4] :", concatenerTableaux([1, 2], [3, 4]));
    console.log("Racine carrée de 16 :", racineCarree(16));
    console.log("Convertir 'hello' en majuscule :", convertirEnMajuscule('hello'));
    console.log("Longueur de la chaîne 'hello' :", longueurChaine('hello'));
}

// Appel de la fonction main pour exécuter les démonstrations
main();
