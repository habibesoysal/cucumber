@test
Feature: US1001 Kullanici istenilen sitelerde arama yapabilmeli

  Scenario: TC01 Kullanici  Google uzerinden Trendyol a gidip urun aratir
    Given kullanici "googleUrl" anasayfasinda
    Then kullanici googleda "trendyol" aratir
    And  kullanici  trendyolda "makas" aratir
    And kullanici trendyoldan toplam urun sayisini alir

  Scenario: TC02 Kullanici yeni sekmede Morhipoya gider
    Given kullanici yeni sekme acar
    Then kullanici "googleUrl" anasayfasinda
    Given kullanici googleda "morhipo" aratir
    And kullanici morhipoda "makas" aratir
    And kullanici morhipodan toplam urun sayisini alir

  Scenario: TC03 Kullanici trendyol ve morhipodaki urun sayisini karsilastirir sayfalari kapatir
    And iki sitedeki toplam makas sayisini karsilastirir
    Then Once urun sayisi fazla olan siteyi kapatir
    And Sonra diger sayfayida kapatir
