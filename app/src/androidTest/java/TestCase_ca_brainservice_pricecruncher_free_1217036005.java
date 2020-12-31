import android.text.method.TextKeyListener;
import android.text.method.TextKeyListener.Capitalize;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_brainservice_pricecruncher_free_1217036005 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Capitalize.class);
      TextKeyListener var1 = TextKeyListener.getInstance(true, (Capitalize)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
