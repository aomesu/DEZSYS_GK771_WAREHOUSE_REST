Dokumentation


##Arbeitsschritte:
Zuerst habe ich das Repository geforked. Dann habe ich den Code ausgeführt um zu prüfen was schon vorhanden ist. Als ich dies Tat wurden mir Daten im JSON-Format in meinem Webbrowser angezeigt. Die Fehlenden Daten habe ich ergänzt indem ich Attribute und Setter und Getter in die Klasse WarehouseData hinzugefügt habe. Danach habe eine Klasse namens ProductData erstellt und Attributen, Setter und Getter implementiert. Zuletzt habe ich die Darstellung im XML-Format ermöglicht indem ich in WarehouseController mit:

    @RequestMapping(value="/warehouse/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public WarehouseData warehouseDataXml(@PathVariable String inID) {
        return service.getWarehouseData(inID);
    }

eine RESTful Schnittstelle erstellt habe und in build.gradle mit:

  implementation 'com.fasterxml.jackson.dataformat:jackson-dataformat-xml'

das Datenformat für XML hinzugefügt habe.

##Neue Erkenntnisse:
@SpringBootApplication ist eine Kombination aus drei wichtigen Spring-Annotations: @Configuration, @EnableAutoConfiguration und @ComponentScan. Sie signalisiert Spring, dass diese Klasse die Hauptkonfigurationsklasse ist, die automatische Konfigurationen aktiviert und Komponenten im aktuellen Paket sowie in den Unterpaketen scannt.

@Service kennzeichnet die Klasse als Spring-Service-Komponente. Dadurch wird sie von Spring automatisch als Bean erkannt und verwaltet.
@Service
public class WarehouseService {...

@RestController kennzeichnet die Klasse als Spring REST-Controller. Sie kombiniert die Funktionalität von @Controller und @ResponseBody, sodass Rückgabewerte von Methoden automatisch als HTTP-Response serialisiert werden (z.B. als JSON oder XML):
	@RestController
	public class WarehouseController {...

@Autowired wird verwendet, um automatisch Abhängigkeiten (z.B. Beans) in Spring-Komponenten einzufügen, sodass diese vom Spring-Framework bereitgestellt und verwaltet werden.
@Autowired
    private WarehouseService service;

@RequestMapping wird in Spring verwendet, um HTTP-Anfragen einem bestimmten Controller-Methode zuzuordnen. Sie definiert den Pfad (z.B. /warehouse/{inID}/json), die unterstützten HTTP-Methoden und das Response-Format (z.B. JSON oder XML). So weiß Spring, welche Methode bei einer bestimmten URL und Anfrageart ausgeführt werden soll.
@RequestMapping(value="/warehouse/{inID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public WarehouseData warehouseData( @PathVariable String inID ) {
        return service.getWarehouseData( inID );
    }

##Aufgetretene Probleme:	
Die Daten konnten nicht als XML-Format in meinem Browser angezeigt werden. Das Problem habe ich gelöst, indem ich einen anderen Browser verwendet habe.