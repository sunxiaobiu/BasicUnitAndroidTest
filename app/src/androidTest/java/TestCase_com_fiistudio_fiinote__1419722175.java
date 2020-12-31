import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote__1419722175 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
