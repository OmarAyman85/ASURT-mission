package asurt_mission;

import java.util.Scanner;

//Super Class
class Animal {

    private String taxonomy;
    private String blood_type;
    private String birth_way;
    private int no_of_legs;

    public Animal() {
    }

    public Animal(String taxonomy, String blood_type, String birth_way, int no_of_legs) {
        this.taxonomy = taxonomy;
        this.blood_type = blood_type;
        this.birth_way = birth_way;
        this.no_of_legs = no_of_legs;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public void setBirth_way(String birth_way) {
        this.birth_way = birth_way;
    }

    public void setNo_of_legs(int no_of_legs) {
        this.no_of_legs = no_of_legs;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public String getBirth_way() {
        return birth_way;
    }

    public int getNo_of_legs() {
        return no_of_legs;
    }

    public void move() {
    }

    public void PrintDetails() {
    }
}

/*----------------------------------------------------------------------------------------------------------------*/
//first sub class of tiger that is a mammal
class Tiger extends Animal {

    private boolean hairy;
    private String tiger_type;

    // default constructor
    public Tiger() {
        super.setTaxonomy("mammals");
        super.setBlood_type("warm-blooded");
        super.setBirth_way("birth");
        super.setNo_of_legs(4);
        this.hairy = true;
        this.tiger_type = "The Bengal tiger";
    }

    // user constructor
    public Tiger(String taxonomy, String blood_type, String birth_way, int no_of_legs, boolean hairy, String tiger_type) {
        super(taxonomy, blood_type, birth_way, no_of_legs);
        this.hairy = hairy;
        this.tiger_type = tiger_type;
    }

    public void setHairy(boolean hairy) {
        this.hairy = hairy;
    }

    public void setTiger_type(String tiger_type) {
        this.tiger_type = tiger_type;
    }

    public boolean IsHairy() {
        return hairy;
    }

    public String getTiger_type() {
        return tiger_type;
    }

    @Override
    public void move() {
        System.out.println("it is moving using legs as it belongs to the mammals family...");
    }

    @Override
    public void PrintDetails() {
        System.out.println("Taxonomy:" + this.getTaxonomy() + "\n"
                + "Bloodtype:" + this.getBlood_type() + "\n"
                + "Birthway:" + this.getBirth_way() + "\n"
                + "NO of legs:" + this.getNo_of_legs() + "\n"
                + "Hair:" + this.IsHairy() + "\n"
                + "Type:" + this.getTiger_type() + "\n");
    }

}

/*----------------------------------------------------------------------------------------------------------------*/
//Second sub class is a shark that is a fish
class Shark extends Animal {

    private String color;
    private boolean scales;

    // default constructor
    public Shark() {
        super.setTaxonomy("Fish");
        super.setBlood_type("cold-blooded");
        super.setBirth_way("birth");
        super.setNo_of_legs(0);
        this.color = "dark grey";
        this.scales = true;
    }

    // different color constructor defined by the color of the shark the user is choosing
    public Shark(String color) {
        super.setTaxonomy("Fish");
        super.setBlood_type("cold-blooded");
        super.setBirth_way("birth");
        super.setNo_of_legs(0);
        this.color = color;
        this.scales = true;
    }

    //user constructor
    public Shark(String taxonomy, String blood_type, String birth_way, int no_of_legs, String color, boolean scales) {
        super(taxonomy, blood_type, birth_way, no_of_legs);
        this.color = color;
        this.scales = scales;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setScales(boolean scales) {
        this.scales = scales;
    }

    public boolean IsScales() {
        return scales;
    }

    @Override
    public void move() {
        System.out.println("it is swimming using fins as it belongs to the fish family...");
    }

    @Override
    public void PrintDetails() {
        System.out.println("Taxonomy:" + this.getTaxonomy() + "\n"
                + "Bloodtype:" + this.getBlood_type() + "\n"
                + "Birthway:" + this.getBirth_way() + "\n"
                + "NO of legs:" + this.getNo_of_legs() + "\n"
                + "Color:" + this.getColor() + "\n"
                + "Scales:" + this.IsScales() + "\n");
    }
}

/*----------------------------------------------------------------------------------------------------------------*/
//Third sub class is a parrot that is a bird
class Parrot extends Animal {

    private Boolean fly;
    private Boolean talk;

    // default constructor
    public Parrot() {
        super.setTaxonomy("Bird");
        super.setBlood_type("endothermic");
        super.setBirth_way("laying eggs");
        super.setNo_of_legs(2); //as it is bipedal just like all the birds
        this.fly = true;
        this.talk = true;
    }

    // user constructor
    public Parrot(String taxonomy, String blood_type, String birth_way, int no_of_legs, Boolean fly, Boolean talk) {
        super(taxonomy, blood_type, birth_way, no_of_legs);
        this.fly = fly;
        this.talk = talk;
    }

    public void setFly(Boolean fly) {
        this.fly = fly;
    }

    public void setTalk(Boolean talk) {
        this.talk = talk;
    }

    public Boolean IsFlying() {
        return fly;
    }

    public Boolean IsTalking() {
        return talk;
    }

    @Override
    public void move() {
        System.out.println("it is flying using wings as it belong to the birds family...");
    }

    @Override
    public void PrintDetails() {
        System.out.println("Taxonomy:" + this.getTaxonomy() + "\n"
                + "Bloodtype:" + this.getBlood_type() + "\n"
                + "Birthway:" + this.getBirth_way() + "\n"
                + "NO of legs:" + this.getNo_of_legs() + "\n"
                + "Flying:" + this.IsFlying() + "\n"
                + "Talking:" + this.IsTalking() + "\n");
    }

}

/*----------------------------------------------------------------------------------------------------------------*/
public class asurt_mission {

    public static void main(String[] args) {
        Tiger tig = new Tiger();
        Shark sha = new Shark();
        Parrot par = new Parrot();

        Scanner sc = new Scanner(System.in);
        System.out.println("please choose the animal to see how it moves and its details ?");
        System.out.println("tiger - shark - parrot\n");
        String answer = sc.nextLine();

        switch (answer) {
            case "tiger":
                tig.move();
                tig.PrintDetails();
                break;
            case "shark":
                sha.move();
                sha.PrintDetails();
                break;
            case "parrot":
                par.move();
                par.PrintDetails();
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }

        System.out.println("\n\n");
        Shark sha2 = new Shark("White");
        sha2.PrintDetails();

        System.out.println("\n\n");
        Parrot par2 = new Parrot("Birds", "endothermic", "laying eggs", 0, true, true);
        par2.PrintDetails();
    }
}
