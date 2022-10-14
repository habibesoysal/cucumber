package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@PracticeAmazon",
        dryRun = false
)

public class TestRunner {

    /*
    Bir frameworkte bir tek Runner class i yeterli olabilir
    Runner Classinda class bodysinde hicbir sey olmaz
    Runner classimizi onemli yapan 2 adet annotation vardir
    @RunWith(Cucumber.class) notasyonu Runner classina calisma ozelligi katar -> JUnitten geliyor
    Bu notasyon oldugu icin Cucumber frameworkumuzde JUnit kullanmayi tercih ediyoruz

    features: Runner dosyasinin feature dosyalarini nereden bulacagimizi tarif eder
    glue: step definitions dosyalarini nerede bulacagimizi gosterir
    tags: o an hangi tagi calistirmak istiyorsak onu belli eder

    dryRun: iki secenek var:
    - dryRun = true -> testimizi calistirmadan sadece eksik adimlari bize verir
    gercekte calismaz,eksik adim var mi kontrol eder
    - dryRun = false -> testleri calistirir. default olan budur
     */
}
