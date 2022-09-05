import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

public class T2 {
    @Test
    public void testTime() {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt); //2022-09-03T19:25:23.002455200+08:00[Asia/Shanghai]
    }
}
