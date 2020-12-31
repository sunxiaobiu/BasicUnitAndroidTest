import android.text.method.MetaKeyKeyListener;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bizsolution_keyboard__764736579 {
   public static void testCase() throws Exception {
      long var0 = 1L;
      var0 = MetaKeyKeyListener.adjustMetaAfterKeypress(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
