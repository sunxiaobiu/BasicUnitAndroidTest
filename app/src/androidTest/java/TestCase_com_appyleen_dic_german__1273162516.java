import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appyleen_dic_german__1273162516 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Editable.class);
      Object var1 = EasyMock.createMock(Layout.class);
      Selection.moveToRightEdge((Spannable)var0, (Layout)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
