# Data Access Object Design Pattern
Il Data Access Object, o comunemente chiamato DAO, è un Design Pattern architetturale che consiste nella separazione delle responsabilità tra le classi che controllano l'accesso a dei dati.
Supponiamo infatti che la nostra applicazione enterprise abbia più di un database, ma che su questi vengano eseguite sostanzialmente le stesse operazioni. Tramite il pattern DAO, e creando un'unica interfaccia che
regoli l'accesso ai dati, sarà necessario specificare solamente l'istanza specifica del database, senza cambiare le operazioni che vengono effettuate, in quanto regolate dal contratto con l'interfaccia.

## Partecipanti
All'interno di questo pattern partecipando le seguenti classi:
- Il _Data Access Object Interface_ è l'interfaccia che regola l'accesso ai dati, e definise le operazioni standard da eseguire.
- La classe che implementa quest'interfaccia è la _Data Access Object concrete class_, che quindi esegue le operazioni direttamente sulla base di dati.
- La classe concreta utilizza un __POJO__ (Plain Old Java Object) che rappresenta il dato persistente.
- Infine, il _Client_ si interfaccia con il database esclusivamente usando la Data Access Object Interface.

## Applicabilità
L'uso di questo pattern è legato alla standardizzazione dei metodi per l'accesso ad una base di dati, o comunque una fonte di dati. La necessità di utilizzare questo pattern nasce dal fatto che spesso fonti di dati eterogenee
hanno metodi eterogenei di accesso, ma che spesso vengono condivisi all'interno di una stessa applicazione. Standardizzando le operazioni, ci assicuriamo che sia possibile usare una stessa interfaccia per accedere a diverse fonti di dati in maniera
corretta.

## Conseguenze 
Il pattern quindi riduce la scrittura del codice per accedere ad una fonte di dati, ed allo stesso tempo garantisce la correttezza di questo
