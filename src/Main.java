import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {
        /*
    }
        ArrayList <String> names=new ArrayList<String>();
        names.add(0,"pine");
        names.add(1, "maple");
        names.add(2, "fraiser fir");
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get(1));
        */
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ben");
        names.add("Andy");
        names.add("David");
        String[] moreNames = {"Crystal", "Monica", "Toby", "Nancy"};
        int namesAmt = names.size();
        int moreNamesAmt = moreNames.length;
        int thirdNameLength = names.get(2).length();
        int secondNameLength = moreNames[1].length();
        int lengths = namesAmt + moreNamesAmt + thirdNameLength + secondNameLength;
        System.out.println(lengths); // should print 18

    }
}
