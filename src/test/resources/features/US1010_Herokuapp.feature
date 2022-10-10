Feature: US1010 herokuapp delete testi

  @heroku
  Scenario: TC15 herokuapp den delete butonu calismali
    Given kullanici "herokuUrl" anasayfasinda
    And add element butonuna basar
    Then delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna basar
    #And delete butonunun gorunmedigini test eder
    And sayfayi kapatir