import android.text.Editable;
import android.text.Spannable;
import android.text.method.QwertyKeyListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appxy_tinycalendar_1721964726 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Editable.class);
      byte var1 = 1;
      byte var2 = 1;
      QwertyKeyListener.markAsReplaced((Spannable)var0, var1, var2, "");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
