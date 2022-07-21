package Question2;

public class Meal {
    private String name;
    private Double proteinContentInMilligram;
    private Double carbonHydrateContentInMilligram;
    private Double fatContentInMilligram;

    public Meal(String name, Double proteinContentInMilligram, Double carbonHydrateContentInMilligram, Double fatContentInMilligram){
        this.name = name;
        this.proteinContentInMilligram = proteinContentInMilligram;
        this.carbonHydrateContentInMilligram = carbonHydrateContentInMilligram;
        this.fatContentInMilligram = fatContentInMilligram;
    }



    public String getName() {
        return this.name;
    }

    public Double getProteinContentInMilligram() {
        return this.proteinContentInMilligram;
    }

    public Double getCarbonHydrateContentInMilligram() {
        return this.carbonHydrateContentInMilligram;
    }

    public Double getFatContentInMilligram() {
        return this.fatContentInMilligram;
    }

    public String toString() {
        return "Meal(name=" + this.getName() + ", proteinContentInMiligram=" + this.getProteinContentInMilligram() + ", carbonHydrateContentInMiligram=" + this.getCarbonHydrateContentInMilligram() + ", fatContentInMiligrm=" + this.getFatContentInMilligram() + ")";
    }
}
