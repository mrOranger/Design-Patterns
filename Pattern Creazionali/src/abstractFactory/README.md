# Abstract Factory Design Pattern

Il Pattern Creazione Abstract Factory si occupa di astrarre il processo di istanziazione di una 
classe di oggetti, mediante l'uso di un'interfaccia. L'uso dell'interfaccia permette di definire
il contratto comune a tutti le classi che dovranno restituire una particolare categoria dell'oggetto.

## Partecipanti

I partecipanti del pattern sono:
- __Abstract Factory__ , ossia l'interfaccia che definisce il comportamento comune per l'istanziazione
degli oggetti.
- __Concrete Factory__ , implementa l'interfaccia Abstract Factory e di conseguenza restituisce l'oggetto
corrispondente creato.
- __Abstract Product__ , viene usata dalla Concrete Factory e definisce un'interfaccia per una classe
di prodotti da creare.
- __Concrete Produce__ , è la classe concreta che viene istanziata dalla corrispodente Factory.
- __Client__ , è l'utilizzatore dei prodotti concreti, ed accede a questi solamente con l'interfaccia
Abstact Factory.

## Applicabilità

L'uso del pattern Abstract Factory è correlato alle seguenti situazioni:
- Si vuole rendere il sistema indipendente dalle modalità di creazione di un oggetto, e da come
questi sono composti.
- Esiste una famiglia di prodotti da dover usare a seconda delle necessità.

## Conseguenze

L'uso di questo design pattern ha le seguenti conseguenze sul progetto:
- Si rende il _Client_ indipendente dalle classi che vengono effettivamente usate, e questo è possibile
perché il Client creerà gli oggetti attraverso l'interfaccia che gestisce la gerarchia.
- Usando una _Concrete Factory_ per creare degli oggetti di una categoria, è possibile semplificare
il processo di creazione semplicemente cambiando l'istanza della Concrete Factory attualmente usata.
- Si rende complicato il processo di estensione delle categorie di classi da gestire. Infatti, se 
bisogna configurare un nuovo oggetto, è necessario che si modifichino le classi _Abstract Factory_
e _Concrete Factory_ insieme al _Client_.