import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Akasya Durağı' na hoşgeldiniz.");
        System.out.println("Telefon numaranızı giriniz: ");
        Scanner tlf=new Scanner(System.in);
        String telefonNumarasi = tlf.nextLine();
        System.out.println("Telefon numaraniz: " + telefonNumarasi+"  Uygulamaya Giriş Yapıldı");
        // Muşteriler için ekleme  algoritması öğrenicez.

        Taksi siyah=new siyahTaksi();
        Taksi servis=new sariTaksi();
        Taksi sarı=new sariTaksi();
        Taksi turkuvaz=new TurkuvazTaksi();

        Kapasite kapasiteler=new Kapasite();

        İndirimKodu i̇ndirimKodu=new İndirimKodu();

        TaksimetreAcilis st=new sari_turkuvazAcilis();
        TaksimetreAcilis ss= new servis_siyahAcilis();

        Taksilerimiz taksi=new Taksilerimiz();

        memnuniyet memnuniyetiniz=new memnuniyet();

        yemek menücagir=new yemek();




        System.out.println("Lütfen Taksi Seçiniz");
        taksi.Taksilerimiz();

        Scanner secim=new Scanner(System.in);
        int sec= secim.nextInt();

        Scanner kapasite=new Scanner(System.in);


        switch(sec){
            case 1:
                System.out.println("Kaç kişisiniz");
                int kisiSari=kapasite.nextInt();
                kapasiteler.setSariKapasite(kisiSari);
                sarı.taksiCagir();
                st.acilis();


                break;
            case 2:System.out.println("Kaç kişisiniz");
                int kisiSiyah=kapasite.nextInt();
                kapasiteler.setSiyahKapasite(kisiSiyah);
                System.out.println(kapasiteler.getSiyahKapasite());
                siyah.taksiCagir();
                ss.acilis();

                break;
            case 3:System.out.println("Kaç kişisiniz");
                 int kisiTurkuvaz=kapasite.nextInt();
                 kapasiteler.setTurkuvazKapasite(kisiTurkuvaz);
                 turkuvaz.taksiCagir();
                 st.acilis();


                break;
            case 4:System.out.println("Kaç kişisiniz");
                int kisiServis=kapasite.nextInt();
                kapasiteler.setServisKapasite(kisiServis);
                servis.taksiCagir();
                ss.acilis();


                break;

        }

        System.out.println("Yemekli araç ister misiniz ? Evet ya da hayır diye yanıt veriniz");
        Scanner y=new Scanner(System.in);
        String secim2=y.nextLine();


        yemek cagirma=new yemek();

        switch(secim2){
            case "Evet":
                System.out.println(" 1) Yemek + İçecek\n 2) Sadece İçecek");
                System.out.println("Lütfen Seçiminizi Yapınız");
                Scanner m=new Scanner(System.in);
                int secim3=m.nextInt();
                switch (secim3){
                    case 1:menücagir.menüYİ();
                      Scanner p=new Scanner(System.in);
                      int secim4=p.nextInt();

                           switch (secim4){
                               case 1:cagirma.cagir("Cips","Kola");
                                   break;

                               case 2:cagirma.cagir("Kuruyemiş","İce Tea");
                                   break;

                               case 3:cagirma.cagir("Çikolata","Su");
                                   break;

                               case 4:cagirma.cagir("Çiğköfte","Ayran");
                                   break;

                               case 5:cagirma.cagir("Sandwich","Meyve Suyu");
                                   break;

                               default:System.out.println("Yanlış Seçim Girdiniz");
                           }

                    break;

                    case 2:menücagir.menüİ();
                    Scanner l=new Scanner(System.in);
                    int secim5=l.nextInt();

                         switch (secim5){
                              case 1:cagirma.cagir("Kola");
                                  break;
                              case 2:cagirma.cagir("İce Tea");
                                  break;
                              case 3:cagirma.cagir("Su");
                                  break;
                              case 4:cagirma.cagir("Ayran");
                                  break;
                              case 5:cagirma.cagir("Meyve Suyu");
                                  break;
                              case 6:cagirma.cagir("Soda");
                                  break;

                             default:System.out.println("Yanlış Seçim Girdiniz");
                         }

                    break;

                    default:System.out.println("Yanlis Secim Girdiniz");

                }
                Scanner yiyecek=new Scanner(System.in);
                Scanner icecek=new Scanner(System.in);

                break;
            case "Hayır":
                break;
        }

        System.out.println("İndirim Kuponunuz Var mı ? Varsa 1'e yoksa 2'e tiklayiniz");
        Scanner indirim=new Scanner(System.in);
        int indirimK=indirim.nextInt();

        if(indirimK==1){
            System.out.println("Kupon Kodunuzu Giriniz");
            Scanner kod=new Scanner(System.in);
            String koduKullan=kod.nextLine();
            i̇ndirimKodu.setKuponKodu(koduKullan);
            i̇ndirimKodu.kazan();

        }

        Scanner memnuniyet=new Scanner(System.in);
        String memnun=memnuniyet.nextLine();
        memnuniyetiniz.memnuniyet();








    }
    }