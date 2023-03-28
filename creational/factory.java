class Mobile{
    String name;
    String ram;
    String battery;
    public Mobile(String name, String ram , String battery){
        this.name = name;
        this.ram = ram;
        this.battery = battery;
    }
    public void getConfiguration(){
        System.out.println(this.name + " ,"+this.ram +" ,"+this.battery);
    }
}

enum Brand {
   HP,
   DELL
}

class MobileFactory{
    public static Mobile getInstance(Brand brand){
        if(brand.equals(Brand.HP)){
            return new Mobile("HP","250GB","5000MAH");
        }
        if(brand.equals(Brand.DELL)){
            return new Mobile("DELL","500GB","6000MAH");
        }
        return null;
    }
}


class Main{
    public static void main(String[] args){
        Mobile dell = MobileFactory.getInstance(Brand.DELL);
        dell.getConfiguration();
    }
}

