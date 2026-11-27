import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> iou;
    
    public IOU() {
        iou = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amount) {
        iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return iou.getOrDefault(toWhom, 0.0);
    }
}
