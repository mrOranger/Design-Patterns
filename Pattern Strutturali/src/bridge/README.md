# Bridge Design Pattern

L'idea del pattern _Bridge_ è separare l'astrazione di un concetto dalla sua effettiva implementazione.
Ad esempio, supponiamo di essere in un sistema informatico di una casa produttrice di strumenti musicali,
questa casa produce sia chitarre che sassofoni. Una rappresentazione intuitiva del nostro dominio,
prevede la definizione dell'interfaccia strumento musicale, e quindi delle due implementazioni
Chitarra e Sassofono. Tuttavia, questi strumenti hanno una diversa configurazione per persone mancine,
quindi dovremmo in realtà aggiungere le implementazioni ChitarraDx, ChitarraSx, SassafonoDx e SassafonoSx.
Da notare che all'aumentare delle classi, aumenta in senso orizziontale la gerarchia di oggetti
da rappresentare. In questa circostanza ci viene in aiuto il patter Bridge, che disaccoppia
gli strumenti dalle possibili configurazioni.

## Partecipanti
Il pattern prevede il coinvogimento dei seguenti partecipanti:
- __Abstraction__ (Strumento) definisce l'interfaccia sulla quale è compiuta l'astrazione dei 
nostri oggetti, e che possiede un riferimento all'interfaccia che definisce l'implementazione
dell'astrazione.
- __RefinedAbstraction__ (Chitarra, Sassofono) estende l'interfaccia _Abstraction_ e rappresenta
gli oggetti concreti con cui avremo a che fare.
- __Implementator__ è l'interfaccia usata dalle classi che implementano l'astrazione. Diversamente
dall'intefaccia _Abstraction_ essa fornisce solo le implementazioni di base, mentre Abstraction
quelle di alto livello.
- __Concrete Implementator__ (ChitarraSx, ChitarraDx ...) definisce la realizzazione concreta di
_Implementator_. 

## Applicabilità
Usare il pattern bridge può essere utili nelle seguenti situazioni:
- Si vuole evitare di legare l'implementazione all'astrazione, come nel caso della creazione
degli oggetti musicali. 
- Si vuole avere la possibilità di estendere sia le astrazioni che le implementazioni. Ad esempio,
se volessimo aggiungere una nuova implementazione di un nuovo strumento musicale (Clarinetto), 
usando il pattern non dovremmo creare due classi ClarinettoSx e ClarinettoDx, ma solamente una 
classe Clarinetto, ed usare le astrazioni Sx e Dx.
- Non si vuole avere ripercussione sul Client quando si cambia un'astrazione.
- Evitare la proliferazione di classi che si creerebbe usando l'ereditarietà, 
come descritto in partenza. 

## Conseguenze
Applicare il pattern bridge, ha le seguenti conseguenze nell'implementazione di un sistema:
- Si _disaccoppia l'interfaccia dall'implementazione_. In questa maniera, i cambiamenti su un'
astrazione non si riflettono in maniera eccessiva sulle implementazioni, permettendo quindi una 
maggiore flessibilità al cambiamento.
- _Maggiore estensibilità_, in quanto le classi Abstraction ed Implementator possono essere estese
indipendentemente.
- _Mascheramento dei dettagli dell'implementazione_ in quanto i client non devono preccuparsi
dei dettagli implementativi su un'implementazione.
