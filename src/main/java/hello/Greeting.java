package hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by agup101 on 4/21/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
    private String content;
}
