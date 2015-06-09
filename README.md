# SpringRemote
E' stato creato un esempio di servizi sviluppati con Spring Remote. <br>
Di seguito viene riportato l'elenco dei progetti ed una breve descrizione.<br>

## ExampleRemote-api
Questo progetto contiene le seguenti cose:<br>
1. MioSitoConfiguration (classe di configurazione dei servizi: host, porta, contextRoot)<br>
2. Api per la chiamata al servizio (l'oggetto di passaggio UtenteRegistrazione e l'interfaccia esposta IMioSitoService)<br>

## ExampleRemote-impl
Questo progetto contiene l'implementazione delle api, ha semplicemente la dipendenza al progetto "api" e implementa l'iterfaccia IMioSitoService<br>

## ExampleRemote-web
Questo progetto serve per pubblicare su un WAS il servizio.<br>
Ha semplicemente la dipendenza al progetto "impl" ed espone il servizio come una servlet attraverso alcune configurazioni Spring (utilizza le classi Spring HttpInvokerServiceExporter, SimpleUrlHandlerMapping e DispatcherServlet)

## ExampleRemote-client
Questo progetto sarà il pacchetto distribuibile del nostro servizio e si occuperà di chiamare il servizio via web.<br>
Ha semplicemente la dipendenza al progetto "api" e si occupa di creare l'url da richiamare per chiamare il servizio (ServiceLocator.java)<br>
La classe che richiama il servizio via web è MioSitoClient

## ExampleRemote-main e ExampleRemote-mainSpring
Questi progetti sono quelli di test del nostro servizio. Hanno la dipendenza alla libreria "client", quindi per loro è trasparente il fatto che si tratta di una chiamata web.

# Configurazioni Necessarie
Per utilizzare l'esempio è necessario configurare sul Workspace Tomcat o un altro WAS sul quale deployare il progetto "web".<br>
Il servizio web sarà disponibile al link http://locahost:8080/ExampleRemote-webExampleRemote-web/remoting/IMioSitoService

