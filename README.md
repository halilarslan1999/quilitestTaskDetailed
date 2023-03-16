# Qualitest Hands On Testautomatisierung API Tests - (BDD Framework - Cucumber)


### Codes und Tests werden erstellt von 
Halil Arslan
halilarslan.sdet@gmail.com

- Build Tool : Maven
- Bibliothek: RestAssured, cucumber-junit, gson
- Reporting: Maven-cucumber-reporting, Cucumber HTML Reports

## So führen Sie den Test durch

Hinweis: Um das Szenario von "PetStoreAddNewPet.Feature" zu führen, verwenden Sie '@wip' Tag in Cukesrunner -Klasse/Cucumber Options

## VERWENDUNG:
-Klonen Sie das Projekt\
-IMaven -Abhängigkeiten von pom.xml importieren\
-src --> test > java > com > sauce > runners > CukesRunner und click RUN button\

## INSTALLATIONSPROZEDUR UND LOGIKFIKTION DES FRAMEWORKS
1. Die Swagger-Dokumentation wurde verwendet, um Endpunkte zu erhalten, die für die REQUEST mit Base URL (https://petstore.swagger.io/v2) verwendet werden sollen\
2. Bevor ich anfange, mein Automatisierungsframework zu erstellen und meine Codes zu schreiben, habe ich Postman manuell verwendet.
  - und ich habe mit POST request eine neue Pet Id und NAME erstellt und ich habe überprüft, ob der Statuscode 200 ist.
  - Dann habe ich durch GET - Request überprüft (mit Pet Id und Name), ob die neue ID und der Name des Pets erstellt wurden. Auch Statuscode 200 überprüft \
3. Für den Test Automatisierung;
-  Cucumber (BDD) wurde als Framework und Gerkhin -Sprache verwendet \
-  mein Framework wurde mit der Programmiersprache Java erstellt.\
-  Maven als Build -Automatisierungswerkzeug wurde für mein Java -Projekt verwendet. \
-  Cucumber-Junit und Cucumber Runner wurden verwendet, um Tests zu orchestrieren.\
-  Im Cucumber Runner wurde gluer verwendet, um Feature-Files mit step definitions zu verbinden. \
-  Das Report -Plugin wurde zu Cucumber Runner hinzugefügt, um JSON- und HTML -Bericht zu generieren. \
-  Ich habe ein Utilities Paket, das utilities Klasse wie Configuration Reader enthält, mit dem ich property datei erreichen und lesen kann, in denen ich dynamische Eigenschaften wie Base-URL und END-POINTS abgelegt habe.\
-  Cucumber Scenario Outline und Example Feature wurden verwendet um mit vielen pet ID und Name die test cases durchzuführen.\
-  Die Hook-Klasse wird als Before- und After-Test-Implementierung verwendet, und ich habe die Basis-URL von @Before annotation aufgerufen.\
-  STEP -Definition Folder ist der Ort, an dem meine tatsächlichen Testskripte vorhanden sind. \
-  DataApi Class unter dataForApi-Folder verwendet, die für die Implementierung von Body im Zusammenhang mit JSON verwendet werden.\
-  Im request folder werden request classe erstellt und zum Implementieren von GET - POST-Anforderungs mit Hamcester-Matcher- und restAssure-Methoden verwendet.\
-  Für Assertion/Verifizierungen, um erwartete und tatsächliche Ergebnisse zu vergleichen , ob etwas im Body enthalten ist, wurdeHamcrest-Matcher verwendet.\
-  Tags wurden benutzt für Tests in großen Mengen auszuführen.\
-  Das Framework ist einfach zu warten und zu erweitern, da es verständlich, benutzerfreundlich und so dynamisch wie möglich ist.
Wenn es erforderlich ist, sich eingehender mit Request und Response t im API-Test zu befassen, kann dies einfach so geändert werden.\
