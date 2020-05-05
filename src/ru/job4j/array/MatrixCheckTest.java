package ru.job4j.array;

    import org.junit.Test;
    import static org.hamcrest.core.Is.is;
    import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = new char[4][2];
        input[0][0] = ' ';
        input[0][1] = ' ';
        input[1][0] = 'x';
        input[1][1] = 'x';
        input[2][0] = ' ';
        input[2][1] = ' ';
        input[3][0] = ' ';
        input[3][1] = ' ';
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

   @Test
   public void whenHasMonoVertical() {
       char[][] input = new char[2][4];
       input[0][0] = ' ';
       input[0][1] = ' ';
       input[0][2] = ' ';
       input[0][3] = ' ';
       input[1][0] = ' ';
       input[1][1] = 'x';
       input[1][2] = ' ';
       input[1][3] = ' ';
       boolean result = MatrixCheck.monoVertical(input, 1);
       assertThat(result, is(false));
   }
   }