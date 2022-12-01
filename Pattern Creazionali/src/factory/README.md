# Factory Method
Il Factory Method definisce un'interfaccia per la creazione di oggetto di diverso tipo, appartenenti ad un altra inferfaccia. Attraverso il Factory Method viene creata un'unica istanza della relativa classe, sulla quale poi vengono eseguti i metodi della classe contenuta.

## Partecipanti
I partecipanti di questo pattern sono:
- Il __Prodotto__ che definisce l'interfaccia della gerarchia di oggetti che vogliamo manipolare.
- Il __Prodotto Concreto__ è invece l'implementazione dei metodi definiti nell'interfaccia Prodotto.
- Il __Creatore__ dichiara il metodo factory attraverso il quale creiamo un oggetto di tipo Prodotto.
- Il __Creatore Concreto__ è l'implementazione dell'interfaccia Creatore che implementa il factory method, con il prodotto concreto da restituire. 

## Applicabilità
Nel framework Spring Boot viene definito il concetto di __Dependency Injection__, attraverso il quale viene creata un'istanza di un'interfaccia in maniera automatica da parte di Spring. Il Design Pattern Factory segue questo principio, infatti trova applicabilità nei seguenti scenari:
- Una classe non è in grado di sapere in anticipo quale oggetto concreto dovrà usare. Come un Spring, non sappiamo quale implementazione particolare verrà usata, ma sappiamo solamente che seguirà una particolare interfaccia.
- Una classe vuole che le sue sottoclassi scelgano gli oggetti da creare.
- Viene delegata la creazione di una classe concreta ad una o più classi di supporto.

## Conseguenza
L'utilizzo del Factory pattern elimina quindi la necessità di riferisi direttamente ad una classe concreta all'interno del codice. Tuttavia, questo potrebbe anche essere uno svantaggio se siamo in presenza di un'unica classe concreta che si riferisce ad un'interfaccia, per la creazione di un unico Prodotto Concreto. L'uso del Factory Pattern ha però le seguenti due conseguenze:
- _Fornisce un punto di aggancio comune per le sottoclasse_, fornendo una maggiore flessibilità al codice nella creazione dell'oggetto.
- _Connette gerarchie di classi parallele_, molto utile nel caso in cui siamo in presenza di una gerarchia orizzontale di classi, come ad esempio i Prodotti Concreti, che vengono usati da un Creatore Concreto.