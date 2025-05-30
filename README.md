# Randomix

Randomix, Java tabanlı, rastgele veri üretimi sağlayan bir kütüphanedir. 
Test ve geliştirme süreçlerinde kullanılmak üzere isim, soyisim, şehir, ilçe vb. gibi sahte veriler üretir.

## Özellikler

- Rastgele isim, soyisim, şehir ve ilçe, tckn, vgn, e-posta, telefon no, kullanıcı adı, tarih üretme
- JSON tabanlı veri setleriyle esnek yapı

## Random Olu�turulabilen Veriler
- TCKN
- VGN
- Ad (Erkek, Kad�n, Baba Ad�, Anne Ad�, Rastgele, Tam Ad)
- Soyad
- �l
- �l�e
- Parola
- Kullan�c� Ad�
- E-Posta
- Telefon (Cep ve Ev Telefonu)
- Tarih (Do�um Tarihi, G�n�n Tarihi, G�n�n Saati)
- �irket Ad�
- Kan Grubu
- Cinsiyet
- Medeni Hal
- �lke
- Uyruk
- Din
- Adres

## Kurulum

- Projeyi derlerdikten sonra oluşan .jar uzantılı dosyayı ve lib klasöründe yer alan json kütüphanesini projenize import edin.
- Kullanmak istediğiniz sınıfa "import com.randomix.Randomix" olarak import edin.
- "Randomix.ad().erkek()", "Randomix.soyad", "Randomix.sehir", "Randomix.ilce(sehir)" şeklinde çağırarak kullanabilirsiniz.

