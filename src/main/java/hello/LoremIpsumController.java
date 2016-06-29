package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoremIpsumController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/loremipsum")
    public LoremIpsum greeting(@RequestParam(value="len", defaultValue="1311") long len) {
        return new LoremIpsum(counter.incrementAndGet(), len);
    }
}
