public class MeasureYourWeight {
   public double weight;
   public double height;
   public double measure = weight / ( height * height);

    MeasureYourWeight(double weight, double height){
        setWeight(weight);
        setHeight(height);
    }
    private void setWeight(double weight){
        if (weight > 0){
            this.weight = weight;
        } else System.exit(1);
        }
         private void setHeight(double height){
        if (height > 0){
            this.height = height;
        }else System.exit(1);
         }

    public String measureBMI(){
        if (measure < 18.5)
            return "Underweight";
        else if (measure >= 18.5 && measure < 25)
            return "Normal";
        else if (measure >= 25 && measure < 30)
            return "Overweight";
        else return "Obesity";
    }
}
