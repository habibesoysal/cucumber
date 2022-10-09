Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @ikiTest
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    @ikiTest
  Scenario: TC02 kullanici amazonda Java aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 kullanici IPhone aratir
    When kullanici amazon anasayfasinda
    And kullanici IPhone icin arama yapar
    Then sonuclarin IPhone icerdigini test eder
    And sayfayi kapatir