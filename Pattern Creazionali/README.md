# Design Pattern Creazionali

I Design Pattern Creazionali si occupano di astrarre il processo di instanziazione degli oggetti di 
una classe, aiutando il sistema ad essere indipendente dalle modalità di composizione e rappresentazione
degli oggetti usati.

La necessità di usare questa categoria di pattern nasce dall'esigenza di un progetto di non rendere
esplicito il processo di creazione di un oggetto, in quanto è necessario cambiare a tempo
di esecuzione il tipo di oggetto su cui dobbiamo lavorare.

Ci sono due elementi che caratterizzano questa tipologia di pattern: la capacità di incapsulare
la conoscenza delle classe concrete usate nel sistema e la capacità di nascondere
le modalità di creazione e composizione di tali classi. 

Tuttavia, i pattern creazionali non forniscono un modo per rendere un progetto più compatto
ma invece per renderlo più flessibile rispetto ad una normale soluzione.

A questa categoria di pattern appartengono:
- __Factory Method__
- __Abstract Factory__
- __Builder__
- __Prototype__
- __Singleton__
