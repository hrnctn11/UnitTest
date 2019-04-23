package unitTest.com.assertj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Harun on 23.04.2019.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GiftBuilder {

    private String name;
    private String surname;
}
