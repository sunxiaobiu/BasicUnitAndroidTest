import android.content.Context;
import android.text.format.DateUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A66192E4508E0052850DDCA7EC71CF7151DEDA799F82D65D74853E920499E69_1613841546 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      long var1 = 1L;
      DateUtils.getRelativeTimeSpanString((Context)var0, var1, true);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
