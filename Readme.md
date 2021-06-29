# Patika Works

![image](https://user-images.githubusercontent.com/49093196/123759976-178bdc00-d8c9-11eb-84e2-0fd001083756.png)

<details>
  <summary>Click for Math classes and Methods... </summary><br>

**Math Sınıfı ve Metotları**

Java bazı durumları bizim için önceden yazdığı sınıflar ile bizlerin işini kolaylaştırmıştır. Bunlardan birtanesi de Math sınıfıdır. Adında da anlaşılacağı gibi Java'da Math sınıfı matematiksel fonksiyonlar sunmaktadır. Java Math sınıfı, sayılar üzerinde matematiksel işlemler gerçekleştirmenize izin veren birçok metoda sahiptir.

Math sınıfının kullanımı şu şekildedir;

Math.MethodAdi(Parametreler)
Math Sınıfı Metotları
Metot Açıklaması Veri Dönüş Tipi

> abs(x) X'in mutlak değerini verir double|float|int|long

> acos(x) X'in arkkosinüsünü radyan cinsinden verir double

> asin(x) X'in arksinüsünü radyan cinsinden verir double

> atan(x) X'in arkini radyan cinsinden verir double

> atan2(y,x) Dikdörtgen koordinatların (x, y) kutupsal koordinatlara (r, teta) dönüştürülmesinden teta açısını verir. double

> cbrt(x) X'in küp kökünü verir double

> ceil(x) En yakın tam sayıya yuvarlanmış x değerini verir double

> copySign(x, y) İkinci kayan nokta y'nin işaretiyle birlikte ilk kayan nokta x'i verir double

> cos(x) X'in kosinüsünü verir (x radyan cinsindendir) double

> cosh(x) Çift değerin hiperbolik kosinüsünü verir double

> exp(x) e üzeri x değerini verir double

> expm1(x) e üzeri x 'in tersini verir double

> floor(x) En yakın tam sayıya yuvarlanmış x değerini verir double

> getExponent(x) X'te kullanılan yansız üssü verir int

> IEEEremainder(x, y) IEEE 754 standardında belirtildiği gibi x ve y üzerindeki kalan işlemi hesaplar double

> log(x) X'in doğal logaritmasını (e tabanında) verir double

> log10(x) X'in 10 tabanındaki logaritmasını verir double

> log1p(x) X ve 1 toplamının doğal logaritmasını (e tabanında) verir double

> max(x, y) En yüksek değere sahip sayıyı verir double|float|int|long

> min(x, y) En düşük değere sahip sayıyı verir double|float|int|long

> nextAfter(x, y) X'in y yönünde bitişiğinde değen nokta sayısını verir double|float

> nextUp(x) Pozitif sonsuzluk yönünde x'e bitişik kayan nokta değerini verir double|float

> pow(x, y) X'in değerini y'nin üssüne döndürür double

> random() 0 ile 1 arasında rastgele bir sayı verir double

> round(x) En yakın tam sayıya yuvarlanmış x değerini verir int

> rint() X'e en yakın ve matematiksel tam sayıya eşit olan çift değeri verir double

> signum(x) X'in işaretini verir double

> sin(x) X'in sinüsünü verir (x radyan cinsindendir) double

> sinh(x) Çift değerin hiperbolik sinüsünü verir double

> sqrt(x) X'in karekökünü verir double

> tan(x) Bir açının tanjantını verir double

> tanh(x) Çift değerin hiperbolik tanjantını verir double

> toDegrees(x) Radyan cinsinden ölçülen bir açıyı yakl. derece cinsinden ölçülen eşdeğer açı double

> toRadians(x) Derece cinsinden ölçülen bir açıyı yakl. radyan cinsinden ölçülen açı double

> ulp(x) X'in en az duyarlıklı (ulp) biriminin boyutunu verir double|float

</details>

<details>

  <summary>Click for String classes and Methods... </summary><br>

**String Sınıfı ve Metotları**

Java'da String sınıfları char türünden verilerden oluşmuş bir kümedir yani karakterlerden oluşur. Java işlerimizi kolaylaştırmak ve String ifadelerle işlem yapmak için String sınıfını sunar.

Java String Sınıfı Metotları
Metot | Açıklama | Veri Dönüş Tipi

> charAt() Belirtilen indisteki (konum) karakteri verir char

> codePointAt() Belirtilen indisteki karakterin Unicode'unu verir int
> codePointBefore() Belirtilen indisteki önceki karakterin Unicode'unu verir int

> codePointCount() Bu dizenin belirtilen metin aralığındaki Unicode'u döndürür int

> compareTo() İki dizeyi sözlükbilimsel olarak karşılaştırır int

> compareToIgnoreCase() Büyük / küçük harf farklılıklarını göz ardı ederek iki dizgeyi sözlükbilimsel olarak karşılaştırır int

> concat() Başka bir String'in sonuna bir karakter ekler String

> contains() Bir dizenin bir dizi karakter içerip içermediğini kontrol eder boolean

> contentEquals() Bir dizenin belirtilen CharSequence veya StringBuffer ile aynı karakter dizisini içerip içermediğini kontrol eder boolean

> copyValueOf() Karakter dizisinin karakterlerini temsil eden bir Dizi döndürür String

> endsWith() Bir dizenin belirtilen karakter (ler) ile bitip bitmediğini kontrol eder boolean

> equals() İki dizgiyi karşılaştırır. Dizeler eşitse doğru, değilse yanlış döndürür boolean

> equalsIgnoreCase() Büyük / küçük harfe ilişkin hususları göz ardı ederek iki dizeyi karşılaştırır boolean

> format() Belirtilen yerel ayarı, biçim dizesini ve bağımsız değişkenleri kullanarak biçimlendirilmiş bir dize döndürür String

> getBytes() Bu dizeyi adlandırılmış karakter kümesini kullanarak bir bayt dizisine kodlar, sonucu yeni bir bayt dizisinde saklar byte[]

> getChars() Karakterleri bir dizeden bir karakter dizisine kopyalar void

> hashCode() Bir dizenin karma kodunu verir int

> indexOf() Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir int

> intern() Aramayı belirtilen dizinde başlatarak, belirtilen karakterin ilk oluşumunun bu dizge içindeki dizini döndürür String

> isEmpty() Bir dizenin boş olup olmadığını kontrol eder boolean

> lastIndexOf() Bir dizede belirtilen karakterlerin son bulunan oluşumunun konumunu verir int

> length() Belirtilen bir dizenin uzunluğunu verir int

> matches() Normal bir ifadeye karşı bir eşleşme için bir dize arar ve eşleşmeleri döndürür boolean

> offsetByCodePoints() CodePointOffset kod noktaları tarafından verilen dizinden uzak olan bu Dize içindeki dizini döndürür int

> regionMatches() İki dizi bölgesinin eşit olup olmadığını test eder boolean

> replace() Belirli bir değer için bir dize arar ve belirtilen değerlerin değiştirildiği yeni bir dize döndürür String

> replaceFirst() Verilen normal ifadeyle eşleşen bir alt dizenin ilk oluşumunu verilen değiştirmeyle değiştirir String

> replaceAll() Verilen normal ifadeyle eşleşen bu dizenin her bir alt dizesini verilen değiştirmeyle değiştirir String

> split() Bir dizeyi bir alt dizeye böler String[]

> startsWith() Bir dizenin belirtilen karakterlerle başlayıp başlamadığını kontrol eder boolean

> subSequence() Bu dizinin bir alt dizisi olan yeni bir karakter dizisi verir CharSequence

> substring() Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ayıklar String

> toCharArray() Bu dizeyi yeni bir karakter dizisine dönüştürür char[]

> toLowerCase() Bir dizeyi küçük harflere dönüştürür String

> toString() Bir String nesnesinin değerini verir String

> toUpperCase() Bir dizeyi büyük harflere dönüştürür String

> rim() Bir dizenin her iki ucundaki boşluğu kaldırır String

> valueOf() Bir String nesnesinin ilkel değerini verir String

</details>
