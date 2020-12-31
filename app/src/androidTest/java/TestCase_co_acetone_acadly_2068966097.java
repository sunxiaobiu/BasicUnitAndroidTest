import android.text.Selection;
import android.text.Spannable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_co_acetone_acadly_2068966097 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      byte var1 = 1;
      byte var2 = 1;
      Selection.setSelection((Spannable)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
