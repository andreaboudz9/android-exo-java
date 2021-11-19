
Le directeur des systèmes d’information de la société GUTEMBERT souhaite développer un module pour la gestion des utilisateurs de son service informatique, pour cela il vous a fait appel pour réaliser cette tâche.

Le diagramme de classe a été établi par un analyste afin de mettre en place une base de données sous ORACLE ou MySQL  dont nous avons comme classe: 
- Personne (#id:Int,#nom:String,#prenom:String,#mail:String,#telephone:String,#salaire:Double) method[+calculerSalaire():double,+affiche():void]
- Utilisateur(-login:String,-password:String,Service:String)
- Profil(-id:Int,-code:String,-libelle:String)


Développer les classes ci-dessus en JAVA dans un package de votre choix.
        NB : l’identifiant est auto incrément.

Redéfinir la méthode calculerSalaire () et la méthode affiche() dans la classe Utilisateur.
         Sachant que :

Le manager aura une augmentation de 10% par rapport à son salaire normal,
Le directeur général aura une augmentation de 40% par rapport à son salaire normal.
Créer les profils :
Chef de projet (CP),
Manager (MN),
Directeur de projet (DP),
Directeur des ressources humaines (DRH),
Directeur général (DG),
Créer des utilisateurs avec les différents profils métiers.
Afficher la liste des utilisateurs.
Filtrer la liste et afficher la liste des managers.