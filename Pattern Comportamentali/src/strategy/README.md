# Strategy Design Pattern
Lo scopo dello _Strategy Design Pattern_ è quello di creare una famiglia di algoritmi incapsularli, e quindi renderli indipendenti alla vista di una classe client che ne fa uso.

## Partecipanti
Lo _Strategy_ Pattern coinvolge i seguenti partecipanti:
- __Strategy__ ossia l'interfaccia conune che determina la chiamata allo specifico algoritmo implementato.
- __ConcreteStrategy__ è la classe che implementa l'algoritmo specifico usando l'interfaccia Strategy.
- __Context__ è la classe che fa uso di una specifica implementazione dell'algoritmo definito in un ConcreteStrategy. Esso infatti contiene un riferimento all'interfaccia Strategy, e richiede dinamicamente un algoritmo passando un oggetto ConcreteStrategy.

## Applicabilità
E' opportuno che il Design Pattern venga usato nelle seguenti circostanze:
- Molte classi correlati differiscono solamente per il comportamento di un algoritmo, in questa maniera, è possibile configurare una classe con un algoritmo specifico senza che questo venga codificato nella classe.
- Sono necessaria più varianti di uno stesso algoritmo, e quindi queste vengono codificate all'interno di diverse classi, separando le responsabilità dal client.
- Un algoritmo usa una struttura dati che non dovrebbe essere resa nota al client.
- Solleva il Client dalla scelta dell'algoritmo da parte del Client, mediante l'uso di un costrutto condizionale multiplo.

## Conseguenze
Le dirette conseguente dell'implementazione di questo pattern in un progetto sono:
- Si _blocca il meccanismo di ereditarietà_ di una classe, se in questa si vogliono implementare diverse versioni con diversi algoritmi.
- Possibilità di _cambiare dinamicamente l'algoritmo_ che si vuole implementare, senza che questo venga direttamente codificato all'interno di una classe.
- Il pattern offre una strategia all'uso di blocchi condizionali, per determinare quale algoritmo bisogna usare.
- Il Client _deve conoscere le varie implementazioni dell'algoritmo_, e quindi è soggetto a modifiche da parte di questo. 
- Aumento del numero di oggetti in una classe Client.