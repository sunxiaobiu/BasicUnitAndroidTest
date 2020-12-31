import android.text.Selection;
import android.text.Spannable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__1919204034 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      Selection.selectAll((Spannable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
