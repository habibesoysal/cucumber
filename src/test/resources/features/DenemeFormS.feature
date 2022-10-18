@practiceForm
Feature: Form Doldurma

  Scenario Outline: Practice Form Doldurma

    Given kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" anasayfasina gider
    When username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
    And bir dosya yukler
    And checkbox1 i secer
    And radio2 yi secer
    And selection item3 secer
    And dropdown itmem4 secer
    And submite tiklar
    And dosyanin yuklendigini dogrular

    Examples:
      | kullanici adi | sifre | metin alani |
      | kullanici adi | sifre | metin alani |
