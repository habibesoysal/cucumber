Feature: US1003 Kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Nutella "icin arama yapar
    And sonuclarin "Nutella" icerdigini test eder
    Then sayfayi kapatir