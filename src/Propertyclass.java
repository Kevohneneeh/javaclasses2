public class Propertyclass {
    String name, mActor;
    double rating;

    public Propertyclass(String name, String mActor, double rating) {
        this.name = name;
        this.mActor = mActor;
        this.rating = rating;
    }
    public String toString(){
        return "\nName = "+name+"\nActor = "+mActor+"\nRating = "+rating+"\n\n";
    }
}
