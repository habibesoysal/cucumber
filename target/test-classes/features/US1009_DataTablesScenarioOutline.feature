Feature: US1009 Dtatables sitesine 5 farkli giris yapalim

  Scenario Outline: TC14 5 farkli kayit girisi yapilabilmeli

    When kullanici "dataTablesUrl" anasayfasinda
    Then new butonuna basar
    And  isim bolumune "<firstname>" girer
    And kullanici 1 saniye bekler
    And  soyisim bolumune "<lastname>" girer
    And kullanici 1 saniye bekler
    And  position bolumune "<position>" girer
    And kullanici 1 saniye bekler
    And  office bolumune "<office>" girer
    And kullanici 1 saniye bekler
    And  extension bolumune "<extension>" girer
    And kullanici 1 saniye bekler
    And  startdate bolumune "<startDate>" girer
    And kullanici 1 saniye bekler
    And  salary bolumune "<salary>" girer
    And kullanici 1 saniye bekler
    And  create butonuna basar
    When kullanici "<firstname>"  ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular

    Examples:
    |firstname|lastname|position|office|extension|startDate|salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000|
    |Huseyin  |Kacmaz  |ba      |berlin|-        |2022-07-10|40000|
    |Fatih    |Sahin   |po      |berlin|-        |2022-03-12|45000|
    |Ahmet    |Kaya    |tester  |ankara|database |2022-06-06|11000|