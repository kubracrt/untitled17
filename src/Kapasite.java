public class Kapasite {
    private int kapasite;
    public void setSariKapasite(int kapasite){
        if(kapasite<=4){
            this.kapasite=kapasite;
        }
        else{
            System.out.println("Bu taksi size uygun değildir lütfen farklı bir taksiyle devam ediniz");
        }
    }
    public int getSariKapasite(){
        return kapasite;
    }
    public void setSiyahKapasite(int kapasite){
        if(kapasite<=8){
            this.kapasite=kapasite;
        }
        else{
            System.out.println("Bu taksi size uygun değildir lütfen farklı bir taksiyle devam ediniz");
        }

    }
    public int getSiyahKapasite(){
        return kapasite;
    }
    public void setServisKapasite(int kapasite){
        if(kapasite<=20){
            this.kapasite=kapasite;
        }
        else{
            System.out.println("Servis araçlarımız maks 20 kişiliktir");
        }

    }
    public int getServisKapasite(){
        return kapasite;
    }
    public void setTurkuvazKapasite(int kapasite){
        if(kapasite<=6){
            this.kapasite=kapasite;
        }
        else{
            System.out.println("Bu taksi size uygun değildir lütfen farklı bir taksiyle devam ediniz");
        }
    }
    public int getTurkuvazKapasite(){
        return kapasite;
    }
}
