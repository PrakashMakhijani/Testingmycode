import java.util.ArrayList;
import java.util.List;

public class Homeapp {


    List<String> names = new ArrayList<>();

    public  boolean addNames(String name) {
        return names.add(name);
    }

    public boolean removeName(String name) {
        return names.remove(name);
    }

    public List<String> getNames() {
        return names;
    }
    //enjoy learning java


}
