import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.Margins;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aikidotest_russiangermanctionary_1959160138 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(Margins.class);
      var2.setMinMargins((Margins)var1);
   }
}
