package org.scalaoverview.poo.classic

// Cette d�claration vaut pour un constructeur par d�faut.
// Toutes les propri�t�s devront �tre initialis�es lors de l'instanciation
class Personne(var nom: String, private var _prenom: String, var age: Int, var adresse: String="Adresse par d�faut") {
	
  // Autre propri�t� (pas de getter)
  val proprieteImmuable: String = "constante"
    
  // Ceci est un constructeur auxiliaire
  // Il doit imp�rativement commencer par appeler un autre constructeur (principal ou secondaire)
  def this(_nom: String) = {
    this(_nom, "undefined",0)
  }
  
  // Par d�faut, les propri�t�s sont publiques. Un accesseur peut �tre sp�cifi� par la suite si besoin, comme ici
  // pour le prenom
  // Getter
  def prenom = _prenom
  // Setter
  def prenom_= (p: String) = {
    _prenom = p + " - modif"
  }
  
  
}

