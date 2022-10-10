Feature: US1011 Web Tablosunda istenen sutunu yazdirmak

  Scenario: TC16 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruUrl" anasayfasinda
    And "Company" sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir