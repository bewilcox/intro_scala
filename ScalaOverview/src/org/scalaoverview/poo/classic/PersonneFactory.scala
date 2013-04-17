package org.scalaoverview.poo.classic

// A noter que ce singleton peut porter le même nom que l'object qu'il créé, on parle d'objet Compagnon
object PersonneFactory {
  
  // Le nom apply est réservé. Cela permet de ne pas le préciser explicitement lors de l'appel à la factory
  def apply(nom: String, prenom: String, age: Int) = {
    val resultat = new PersonneSansConstruteur
    resultat.nom = nom
    resultat.prenom = prenom
    resultat // Avec Scala, il n'y a pas de return, c'est le retour de la dernière instruction qui est renvoyée
  }

}