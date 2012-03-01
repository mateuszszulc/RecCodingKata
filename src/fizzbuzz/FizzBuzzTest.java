import fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: wro00070
 * Date: 28.02.12
 * Time: 16:46
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzTest {

    @Test
    public void FizzBuzz_Given_1_ShouldReturn_1()
    {
        //arrange
        FizzBuzz cut= new FizzBuzz();
        //act
        String result=cut.parse(1);
        //assert
        Assert.assertEquals("1",result);
    }

    @Test
    public void FizzBuzz_Given_2_ShouldReturn_2()
    {
        //arrange
        FizzBuzz cut= new FizzBuzz();
        //act
        String result= cut.parse(2);
        //assert
        Assert.assertEquals("2", result);
    }

    @Test
    public void FizzBuzz_Given_3_ShouldReturn_Fizz(){
        //arrange
        FizzBuzz cut = new FizzBuzz();
        //act
        String result = cut.parse(3);
        //assert
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void FizzBuzz_Given_4_ShouldReturn_4() {
        //arrange
        FizzBuzz cut = new FizzBuzz();
        //act
        String result = cut.parse(4);
        //assert
        Assert.assertEquals("4",result);
    }

    @Test
    public void FizzBuzz_Given_5_ShouldReturn_5() {
        //arrange
        FizzBuzz cut = new FizzBuzz();
        //act
        String result = cut.parse(5);
        //assert
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void FizzBuzz_Given_9_ShouldReturn_Fizz() {
        //arrange
        FizzBuzz cut = new FizzBuzz();
        //act
        String result = cut.parse(9);
        //assert
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void FizzBuzz_Given_10_ShouldReturn_Fizz() {
        //arrange
        FizzBuzz cut = new FizzBuzz();
        //act
        String result = cut.parse(10);
        //assert
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void FizzBuzz_Given_15_ShouldReturn_FizzBuzz() {
        //arrange
        FizzBuzz cut = new FizzBuzz();
        //act
        String result = cut.parse(15);
        //assert
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test
    public void FizzBuzz_Given_0_Should_return_0() throws Exception {
        FizzBuzz cut = new FizzBuzz();
        String returnValue = cut.parse(0);
        Assert.assertEquals("0", returnValue);
    }

    @Test()
    public void FizzBuzz_Given_Negative1_Should_ThrowIllegalArgumentException() {
        //arrange
        FizzBuzz cut = new FizzBuzz();
        //act
        try{
            cut.parse(-1);
            //assert
            Assert.fail("No exception thrown");
        }catch(IllegalArgumentException e){
            Assert.assertTrue(true);
        }catch (Exception e){
            Assert.fail("Wrong exception thrown");
        }
    }
}
