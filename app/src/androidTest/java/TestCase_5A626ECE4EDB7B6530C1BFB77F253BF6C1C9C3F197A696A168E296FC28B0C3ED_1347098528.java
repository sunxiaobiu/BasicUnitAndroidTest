import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.format.DateUtils;
import androidx.test.runner.AndroidJUnit4;
import java.util.Formatter;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED_1347098528 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(FragmentActivity.class);
      Object var1 = null;
      long var2 = 1L;
      DateUtils.formatDateRange((Context)var0, (Formatter)var1, var2, var2, 52);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
