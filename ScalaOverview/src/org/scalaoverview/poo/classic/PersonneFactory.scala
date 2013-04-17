package org.scalaoverview.poo.classic

// A noter que ce singleton peut porter le m�me nom que l'object qu'il cr��, on parle d'objet Compagnon
object PersonneFactory {
  
  // Le nom apply est r�serv�. Cela permet de ne pas le pr�ciser explicitement lors de l'appel � la factory
  def apply(nom: String, prenom: String, age: Int) = {
    val resultat = new PersonneSansConstruteur
    resultat.nom = nom
    resultat.prenom = prenom
    resultat // Avec Scala, il n'y a pas de return, c'est le retour de la derni�re instruction qui est renvoy�e
  }

}