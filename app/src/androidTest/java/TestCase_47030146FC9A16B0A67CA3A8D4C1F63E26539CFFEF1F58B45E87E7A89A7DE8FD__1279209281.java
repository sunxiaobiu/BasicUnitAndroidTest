import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_47030146FC9A16B0A67CA3A8D4C1F63E26539CFFEF1F58B45E87E7A89A7DE8FD__1279209281 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      int var1 = ViewCompat.getMeasuredState((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
