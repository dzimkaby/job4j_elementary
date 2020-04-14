package ru.job4j.condition;
    import org.junit.Test;
    import static org.hamcrest.Matchers.is;
    import static org.junit.Assert.assertThat;
public class MultimaxTest {
    @Test
    public void whenSecondMax() {
        Multimax check = new Multimax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        Multimax check = new Multimax();
        int result = check.max(5, 2, 1);
        assertThat(result, is(5));
    }
    @Test
    public void whenThirdMax() {
        Multimax check = new Multimax();
        int result = check.max(1, 2, 7);
        assertThat(result, is(7));
    }
    @Test
    public void whenNoMax() {
        Multimax check = new Multimax();
        int result = check.max(1, 1, 1);
        assertThat(result, is(1));
    }
}
