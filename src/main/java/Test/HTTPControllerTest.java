package Test;

import org.Task.HTTPController;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;

public class HTTPControllerTest
{
    private HTTPController httpControllerUnderTest;

    @Before
    public void setUp() {
        httpControllerUnderTest = new HTTPController();
    }

    @Test
    public void testInit() throws Exception
    {
        // Setup
        // Run the test
        httpControllerUnderTest.init();

        // Verify the results
    }

    @Test
    public void testInit_ThrowsServletException()
    {
        // Setup
        // Run the test
        assertThrows(ServletException.class, () -> httpControllerUnderTest.init());
    }

    @Test
    public void testDoGet() throws Exception
    {
        // Setup
        final HttpServletResponse mockResponse = mock(HttpServletResponse.class);

        // Run the test
        httpControllerUnderTest.doGet(null, mockResponse);

        // Verify the results
    }

    @Test
    public void testDoGet_ThrowsServletException()
    {
        // Setup
        final HttpServletResponse mockResponse = mock(HttpServletResponse.class);

        // Run the test
        assertThrows(ServletException.class, () -> httpControllerUnderTest.doGet(null, mockResponse));
    }

    @Test
    public void testDoGet_ThrowsIOException()
    {
        // Setup
        final HttpServletResponse mockResponse = mock(HttpServletResponse.class);

        // Run the test
        assertThrows(IOException.class, () -> httpControllerUnderTest.doGet(null, mockResponse));
    }

    @Test
    public void testDestructor()
    {
        // Setup
        // Run the test
        httpControllerUnderTest.destructor();

        // Verify the results
    }
}
