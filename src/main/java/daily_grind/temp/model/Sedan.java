package daily_grind.temp.model;

public class Sedan extends Car {

    int wheelNumber;

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "carNumber='" + carNumber + '\'' +
                ", wheelNumber=" + wheelNumber +
                '}';
    }
}
