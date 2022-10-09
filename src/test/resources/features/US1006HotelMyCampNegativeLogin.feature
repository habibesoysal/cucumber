#hotelMyCamp sitesinde 3 adet negative test senaryosu olusturalim
  #1- dogru username yanlis password
  #2- yanlis username dogru password
  #3- yanlis username yanlis password

  Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

    Scenario: TC09 yanlis password ile siteye giris yapilamaz
      Given kullanici "hotelMyCampUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir