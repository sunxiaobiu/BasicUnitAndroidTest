import android.support.v4.view.KeyEventCompat;
import android.view.KeyEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_nth_android_discountapp__1040623781 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(KeyEvent.class);
      boolean var1 = KeyEventCompat.hasModifiers((KeyEvent)var0, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
