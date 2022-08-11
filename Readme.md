# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06
# Ödev - Boks Oyunu
Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.

## Programın Çalışması
- Fighter sınıfından oluşturulur.
- Nesnelere "İsim,Kilo,Hasar değeri ve kaçınma şansı (%)" değerleri atanır.
- Musabaka oluşturulur.
- Musabakanın kilo limitleri ve dövüşçüleri atanır.
- Dövüşçülerin kilo değerleri ,musabaka oluşturulurken atanen kilo sınırları içerisinde olup olmadığı kontrol edilir.
- Bir rand değişkeni oluşturulur ve program her başladığında 0-99.99 arası bir değer atanır.
- Eğer 0-49.99 arasında ise 1.nesne,değilse 2.nesne ilk başlayan olacaktır.
- "True" değerine sahip bir while döngüsü oluşturulur.
- 1.Nesnenin sağlık değerine , 2.nesnenin hit metodundan gelecek değer atanır.(İlk vuranın 2.nesne olduğu varsayılmıştır.)
**Hit Metodu :**
Metot parametre olarak Fighter sınıfından foe isimli bir değişken alır.foe değişkeni hasar alan nesnedir.
- Örnek:
Match sınıfından run metodu için : 1.nesnenin sağlığı = 2.nesne.hit(1.nesne) olacak şekilde bir kod bloğu çalışır.
foe = 1.nesne olarak atanır ve foe.healt-this.damage değeri döndürülür.Burada 1.nesnenin sağlık değeri olarak 1.nesnenin sağlık değerinden - 2.nesnein hasar değeri çıkarılarak elde edilen değer döndürülür.
Ayrıca bir if şartı ile nesne gelen hasarı bloklayıp bloklamadığı kontrol edilir. boolean türünden  dodgeChange isimli bir metod
oluşturulur. metod içerisinde 0-99.99 arası bir sayı oluşturulur ve sayı nesnenin dodge şansından küçükse true değeri döndürülür.
isDodge true olduğundan nesnelerin sağlığında bir değişim olmaz.
- Her vuruşta isWin şartı kontrol edilir.isWin boolean türünden bir metod olup nesnelerin birinin sağlığı  0 olduğunda true değeri döndürür.
- Kazan oyuncu ekrana yazdırılıp program biter.



