import static org.junit.jupiter.api.Assertions.*;

class sentinelLinearSearchTest {

    @org.junit.jupiter.api.Test
    void sentinelSearch() {
        sentinelLinearSearch sls = new sentinelLinearSearch();
        assertEquals(-1,1, sls.sentinelSearch(1));
        assertEquals(1,1, sls.sentinelSearch(3));
        assertEquals(5,5, sls.sentinelSearch(26));
        assertEquals(0,0, sls.sentinelSearch(2));
    }
}