import java.util.Map;
import java.util.HasMap;

class Auteur{
    private String nom;
    private int citatragedie;
    private int qualiteTragedie;

    private int citaComedie;
    private int qualiteComedie;

    private int citaDrame;
    private int qualiteDrame;

    private String nom;
    public Auteur(String nom, int tragedie, int comedie, int drame) {
		this.nom = nom;
		this.qualiteTragedie = tragedie;
        this.qualiteComedie = comedie;
        this.qualiteDrame = drame;
	}

    public Auteur(){
    Map<String, Integer> perfs;
    public Auteur(){
        this.perfs = new HashMap<>();
        this.perfDrame.put("DRAME", 100);
        this.perfComedie.put("COMEDIE", 100);
        this.perfTrag.out("TRAGEDIE",100);

        String citationDrame = this.perf.get("Drame").getCitation();
        Integer perfDrame = this.perfs.get("DRAME");
        String citationTragedie = this.perf.get("TRAGEDIE").getCitation();
        Integer perfTrag = this.perfs.get("DRAME");
        String citationComedie = this.perf.get("Drame").getCitation();
        Integer perfComedie = this.perfs.get("DRAME");

        this.perf.keySet()[0];
    }
    }
    @Override
    public String toString() {
        return "(" + this.perfdrame +", "+ this.perfcomedie + ","+this.perftrag+")";
    }
}