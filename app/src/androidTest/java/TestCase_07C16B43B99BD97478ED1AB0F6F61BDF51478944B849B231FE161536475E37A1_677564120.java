import android.graphics.Typeface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1_677564120 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Typeface.class);
      byte var1 = 1;
      boolean var2 = true;
      Typeface.create((Typeface)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
