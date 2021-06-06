package base;

public class BMI {
    public int height;
    public int weight;
    public float bmi;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public float getBmi() {
        return bmi;
    }

    public void calcBMI(){
        final int a = 703;
        setBmi((float)weight/(height*height)*a);
    }

}
