package CoreJavaSnippets.OOPSConcepts;

public class Inheritance {
   public static void main(String[] args){
    MountainBike mtb = new MountainBike(3, 100, 25);
    System.out.println(mtb.toString());
   }
}

class Bicycle{
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){ 
        this.gear = gear; 
        this.speed = speed; 
    }

    public void applyBrake(int decrement){
        speed = speed - decrement;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public String toString(){
        return ("No. of geards are " + gear + " and the speed is " + speed);
    }
}

class MountainBike extends Bicycle{
    public int seatHeight; 

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString(){
        return (super.toString() + " seat height from child class is " + seatHeight);
    }

    
}