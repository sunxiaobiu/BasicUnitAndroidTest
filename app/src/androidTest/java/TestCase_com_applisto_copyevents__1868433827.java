import android.content.Context;
import android.text.format.DateUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_applisto_copyevents__1868433827 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      long var1 = 1L;
      long var3 = 1L;
      DateUtils.formatDateRange((Context)var0, var1, var3, 21);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
