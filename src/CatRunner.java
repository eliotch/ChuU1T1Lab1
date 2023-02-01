import java.util.ArrayList;
public class CatRunner {
    public static void main(String args[]){
        ArrayList<Cat> cat=new ArrayList<>();
        Cat cat1=new Cat("pickles");
        Cat cat2=new Cat("idiot");
        Cat cat3=new Cat("salmon");
        cat.add(cat1);
        cat.add(cat2);
        cat.add(cat3);
        System.out.println(cat.toString());
        Cat cat4=new Cat("corn");
        Cat a=cat.set(2, cat4);
        System.out.println(cat);
        System.out.println(a);
        cat4.setName(cat4.getName()+" Meow");
        System.out.println(cat);
        for(int i=0; i<cat.size();i++){
            cat.get(i).setName(cat.get(i).getName().toUpperCase());
        }
        System.out.println(cat);

    }
}
