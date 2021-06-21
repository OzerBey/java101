## Requirements for Homework37

> Öğrenci Not Sistemi

**Course Sınıfı Özellikleri :**

Nitelikler : name,code,prefix,note,Teacher
Metotlar : **Course()** , **addTeacher()** , **printTeacher()**

**Teacher Sınıfı Özellikleri :**

Nitelikler : name,mpno,branch
Metotlar : **Teacher()**

**Student Sınıfı Özellikleri :**

Nitelikler : name,stuNo,classes,math,english,programming,avarage,isPass
Metotlar : **Student()**, **addBulkExamNote()**, **isPass()**, **calcAvarage()**, **printNote()**

**Ödev**
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notlarınıda ortalamaya etkileme yüzdesi ile
dahil edin.

Örnek :

```
 Matematik dersinine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

MAtematik Ortalaması : (90 * 0.20) + (60* 0.80);
```
