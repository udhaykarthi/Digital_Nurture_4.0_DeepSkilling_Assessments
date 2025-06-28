package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppTest { 

    @Test
    public void testApi() {
        Api mockApi = mock(Api.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        Service service = new Service(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
