import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class InteractionTest {

    @Test
    public void testVerify() {

        ExternalApi mockApi =

                mock(

                        ExternalApi.class

                );


        MyService service =

                new MyService(

                        mockApi

                );


        service.fetchData();


        verify(

                mockApi

        ).getData();


    }

}