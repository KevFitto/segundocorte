package Interface;

import java.util.ArrayList;

public interface Operation {
    public void create(Object object);

    public ArrayList<Object> read();

    public void update(Object object);

    public void delete(String id);

    public Object search(String value);

}