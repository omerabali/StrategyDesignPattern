public class Yonerici {
    private Mesaj suan;
    public void Yonetici(Mesaj yeni) {
        this.suan=yeni;
    }
    public void Sec(){
        if(suan==null){
            System.out.println("strateji seçilmedi");
        }
        else{
            suan.gonder();
        }
    }
}
