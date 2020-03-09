package example;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.mockito.Mockito.doReturn;
import static org.testng.Assert.*;

@SpringBootTest
@TestExecutionListeners(MockitoTestExecutionListener.class)
public class SomeServiceTest extends AbstractTestNGSpringContextTests {
    @SpyBean SomeService someService;

    @Test
    public void testCacheable() {
        doReturn( "yes" ).when( someService ).cacheableMethod();
        assertEquals( someService.cacheableMethod(), "yes" );
    }

    @Test
    public void testNormal() {
        doReturn( "yes" ).when( someService ).normalMethod();
        assertEquals( someService.normalMethod(), "yes" );
    }
}
