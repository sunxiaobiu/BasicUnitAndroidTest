import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace__1356846514 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SpannableStringBuilder.class);
      Selection.setSelection((Spannable)var0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
