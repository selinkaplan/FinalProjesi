# FinalProjesi

# Uçak Bilet Rezervasyon Sistemi

Bu proje, bir uçak bilet rezervasyon sistemi uygulamasını içermektedir. Uygulama, kullanıcılara uçakları ekleyebilme, lokasyonlar oluşturabilme, rezervasyonlar yapabilme ve oluşturulan rezervasyonları listeleyebilme gibi işlevler sunmaktadır.

## Proje Yapısı

Proje aşağıdaki bileşenleri içermektedir:

- `Ucak` sınıfı: Uçak bilgilerini temsil eder. Model, marka, seri numarası ve koltuk kapasitesi gibi özellikleri tutar.
- `Lokasyon` sınıfı: Lokasyon bilgilerini temsil eder. Ülke, şehir, havaalanı ve aktiflik durumu gibi özellikleri bulunur.
- `Rezervasyon` sınıfı: Rezervasyon bilgilerini temsil eder. Kalkış yeri, varış yeri, koltuk numarası ve müşteri gibi bilgilerini içerir.
- `Musteri` sınıfı: Müşteri bilgilerini temsil eder. Ad, soyad, yaş, engel durumu, e-posta ve telefon gibi bilgileri içerir.
- `Uygulama` sınıfı: Ana sınıf olup uygulamanın çalıştırıldığı yerdir. Menü seçeneklerini sunar ve kullanıcının seçimine göre ilgili işlemleri gerçekleştirir.

## Kullanım

Uygulamayı çalıştırmak için `Uygulama` sınıfındaki `main` metodu kullanabilirsiniz. Uygulama başladığında, kullanıcıya bir menü sunulur ve kullanıcının seçimine göre ilgili işlem gerçekleştirilir. Menüdeki seçenekler şunlardır:

1. Uçak Ekle: Yeni bir uçak eklemek için kullanılır. Uçak bilgileri, kullanıcıdan alınarak sisteme eklenir.
2. Lokasyon Ekle: Yeni bir lokasyon eklemek için kullanılır. Lokasyon bilgileri, kullanıcıdan alınarak sisteme eklenir.
3. Rezervasyon Yap: Bir rezervasyon oluşturmak için kullanılır. Kalkış yeri, varış yeri, koltuk numarası ve müşteri bilgileri kullanıcıdan alınır ve rezervasyon sisteme eklenir.
4. Rezervasyonları Listele: Oluşturulan rezervasyonları listeleyen bir rapor oluşturur.
0. Çıkış: Uygulamadan çıkış yapmak için kullanılır.
