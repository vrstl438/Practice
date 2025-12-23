package Complex_Tasks.Task_4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Product {
    private String name;
    private int count;
    private Integer price;

    public Product(String name){
        this.name = name;
    }
}
