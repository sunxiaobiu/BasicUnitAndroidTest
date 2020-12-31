import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote__1068048282 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      int var1 = MetaKeyKeyListener.getMetaState((CharSequence)var0, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
