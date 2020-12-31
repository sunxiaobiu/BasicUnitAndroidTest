import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_murad_waktusolat__825652047 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      byte var1 = 1;
      ViewCompat.offsetLeftAndRight((View)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
