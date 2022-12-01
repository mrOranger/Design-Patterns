# Proxy Design Patter
Spesso sentiamo parlare del concetto di __Proxy__ in ambito web, e letteralmente un Proxy è un oggetto che si interpone tra altri due, per alleggerire il carico di lavoro.
Un esempio molto comune dell'applicazione di questo pattern è presente nella applicazioni mobile. Quando viene creata un'interfaccia che contiene delle immagini, noi non vogliamo che la user experience venga sovraccaricata del caricamento di queste immagini, presenti magari su un server remoto. Allora, usato il Proxy pattern, deleghiamo il caricamento ad un altro oggetto, il quale sostituisce temporaneamente l'immagine con un riquadro delle stesse dimensioni, ma vuoto, ed in background carica l'immagine.

## Partecipanti
I partecipanti a questo pattern sono sostanzialmente quattro:
- Il _Client_ che contiene riferimento ad un'interfaccia _Subject_.
- L'interfaccia _Subject_ contiene il metodo che vogliamo utilizzare, e di cui se ne occuperò il Proxy.
- Il _Proxy_ è un oggetto che implementa il compito del subject, ma che contiene un riferimento a degli oggetti concreti come il _Real Subject_.
- Infine, il _Real Subject_ è la classe concreta che implementa il metodo richiesto dal Proxy.

## Applicabilità
Esistono svariante situazioni in cui il pattern è applicabile:
- Nel caso del web come abbiamo citato, esistono i __Proxy Remoti__.
- Mentre nella programmazione un __Proxy Virtuale__ si occupa della creazione di oggetti costosi, come nel caso dell'applicazione mobile.
- Il _Proxy di Protezione_ si occupa di regolare gli accessi a delle risorse critiche. In maniera simile a quanto avviene con un buttafuori, questo è spesso implementato nei Kernel.

## Conseguenze
Come abbbiamo detto in precendenza, il pattern può essere applicato in svariate circostanze, sia dalla gestione della sicurezza, che dall'alleggirimento del carico applicativo. Un esempio concreto di questo pattern è presente anche nell' _Aspect Oriented Programming_, ed in particolare in Spring. 