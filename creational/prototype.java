import java.util.ArrayList;
import java.util.List;

class Gym {
    List<String> defaultTimings = new ArrayList<>();
    public Gym(){
        defaultTimings.add("6.30AM - 8.30AM");
        defaultTimings.add("8.30AM - 10.30AM");
        defaultTimings.add("6.30PM - 8.30PM");
        defaultTimings.add("8.30PM - 10.30PM");
    }
    public Gym(List<String>list){
        this.defaultTimings = list;
    }
   
    public Object clone(){
        List<String> temp = new ArrayList<>();
        for(String item : this.defaultTimings){
            temp.add(item);
        }
        return new Gym(temp);
    }
    
    public void printTimings(){
        System.out.println(this.defaultTimings);
    }
    
    public List<String> getTimings(){
        return this.defaultTimings;
    }
}


class Main {
    public static void main(String[] args) {
        //gym1
        Gym gym1 = new Gym();
        gym1.printTimings();
        
        //gym2
        Gym gym2 = (Gym) gym1.clone();
        gym2.getTimings().add("11.30AM - 1.30PM");
        gym2.printTimings();
        
        //gym3
        Gym gym3 = (Gym) gym2.clone();
        gym3.getTimings().add("1.30PM - 3.30PM");
        gym3.printTimings();
    }
}


