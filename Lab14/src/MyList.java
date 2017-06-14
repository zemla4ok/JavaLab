
import java.util.ArrayList;

public class MyList  extends ArrayList<Message>{
    public MyList(){
        this.add(new Message(1, "lol"));
        this.add(new Message(2, "kek"));
        this.add(new Message(3, "zek"));
        this.add(new Message(4, "zeze"));
        this.add(new Message(5, "heh"));
    }

    @Override
    public String toString(){
        String str = "";
        for(Message m: this){
            str += m;
        }
        return str;
    }
}

