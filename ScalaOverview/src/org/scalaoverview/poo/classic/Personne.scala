package org.scalaoverview.poo.classic

// Cette déclaration vaut pour un constructeur par défaut.
// Toutes les propriétés devront être initialisées lors de l'instanciation
class Personne(var nom: String, private var _prenom: String, var age: Int, var adresse: String="Adresse par défaut") {
	
  // Autre propriété (pas de getter)
  val proprieteImmuable: String = "constante"
    
  // Ceci est un constructeur auxiliaire
  // Il doit impérativement commencer par appeler un autre constructeur (principal ou secondaire)
  def this(_nom: String) = {
    this(_nom, "undefined",0)
  }
  
  // Par défaut, les propriétés sont publiques. Un accesseur peut être spécifié par la suite si besoin, comme ici
  // pour le prenom
  // Getter
  def prenom = _prenom
  // Setter
  def prenom_= (p: String) = {
    _prenom = p + " - modif"
  }
  
  
}

