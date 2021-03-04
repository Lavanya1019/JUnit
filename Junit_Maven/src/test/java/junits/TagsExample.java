package junits;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagsExample {
    @Test
@Tag("tag1")
    public void junit1(){

}
    @Test
    @Tag("tag2")
    public void junit2(){

    }
    @Test
    @Tag("tag3")
    public void junit3(){

    }
}


