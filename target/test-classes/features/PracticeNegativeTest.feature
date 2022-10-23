@medunna
  Feature: Medunna Login Negative Test
    Scenario Outline: Negative Login Test

   Given kullanici "https://medunna.com/" sayfasina gider
   When login olmak icin signin e tiklar
   And username icin "<username>" kullanici adini gonderir
   And password icin "<password>" parolasini gonderir
   And signine tiklar
   Then Authentication information not correct uyarisini dogrular

      Examples:
        | username | password |
        | username | password |