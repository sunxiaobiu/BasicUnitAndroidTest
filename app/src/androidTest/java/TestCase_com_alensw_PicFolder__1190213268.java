import android.text.Selection;
import android.text.Spannable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alensw_PicFolder__1190213268 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      int var1 = Selection.getSelectionEnd((CharSequence)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
