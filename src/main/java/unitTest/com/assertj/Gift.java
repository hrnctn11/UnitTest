package unitTest.com.assertj;

import lombok.*;

/**
 * Created by Harun on 23.04.2019.
 */
//Sadece dependenc eklemekle çalışmaz.Lombok için pluginde eklemelisin

//@Getter
//@Setter
//@ToString bunların hepsini kapsayan @Data
@Data
@AllArgsConstructor//bütün parametrelerin olduğu constructor oluştu.
@NoArgsConstructor //parametresiz constructor
public class Gift {

    private String name;

}
