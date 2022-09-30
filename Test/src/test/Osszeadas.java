package test;

public class Osszeadas {
    double elso;
    double masodik;
    double vegP;
    double vegM;
    double vegSz;
    double vegO;

    public Osszeadas(int elso, int masodik) {
        this.elso = elso;
        this.masodik = masodik;
        this.muveletP();
        this.muveletM();
        this.muveletSz();
        this.muveletO();
    }
    
    private void muveletP (){
        vegP = elso + masodik;
    }
    private void muveletM (){
        vegM = elso - masodik;
    }
    private void muveletSz (){
        vegSz = elso * masodik;
    }
    private void muveletO (){
        vegO = elso / masodik;
    }
    
    public void megGoldontam(int sorSzam, int ujSzam){
        switch (sorSzam) {
            case 1:
                elso = ujSzam;
                break;
            case 2:
                masodik = ujSzam;
                break;
            default:
                System.out.println("Anyáddal szórakozz");
                break;
        }
    }

    @Override
    public String toString() {
        return "A művelet (Összeadás) | "+elso+" + "+masodik+" = "+vegP+
                "\nA művelet (Kívonás) | "+elso+" - "+masodik+" = "+vegM+
                "\nA művelet (Szorzás) | "+elso+" * "+masodik+" = "+vegSz+
                "\nA művelet (Osztás) | "+elso+" / "+masodik+" = "+vegO;
    }
    
    
}
