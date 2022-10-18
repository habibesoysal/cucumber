Feature: US1002 Kullanici TutorialsNinjaPage sayfasinda sepetine urun ekleyebilmeli

  Scenario: TC01 Kullanici sayfadan sepetine urun ekleyebilmeli
    Given kullanici TutorialsNinja anasayfasinda
    Then kullanici Phones & PDAs'a tiklar
    And telefon markalarini alir
    Then tum ogeleri sepetine ekler
    And sepetteki isimleri alir
    And sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir
    Then sayfayi kapatir