import android.text.Selection;
import android.text.Spannable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote_1903617297 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      byte var1 = 1;
      Selection.extendSelection((Spannable)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
