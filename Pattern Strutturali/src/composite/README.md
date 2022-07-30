# Composite Design Pattern

Il Pattern Composite permette di semplificare l'aggregazione di oggetti che possono essere sia semplici,
che aggregati a loro volta di altri oggetti. In questa maniera, si esonera il Client da distinguere
tra oggetto semplice ed oggetto composto, usando un'interfaccia condivisa.

## Partecipanti 

Il pattern è composto dalle seguenti classi:
- Component: dichiara l'interfaccia per gli oggetti che definiranno la composizione,
quindi il comportamento che questi devono avere per accedere agli elementi figlio.
- Leaf: rappresenta gli oggetti foglia nella gerarchia, che non possono avere figli.
- Composite: rappresenta il contenitore delle componenti figlie, ed il comportamento che
questo deve avere per accedere ai figli.
- Client: manipola gli oggetti della composizione usando l'interfaccia Component.

## Applicabilità

L'uso del pattern Composite è orientato a gestire problemi in cui:
- Si vuole rappresentare una gerarchia di oggetti strutturati.
- Si vuole che il Client ignori la differenza tra gli elementi che compongono la gerarichia, 
permettendo quindi a questo di usare un'interfaccia condivisa con cui trattare gli oggetti.

## Conseguenza

Usando il pattern Composite, è possibile:
- Definire gerarchie di classi composte da oggetti primitivi e composti. In questa maniera, 
è possibile comporre ulteriormente un oggetto composto usando un altro oggetto composto.
- Semplificare il Client che può trattare un oggetto composto ed uno semplice in maniera
indipendente usando l'interfaccia Component.
- Rendere più semplice l'aggiunta di nuove componenti, che implementino l'interfaccia Component.

Tuttavia, il pattern potrebbe rendere il progetto troppo generico. Rendere più facile
l'aggiunta di nuove componenti, può da un lato rendere complicato poter comporre un oggetto Composite
solamente da un determinato tipo di elementi. Per questo motivo, si rendere necessario
inserire nel pattern opportuni controlli. 