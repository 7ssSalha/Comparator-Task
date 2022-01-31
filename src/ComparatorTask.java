import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Item{
    public int number;
    public int dup;

    public Item(int number,int dup){
        this.number = number;
        this.dup = dup;
    }

    @Override
    public boolean equals(Object obj) {
        Item item = (Item) obj;
        return this.number == item.number && this.dup == item.dup;
    }
}

class CompareItems implements Comparator<Item>{

    @Override
    public int compare(Item o1, Item o2) {
        if(o1.dup > o2.dup){
            return -1;
        }
        else if(o1.dup < o2.dup){
            return 1;
        }
        else{
            if(o1.number > o2.number){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
}


public class ComparatorTask {

    public static void main(String [] args){
//        int [] arr = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        int [] arr = {4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5};
        ArrayList <Item> Items = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            Item item = new Item(arr[i],count);
            if(!Items.contains(item)){
                Items.add(item);
            }
        }

        Collections.sort(Items,new CompareItems());

        for (Item item : Items) {
//            System.out.println(item.number+" : "+ item.dup);
            for (int i=0;i< item.dup;i++){
                System.out.print(item.number+" ");
            }
        }
    }
}
