Feature: US1004 Kullanici parametre ile configuration file i kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    And url'nin "amazon" icerdigini test eder
    Then kullanici 3 saniye bekler
    Then sayfayi kapatir