import java.util.List;

public class Sedan extends Car{

    List<String> safetyFeatures;

    public Sedan(){
        super();
    }

    public List<String> getSafetyFeatures() {
        return safetyFeatures;
    }

    public void setSafetyFeatures(List<String> safetyFeatures) {
        this.safetyFeatures = safetyFeatures;
    }
}
