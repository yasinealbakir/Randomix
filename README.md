# Randomix

Randomix, Java tabanlı, rastgele veri üretimi sağlayan bir kütüphanedir. 
Test ve geliştirme süreçlerinde kullanılmak üzere isim, soyisim, şehir, ilçe vb. gibi sahte veriler üretir.

## Özellikler

- Rastgele isim, soyisim, şehir ve ilçe, tckn, vgn, e-posta, telefon no, kullanıcı adı, tarih üretme
- JSON tabanlı veri setleriyle esnek yapı

## Random Oluşturulabilen Veriler
- TCKN
- VGN
- Ad (Erkek, Kadın, Baba Adı , Anne Adı , Rastgele, Tam Ad)
- Soyad
- İl
- İlçe
- Parola
- Kullanıcı Adı
- E-Posta
- Telefon (Cep ve Ev Telefonu)
- Tarih (Doğum Tarihi, Günün Tarihi, Günün Saati)
- Şirket Adı
- Kan Grubu
- Cinsiyet
- Medeni Hal
- Ülke
- Uyruk
- Din
- Adres

## Kurulum

- Projeyi derlerdikten sonra oluşan .jar uzantılı dosyayı ve lib klasöründe yer alan json kütüphanesini projenize import edin.
- Kullanmak istediğiniz sınıfa "import com.randomix.Randomix" olarak import edin.
- "Randomix.ad().erkek()", "Randomix.soyad", "Randomix.sehir", "Randomix.ilce(sehir)" şeklinde çağırarak kullanabilirsiniz.

