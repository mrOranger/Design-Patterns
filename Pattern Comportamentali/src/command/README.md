# Command Design Pattern

Il design pattern command incapsula un'operazione all'interno di una classe, per rendere questa operazione
risuabile ed esportabile in altri contesti d'uso. Supponiamo infatti che ci sia un'operazione
realizzabile in diverse classi, se implementassimo quest'operazione all'interno del corpo delle classi
le renderemo in una certa maniera dipendenti da queste. Se quindi le operazioni cambinano 
o decidiamo di aggiungere nuove operazioni, dovremmo ritoccare ogni volta il codice della classe.
Il pattern allora ha l'idea di rendere l'operazione un oggetto legabile ad una classe. 

## Partecipanti
I partecipanti a questo design pattern sono:
- __Command__ è l'interfaccia che definisce l'opreazione da implementare.
- __Concrede Command__ è l'implementazione dell'operazione concreta che viene passato come riferimento.
- __Receiver__ è il soggetto su cui viene applicata l'operazione.
- __Invoker__ è il soggetto che invoca l'operazione tramite l'interfaccia Command, e che contiene
riferimento a questa. 
- __Client__ crea un'interfaccia di command e ne imposta il ricevente. 

## Applicabilità
E'opportuno usare il design pattern nei seguenti scenari:
- Per _parametrizzare_ gli oggetti rispetto ad un'operazione da compiere, ad esempio è quello
che accade con una __callback__, cioè un'operazione che viene immagazzinata per essere in seguito
eseguita.
- Per eseguire e specificare un'operazione in tempi diversi, in questo caso usando una classe
che gestisce una struttura dati di operazioni che successivamente verranno eseguite.
- Per consentire l'annullamento di operazioni.
- Per organizzare il sistema in operazioni ad alto livello, che si basano su operazioni primitive.

## Conseguenze

L'uso del pattern Command ha le seguenti conseguenze su un programma:
- Disaccoppia l'oggetto che invoca un'operazione da quello che la porta a termine.
- Permette di comporre un comando in comandi composti.
- Rende più facile l'aggiunta e la modifica di comandi. 