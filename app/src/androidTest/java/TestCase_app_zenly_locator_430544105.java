import android.content.Context;
import android.text.format.DateFormat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_zenly_locator_430544105 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      char[] var1 = DateFormat.getDateFormatOrder((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
