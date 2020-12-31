import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bizsolution_keyboard_1623309782 {
   public static void testCase() throws Exception {
      long var0 = 1L;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(KeyEvent.class);
      MetaKeyKeyListener.handleKeyDown(var0, var2, (KeyEvent)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
