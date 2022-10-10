Feature: US1005 dogru kullanici adi ve sifre ile giris yapilabilmeli

  Scenario: TC08 positive login test
    Given kullanici "hotelMyCampUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir