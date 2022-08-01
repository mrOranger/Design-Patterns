# Decorator Design Patter
Il pattern __Decorator__ è un pattern strutturale che permette di "decorare" un oggetto
con una serie di altri oggetti, in maniera completamente dinamica. Per capire cosa si intenda
per decorare, si pensi all'azione di aggiunta di una componente funzionale ad un contenitore.

## Partecipanti
I partecipanti nel design pattern sono fondamentalmente quattro:
- _Component_ definisce l'interfaccia comune per gli oggetti ai quali si può aggiungere un elemento
decorativo in maniera dinamica. __La presenza di quest'interfaccia è obbligatoria per realizzare
il pattern__.
- _Concrete Component_ è l'oggetto al quale si possono aggiungere nuove responsabilità
- _Decorator_ mantiene un riferimento ad un oggetto Component e definisce l'interfaccia conforme
con la quale creare degli oggetti decorativi.
- _Concrete Decorator_ aggiunge una decorazione ad un oggetto contenitore Concrete Component.

## Applicabilità
Usare questo design pattern è giustificato per le seguenti situazioni:
- Se se viole aggiungere degli elementi dinamici ad un oggetto in maniera dinamica e trasparente.
- Sostituire il meccanismo di estensione delle responsabilità di un oggetto, mediante il meccanismo
dell'ereditarietà, che non è praticabile per la crescita delle componenti decorativi.

## Conseguenza
Usare questo pattern possiede due conseguenze positive e due negative:
- Permette una maggiore flessibilità all'uso dell'ereditarietà, evitando la creazione di classi
annidate per la creazione di oggetti con responsabilità composte.
- Evita che una classe paghi per un servizio non usato. Ad esempio, si potrebbe realizzare
una classe con una lista di componenti al posto del pattern, ma questo richiede che comunque si paghi
per un oggetto lista, che potrebbe non essere mai riempito.
- Un decorate ed una componente non sono identici, infatti una componente decorata ed una no
non sono effettivamente lo stesso oggetto.
- Si viene a creare un progetto con una gran quantità di piccoli oggetti con piccole responsabilità.

N.B.: nella sezione è stata aggiunta una cartella con un esempio di codice cattivo, che non usa il pattern.
Inoltre, la correlazione tra questo pattern e lo __Strategy__ è stretta. Se questo pattern modifica
la componenza strutturale di una classe, lo Strategy ne modifica quella comportamentale.