package example;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    @Cacheable("someCache")
    public String cacheableMethod() {
        return "not";
    }

    public String normalMethod() {
        return "not";
    }
}
