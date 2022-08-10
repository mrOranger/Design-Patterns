# Visitor Design Pattern
Il Design Pattern __Visitor__ è un pattern comportamentale, ossia che agisce sul comportamento 
interno di una classe, senza modificarne la struttura. L'idea dietro questo pattern è quella
di specificare e modificare le operazioni di una classe, senza che si modifichino gli elementi
sui quali questa opera. 

Ad esempio, se supponiamo di avere una classe astratta che definisce due varianti di uno stesso 
metodo, la soluzione "classica" consiste nel definire i due metodi all'interno della classe astratta,
quindi implementare i due metodi nelle sotto-classi concrete. Se da un lato questa soluzione sembra
la più intuitiva, non è la migliore, in quanto per prima cosa deleghiamo al metodo di accedere 
a delle informazioni di cui non dovrebbe esserne a conoscenza, ed in secondo luogo, non rendiamo
flessibile la classe, se in futuro questa richiederà di modificare i metodi o di aggiungere altri.

Quindi, con il pattern Visitor, andiamo a scollegare i metodi dalla classe, rendendoli oggetti sui
quali la classe manterrà un riferimento, e che quindi possono essere cambiati dinamicamente in base
alle necessità.

## Partecipanti
I partecipanti del pattern Visitor sono i seguenti:
- __Visitor__, è l'interfaccia che definisce i metodi che vogliamo implementare nelle loro varie versioni.
- __Concrete Visitor__, è la classe concreta che implementa l'interfaccia Visitor, e quindi
fornisce una variante dell'implementazione, da passare in maniera dinamica all'oggetto che 
userà quell'operazione.
- __Element__, definisce un metodo __accept__ che riceve come parametro un Visitor, e quindi
invoca il relativo metodo di questo.
- __Concrete Element__, implementa l'interfaccia Element, con il relativo riferimento a Visitor.
- __Object Structure__, è la classe che contiene gli oggetti a cui si vuole effettivamente accedere
usando il metodo accept.

## Applicabilità
Usare il pattern Visitor, può rivelarsi utile nelle seguenti circostanze:
- Quando la struttura di una classe cambia raramente, ma quello che cambia spesso sono le operazioni
al suo interno.
- Quando si viene a creare una gerarchia di classi, con implementazioni diverse in base
alla classe di appartenenza.
- Quando si vuole evitare di "inquinare" un'interfaccia con le diverse operazioni disponibili,
e quindi queste vengono raggruppate all'interno di una classe comune, su cui vengono poi richiamate.

## Conseguenze
Tra i vantaggi e gli svantaggi di questo pattern possiamo elencare:
- _Permette di aggiungere facilmente nuove operazioni_, semplicemente definendo una nuova
versione dell'interfaccia Visitor, da passare dinamicamente.
- Si accoppiano le _operazioni correlate disaccoppiandole da quelle scorrelate_. Questo avviene
perché Visitor raggruppa lo stesso tipo di operazioni all'interno di un'unica classe Concrete Visitor.
- Rende difficile l'aggiunta di nuove classi ConcreteElement.
- _Rottura dell'incapsulamento_, in quanto Visitor implementa nelle classi ConcreteElement metodi
pubblici che contengono uno stato interno di un elemento. 
 