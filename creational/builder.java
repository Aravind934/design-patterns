class PizzaBuilder {
    public String pizza;
    public String toppins;
    public String Cheese;
    
    public PizzaBuilder(){
        this.pizza = "Plain pizza added";
    }
   
   public void addCheese(){
       this.cheese = "Cheese added";
   }
   
   public void addToppins(){
       this.toppins = "Toppins added";
   }
   
   public PizzaBuilder build(){
       return this;
   }
}


class Main {
    public static void main(String[] args) {
        PizzaBuilder plainPizza = new PizzaBuilder().build();
        PizzaBuilder pizzaWithCheese = new PizzaBuilder().addCheese().build();
    }
}